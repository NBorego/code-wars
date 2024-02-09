fun gps(s: Int, x: DoubleArray): Int {
  if (x.size <= 1) return 0

  var speed: DoubleArray = doubleArrayOf()

  for (i in 0..x.size - 1) {
    if (i == x.size - 1) break

    speed += Math.abs(3600 * (x[i] - x[i - 1]) / s)
  }

  return speed.max().toInt()
}

fun main() {
  println(gps(15, doubleArrayOf(0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25)))
}
