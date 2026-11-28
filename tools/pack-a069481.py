"""Pack structural records for the A069481 Java checker (not OEIS terms)."""

import argparse
import gzip
import io
from pathlib import Path
import re
import tarfile

IMF_RECORDS = (
    "ImfNative7Structure.txt",
    "ImfNativeScreenStructure.txt",
    "ImfNativeTypesStructure.txt",
    "ImfNativeSimplexSeeds.txt",
    "NativeFrontierTriangleNormalizers.txt",
    "NativeFrontierUnitaryNormalizers.txt",
    "NativeFrontierBlockQuotients.txt",
    "NativeFrontierBlocks.txt",
    "NativeFrontierLastBlocks.txt",
    "NativeFrontierG23Restriction.txt",
    "NativeFrontierPSLCores.txt",
    "NativeFrontierClasses.txt",
    "NativeFrontierMore.txt",
    "NativeFrontierLastWhole.txt",
    "NativeFrontierJankoFast.txt",
    "NativeG23Normalizer.txt",
    "NativeTorus16FullInputs.txt",
    "NativeWeylE8Classes.txt",
    "LeechMasses.txt",
    "NativeSylow16Inputs.txt",
    "NativeSylow20Inputs.txt",
)

CARAT_MEMBER = re.compile(
    r"qcatalog/dim([1-6])/dir\.\1(?:-\d+)*/ordnung\.(\d+)/[^/]+/(?:max|min|group)\.\d+"
)


def pack_carat(path):
    """Keep every generator record, ignoring original maximality labels."""
    out = io.BytesIO()
    counts = [0] * 6
    with tarfile.open(path, "r:gz") as source, tarfile.open(
        fileobj=out, mode="w", format=tarfile.USTAR_FORMAT
    ) as target:
        for member in source:
            match = CARAT_MEMBER.fullmatch(member.name)
            if not match:
                continue
            n, order = map(int, match.groups())
            if not member.isfile():
                raise ValueError(member.name)
            with source.extractfile(member) as stream:
                data = stream.read()
            counts[n - 1] += 1
            record = tarfile.TarInfo(
                f"qcatalog/dim{n}/dir.{n}/ordnung.{order}/classes/group.{counts[n - 1]}"
            )
            record.size = len(data)
            record.mode = 0o644
            target.addfile(record, io.BytesIO(data))
    if 0 in counts:
        raise ValueError(f"missing CARAT records: {counts}")
    print("CARAT records by dimension:", *counts)
    return out.getvalue()


def pack_imf(directory, leech):
    """Drop GAP's informational messages; keep the structural record bodies."""
    out = io.BytesIO()
    for name in IMF_RECORDS:
        path = leech if name == "LeechMasses.txt" else directory / name
        data = path.read_bytes().replace(b"\r\n", b"\n")
        lines = [line.rstrip() for line in data.split(b"\n") if not line.startswith(b"#I")]
        if any(line.startswith(b"@@ ") for line in lines):
            raise ValueError(f"unexpected record separator in {name}")
        out.write(f"@@ {name}\n".encode("ascii"))
        out.write(b"\n".join(lines).strip(b"\n") + b"\n")
    return out.getvalue()


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("records", type=Path)
    parser.add_argument("resources", type=Path)
    parser.add_argument("--leech", type=Path, required=True, help="output of a069481-leech.py")
    args = parser.parse_args()
    data = {
        "a069481-carat.dat.gz": pack_carat(args.records / "qcatalog.tar.gz"),
        "a069481-imf.dat.gz": pack_imf(args.records, args.leech),
    }
    for name, content in data.items():
        with (args.resources / name).open("wb") as raw:
            with gzip.GzipFile(filename="", fileobj=raw, mode="wb", mtime=0) as stream:
                stream.write(content)


if __name__ == "__main__":
    main()
