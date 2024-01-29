fun century(number: Int): Int {
  return if (number % 100 == 0) number / 100 else number / 100 + 1
}

fun main() {
  println(century(1901))
}
