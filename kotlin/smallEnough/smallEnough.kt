fun smallEnough(a: IntArray, limit: Int): Boolean {
  for (number in a) {
    if (number > limit) return false
  }

  return true
}

fun main() {
  println(smallEnough(intArrayOf(201, 66, 101), 200))
}
