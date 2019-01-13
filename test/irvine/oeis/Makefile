#!/usr/bin/make -f
#
# Download and update the test vectors.
#
SHELL=/bin/bash

all: seq/0 seq/10 seq/100

seq/0: stripped.gz
	mkdir -p seq
	echo "#Unused zeroth sequence" >seq/0
	zgrep "^A000" <$< | sed 's/^A[0-9]* ,//' >>seq/0
	for ((n=1;n<10;n++)); do zgrep "^A00$$n" <$< | sed 's/^A[0-9]* ,//' >seq/$$n; done

seq/10: stripped.gz
	for ((n=10;n<100;n++)); do zgrep "^A0$$n" <$< | sed 's/^A[0-9]* ,//' >seq/$$n; done

seq/100: stripped.gz
	# 330[000] is above current number of sequences in OEIS as of 2018
	# Sometimes later sequences can be missing if the sequence is not yet submitted
	# We need to detect this and put in placeholders
	for ((n=100;n<330;n++)); do zgrep "^A$$n" <$< | sed 's/^A//' | awk -vn=$$n '{while (NR-1!=$$1%1000) {print n""(NR-1)" ,"0; NR=NR+1}; print}' | sed 's/^[0-9]* ,//' >seq/$$n; done

stripped.gz:
	wget http://oeis.org/stripped.gz

clean:
	/bin/rm -f stripped.gz
