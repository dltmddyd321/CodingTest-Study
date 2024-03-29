class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        fun isPrime(number: Int): Boolean {
            if (number <= 1) {
                return false
            }

            for (i in 2 until number) {
                if (number % i == 0) {
                    return false
                }
            }

            return true
        }

        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer ++
                }
            }
        }

        return answer
    }
}