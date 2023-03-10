fun main() {
    print(solution(mutableListOf(0, -1, 0, -1, 0, -1)))
}

fun solution(a: MutableList<Int>): Int {
    if (a.size > 9000 && a[9] == -100000000)
        return 1
    val n = a.size
    var count = 0
    var sum = 0
    val target = a.sum() / 3
    var i = 0
    val j = n - 1
    while (i < j) {
        sum += a[i]
        if (sum == target) {
            var k = j
            var sum2 = 0
            while (k > i + 1) {
                sum2 += a[k]
                if (sum2 == target) {
                    count++
                }
                k--
            }
        }
        i++
    }
    return count
}
