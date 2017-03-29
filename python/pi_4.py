""" Demo code to compute an approximation of pi """

from math import sqrt, pow
import random

def main():
    n = 10000000

    random.seed(42)

    out = sum(1 if sqrt((random.random()*2 - 1)**2 + (random.random()*2 - 1)**2) > 1 else 0 for _ in range(n))

    pi = (n-out) / n * 4

    print(pi)

if __name__ == "__main__":
    main()
