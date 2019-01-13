#!/bin/bash
#
# Construct the list of dead A numbers.
# NB n>100 does not achieve anything, hence this does blocks of 100.

start=0
while :; do
    wget -O ${start}.raw -c -T 10 "http://oeis.org/search?q=keyword%3adead&fmt=data&sort=number&n=100&start=${start}"
    res=$(<${start}.raw grep 'results found' | gawk '{print $(NF-2)}')
    start=$((start+100))
    if [ ${start} -gt "${res}" ]; then
        break
    fi
done
cat ./*.raw | grep '<a href="/\(A[0-9]\{6\}\)">\1</a>' | sed 's/<[^>]*>//g' | tr -d ' ' | sort | uniq >dead.lst
echo "Total number of dead sequences: $(wc -l <dead.lst)"
/bin/rm -f ./*.raw
