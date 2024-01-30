fun accum(s: String): String {
  var word: String = ""
  val words: MutableList<String> = mutableListOf()

  for (i in 0..s.length - 1) {
    for (j in 0..i) {
      word += s[i]
    }

    words.add(word.lowercase().replaceFirstChar((Char::titlecase)))
    word = ""
  }

  return words.joinToString("-")
}

// fun accum(s:String):String = s.mapIndexed { index, char -> char.toUpperCase() +
// char.toString().toLowerCase().repeat(index) }.joinToString("-")

fun main() {
  println(accum("abcd"))
}
