""" Demo code to compute an approximation of pi """

from math import sqrt
import random

if __name__ == "__main__":
    n = 10000000

    out = 0

    random.seed(42)

    for _ in range(n):
        x = random.random()*2 - 1
        y = random.random()*2 - 1
        if sqrt(x*x + y*y) > 1:
            out += 1

    pi = (n-out) / n * 4

    print(pi)
