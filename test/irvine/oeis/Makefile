#!/usr/bin/make -f
#
# Download and update the test vectors.
#
SHELL=/bin/bash

all: seq/000

seq/000: stripped.gz
	# 400[000] is above current number of sequences in OEIS as of 2024
	mkdir -p seq
	for n in {000..400}; do echo "Expanding block a$$n"; zgrep "^A$$n" <$< | sed 's/^A//' | awk -vn=$$n '{while (NR-1!=$$1%1000) {print n""(NR-1)" ,"0; NR=NR+1}; print}' | sed 's/^[0-9]* ,//' >seq/$$n; done

stripped.gz:
	wget --quiet http://oeis.org/stripped.gz

clean:
	/bin/rm -f stripped.gz
