import scala.util.Random

object PiFor {

  def main(args: Array[String]): Unit = {
    val n = 10000000
    val r = new Random(42)

    var out = 0

    (0 to n) foreach { _ =>
      val y = r.nextDouble() * 2 - 1
      val x = r.nextDouble() * 2 - 1
      if(Math.sqrt(x*x + y*y) > 1) {
        out += 1
      }
    }

    val pi = (n-out) * 4.0 / n

    println(pi)
  }
}
