fun partlist(arr: Array<String>): Array<Array<String> {
  var valueArr: Array<String> = arrayOf()
  var result: Array<Array<String>> = arrayOf()

  for (i in 0..arr.size - 2) {
    var arrCopy: Array<String> = arr.filterIndexed { index, v -> index > i }.toTypedArray()

    for (j in 0..i) {
      valueArr += arr[j]
    }

    result += arrayOf(valueArr.joinToString(" "), arrCopy.joinToString(" "))
    valueArr = arrayOf()
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
