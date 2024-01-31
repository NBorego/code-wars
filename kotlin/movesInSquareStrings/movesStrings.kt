object Opstrings {
  fun vertMirror(strng: String): String {
    val str: List<String> = strng.split("\n")

    return str.map { it.reversed() }.joinToString("\n")
  }

  fun horMirror(strng: String): String {
    val str: List<String> = strng.split("\n")

    return str.reversed().joinToString("\n")
  }

  fun oper(operator: (String) -> String, s: String): String {
    return operator(s)
  }
}

fun main() {
  println(Opstrings.oper(Opstrings::horMirror, "abcd\nefgh\nijkl\nmnop"))
}
