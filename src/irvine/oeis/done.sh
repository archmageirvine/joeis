#!/bin/bash
#
# Plot a graph of the proportion of sequences done in each bucket of 1000.
# Also produce a heat map with one pixel per sequence showing those implemented.

max=350

for bucket in $(seq 0 ${max}); do
    b="00${bucket}"
    b=${b: -3}
    dead=$(grep -c "^A${b}" dead.lst)
    if [[ -d a${b} ]]; then
        impl=$(find "a${b}" -name "A${b}???.java" | wc -l)
    else
        impl=0
    fi
    echo "${b} $((impl+dead))"
done >oeis_done.dat

gnuplot <<EOF
   set term pngcairo size 900,500
   set output "oeis-done.png"
   set xlabel "Sequence Bin"
   set ylabel "Implemented"
   set tics out
   set title "Implemented OEIS Sequences (bins of 1000 sequences)"
   plot "oeis_done.dat" using 1:2 with impulses title "Total Implemented"
EOF

# A heat map view showing red for dead sequences and green for implmented
{
    sed 's/^A0*//' <dead.lst | while read dead; do
        echo "$((dead/1000)) $((dead%1000)) r"
    done
    for bucket in $(seq 0 ${max}); do
        b="00${bucket}"
        b=${b: -3}
        if [[ -d a${b} ]]; then
            find "a${b}" -name "A${b}???.java" | sed 's/.*A0*//;s/\.java//' | while read impl; do
                echo "${impl}"
                echo "$((impl/1000)) $((impl%1000)) g"
            done
        fi
    done
} | awk -vmax=${max} '{pix[$1,$2]=$3}END{print "P6 1000 "max" 1"; for (y=0;y<max;y++) for(x=0; x<1000;x++) {val=pix[y,x]; if (val=="r") {printf "%c%c%c", 1, 0, 0} else if (val=="g") {printf "%c%c%c", 0, 1, 0} else {printf "%c%c%c", 0, 0, 0 }}}' | pnmtopng >oeis-implemented.png

mv *.png ../../../doc
