#!/bin/bash

declare -a programs=("./c/gnu-default" "./c/gnu-1" "./c/gnu-2" "./c/gnu-3" "./c/gnu-4"
                     "./c/clang-default" "./c/clang-1" "./c/clang-2" "./c/clang-3"
                     "java -cp java Pi"
                     "python3 python/pi_1.py" "python3 python/pi_2.py" "python3 python/pi_3.py" "python3 python/pi_4.py"
                     "pypy3 python/pi_1.py" "pypy3 python/pi_2.py" "pypy3 python/pi_3.py" "pypy3 python/pi_4.py"
                     "java -jar scala/pi-for.jar" "java -jar scala/pi-rec.jar" "java -jar scala/pi-while.jar"
                     "scala -cp scala PiFor" "scala -cp scala PiRec" "scala -cp scala PiWhile")

output=times
n=3

rm -f $output

echo "Doing $n repetitions"

for prog in "${programs[@]}"; do
  # echo "$prog"
  /usr/bin/time --format='%C\t%e' $prog 1>/dev/null # do a dry run first
  for ((i=1;i<=n;i++)); do
    /usr/bin/time --append --output=$output --format='%C\t%e' $prog 1>/dev/null
  done
done
