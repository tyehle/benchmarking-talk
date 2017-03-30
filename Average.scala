import java.io.{BufferedWriter, FileWriter}

import scala.io.Source

object Average {
  def main(args: Array[String]): Unit = {
    val lines = Source.fromFile("data.tsv").getLines()
    val grouped = lines.map(_.split('\t')).toList.groupBy(_(0)).mapValues(vs => vs.map(_(1).toDouble))
    val averaged = grouped.mapValues(vs => vs.sum / vs.length)

    val writer = new BufferedWriter(new FileWriter("averages.tsv"))

    writer.write("Program\tAvg\tStdDev\n")

    grouped.keys.toList.sorted.foreach { key =>
      val mean = averaged(key)
      val sqDiffs = grouped(key).map(_ - mean).map(x => x*x)
      val stdDev = math.sqrt(sqDiffs.sum / sqDiffs.length)

      writer.write(s"$key\t$mean\t$stdDev\n")
    }

    writer.close()
  }
}
