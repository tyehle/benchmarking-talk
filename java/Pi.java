import java.util.Random;

class Pi {
  public static void main(String[] args) {
    int n = 10000000;

    int out = 0;

    Random r = new Random(42);

    for(int i = 0; i < n; i++) {
      double x = r.nextDouble() * 2 - 1;
      double y = r.nextDouble() * 2 - 1;
      if(Math.sqrt(x*x + y*y) > 1) {
        out += 1;
      }
    }

    double pi = (n-out) * 4.0 / n;

    System.out.println(pi);
  }
}
