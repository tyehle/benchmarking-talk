all: pi.c
	gcc pi.c -lm -o gnu-default
	gcc pi.c -O1 -lm -o gnu-1
	gcc pi.c -O2 -lm -o gnu-2
	gcc pi.c -O3 -lm -o gnu-3
	gcc pi.c -O4 -lm -o gnu-4
	clang pi.c -lm -o clang-default
	clang pi.c -O1 -lm -o clang-1
	clang pi.c -O2 -lm -o clang-2
	clang pi.c -O3 -lm -o clang-3

clean:
	rm gnu-* -f
	rm clang-* -f
