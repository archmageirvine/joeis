"""Derive the degree-24 rational character's spectra from CTblLib's 2.Co1."""

import argparse
from collections import Counter
from math import gcd
from pathlib import Path
import tarfile


def split_fields(source, terminator):
    """Split a GAP table's literal fields, respecting nested syntax."""
    stack = []
    start = 0
    quote = False
    escaped = False
    out = []
    for i, c in enumerate(source):
        if quote:
            if escaped:
                escaped = False
            elif c == "\\":
                escaped = True
            elif c == '"':
                quote = False
        elif c == '"':
            quote = True
        elif c in "([{":
            stack.append(")]}"["([{".index(c)])
        elif c in ")]}":
            if not stack and c == terminator:
                return out + [source[start:i].strip()]
            if not stack or c != stack.pop():
                raise ValueError("unbalanced table record")
        elif c == "," and not stack:
            out.append(source[start:i].strip())
            start = i + 1
    raise ValueError("truncated table record")


def array(source):
    if not source.startswith("["):
        raise ValueError("expected an array")
    return split_fields(source[1:], "]")


def quotient(a, b):
    """Exact quotient of ascending integer polynomials by a monic divisor."""
    if len(a) < len(b):
        return None
    a = list(a)
    q = [0] * (len(a) - len(b) + 1)
    for i in reversed(range(len(q))):
        q[i] = a[i + len(b) - 1]
        for j, c in enumerate(b):
            a[i + j] -= q[i] * c
    return None if any(a) else q


def cyclotomics(degree, group_order):
    result = {}
    # If Phi_n occurs, phi(n)^2 >= n/2 and n divides the group order.
    for n in range(1, 2 * degree * degree + 1):
        if group_order % n or sum(gcd(n, k) == 1 for k in range(1, n + 1)) > degree:
            continue
        poly = [-1] + [0] * (n - 1) + [1]
        for d, factor in result.items():
            if n % d == 0:
                poly = quotient(poly, factor)
                if poly is None:
                    raise ValueError("inexact cyclotomic division")
        result[n] = poly
    return result


def table(archive):
    with tarfile.open(archive) as source:
        for member in source:
            if member.isfile() and member.name.endswith("/data/ctoconja.tbl"):
                with source.extractfile(member) as stream:
                    return stream.read().decode("latin-1")
    raise ValueError("cannot find CTblLib's 2.Co1 table")


def call(source, prefix):
    start = source.index(prefix) + prefix.index("(") + 1
    return split_fields(source[start:], ")")


def cover_character(source, degree, size):
    # CTblLib stores the faithful characters on Co1 and the quotient
    # class map 2.Co1 -> Co1. Its double-cover convention uses the
    # listed character value on the first lift and its negative on
    # the second. A single lift is fixed by the centre, so has trace 0.
    fusion = list(map(int, array(call(source, 'ALF("2.Co1","Co1"')[2])))
    projectives = array(call(source, 'ARC("Co1","projectives"')[2])
    if projectives[0] != '"2.Co1"' or len(fusion) != size or fusion != sorted(fusion):
        raise ValueError("unexpected double-cover data")
    rows = [array(s) for s in array(projectives[1])]
    chars = [list(map(int, row)) for row in rows if row[0] == str(degree)]
    if len(chars) != 1 or max(fusion) != len(chars[0]):
        raise ValueError("cannot identify the unique degree-24 character")
    counts = Counter(fusion)
    if any(c not in (1, 2) for c in counts.values()):
        raise ValueError("invalid class fusion")
    result = []
    last = 0
    for c in fusion:
        value = chars[0][c - 1]
        if counts[c] == 1 and value:
            raise ValueError("nonzero faithful trace on an unsplit class")
        result.append(-value if last == c else value)
        last = c
    if result[:2] != [degree, -degree]:
        raise ValueError("incorrect central character")
    return result


def spectra(archive):
    degree = 24
    source = table(archive)
    fields = call(source, 'MOT("2.Co1"')
    centralizers = list(map(int, array(fields[2])))
    order = centralizers[0]
    power = [None if not p else list(map(int, array(p))) for p in array(fields[3])]
    character = cover_character(source, degree, len(centralizers))
    cyclo = cyclotomics(degree, order)
    masses = Counter()
    for index, centralizer in enumerate(centralizers):
        traces = [degree]
        for k in range(1, degree + 1):
            j, a = index, k
            for p in range(2, k + 1):
                while a % p == 0:
                    if p <= len(power) and power[p - 1] is not None:
                        j = power[p - 1][j] - 1
                    elif order % p == 0:
                        raise ValueError(f"missing power map for {p}")
                    a //= p
            traces.append(character[j])
        poly = [1]
        for k in range(1, degree + 1):
            coefficient, remainder = divmod(-sum(poly[k - i] * traces[i] for i in range(1, k + 1)), k)
            if remainder:
                raise ValueError("nonintegral characteristic polynomial")
            poly.append(coefficient)
        poly.reverse()
        factors = []
        for d, factor in cyclo.items():
            while (q := quotient(poly, factor)) is not None:
                factors.append(d)
                poly = q
        if poly != [1] or order % centralizer:
            raise ValueError("invalid polynomial or class size")
        masses[tuple(factors)] += order // centralizer
    if sum(masses.values()) != order or masses[(1,) * degree] != 1 or masses[(2,) * degree] != 1:
        raise ValueError("incomplete class census")
    return masses


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("ctbllib", type=Path, help="CTblLib 1.3.11 source archive")
    args = parser.parse_args()
    print("# CTblLib 1.3.11, 2.Co1; cyclotomic indices and class mass times |2.Co1|")
    for factors, size in sorted(spectra(args.ctbllib).items()):
        print(" ".join(map(str, factors)), ":", size)
