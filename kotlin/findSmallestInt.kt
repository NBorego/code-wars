fun findSmallestInt(nums: List<Int>): Int = nums.sorted()[0]

fun main() {
    println(findSmallestInt(listOf(34, 15, 88, 2)))
}
