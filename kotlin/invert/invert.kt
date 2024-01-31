fun invert(arr: IntArray): IntArray {
  return arr.map { if (it > 0) -Math.abs(it) else Math.abs(it) }.toIntArray()
}

fun main() {
  println(invert(intArrayOf(1, -2, 3, 4, 5)).joinToString())
}
