fun highAndLow(numbers: String): String {
  val splitNumbers: List<Int> = numbers.split(" ").map { it.toInt() }.sorted()

  return "${splitNumbers.last()} ${splitNumbers.first()}"
}

fun main() {
  println(highAndLow("1 2 3 4 5"))
}
