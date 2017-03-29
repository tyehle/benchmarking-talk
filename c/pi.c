#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
  int n = 10000000;

  int out = 0;

  srand(42);

  for(int i = 0; i < n; i++) {
    double x = (rand() / (double)RAND_MAX) * 2 - 1;
    double y = (rand() / (double)RAND_MAX) * 2 - 1;
    double test = sqrt(x*x + y*y);
    if(test > 1) {
      out += 1;
    }
  }

  double pi = (n-out) * 4.0 / n;

  printf("%f\n", pi);
}
