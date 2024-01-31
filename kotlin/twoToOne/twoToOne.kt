fun longest(s1: String, s2: String): String = (s1 + s2).toSet().sorted().joinToString("")

fun main() {
  val a = "xyaabbbccccdefww"
  val b = "xxxxyyyyabklmopq"
  println(longest(a, b))
}
