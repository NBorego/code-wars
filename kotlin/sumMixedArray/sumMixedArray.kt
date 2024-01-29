fun sum(mixed: List<Any>): Int = mixed.mapNotNull { it.toString().toIntOrNull() }.sum()

fun main() {
  println(sum(listOf(9, 3, "7", "3")))
}
