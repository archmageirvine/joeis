#!/bin/bash
#
# Fix names of sequences in comments to match actual sequence number.

find . -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | while read file; do
    a=${file##*/}
    a=${a%.java}
    if ! grep -q "\* ${a}\." "${file}"; then
        echo "Comment mismatch: ${file} (attempting fix)"
        sed "s/ \* A[0-9][0-9][0-9][0-9][0-9][0-9]\./ \* ${a}\./" <"${file}" >"${file}.t" && mv "${file}.t" "${file}"
    fi
done
