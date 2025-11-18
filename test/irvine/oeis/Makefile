#!/usr/bin/make -f
#
# Download and update the test vectors.
#
SHELL=/bin/bash
MAKE_DIR:=$(shell dirname $(realpath $(firstword $(MAKEFILE_LIST))))

all: seq/000

seq/000: stripped.gz
	java -cp $(CLASSPATH) irvine.oeis.Stripped ../../..

stripped.gz:
	wget --quiet http://oeis.org/stripped.gz

clean:
	/bin/rm -f stripped.gz
