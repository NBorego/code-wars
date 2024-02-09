fun partlist(arr: Array<String>): Array<Array<String> {
  var result: Array<Array<String>> = arrayOf()

  for (i in 0..arr.size - 2) {
    var arrCopy: Array<String> = arr.filterIndexed { index, v -> index > i }.toTypedArray()

    var valueArr = arr.take(i + 1).toTypedArray()

    result += arrayOf(valueArr.joinToString(" "), arrCopy.joinToString(" "))
  }

  return result
}

fun main() {
  println(partlist(arrayOf<String>("cdIw", "tzIy", "xDu", "rThG")))
}

// fun partlist(arr: Array<String>): Array<Array<String>> {
//     return (1 until arr.size).map {
//         arrayOf(arr.take(it).joinToString(" "), arr.drop(it).joinToString(" "))
//     }.toTypedArray()
// }
