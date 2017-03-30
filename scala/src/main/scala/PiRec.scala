import scala.util.Random
import scala.annotation.tailrec

object PiRec {

  @inline
  @tailrec
  def numOut(r: Random, n: Int, out: Int): Int = {
    if(n > 0) {
      val x = r.nextDouble() * 2 - 1
      val y = r.nextDouble() * 2 - 1
      if(Math.sqrt(x*x + y*y) > 1) {
        return numOut(r, n - 1, out + 1)
      } else {
        return numOut(r, n - 1, out)
      }
    } else {
      return out
    }
  }

  def main(args: Array[String]): Unit = {
    val n = 10000000
    val r = new Random(42)

    var out = numOut(r, n, 0)

    val pi = (n-out) * 4.0 / n
    println(pi)
  }
}
