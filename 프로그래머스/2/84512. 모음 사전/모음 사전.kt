class Solution {
    fun solution(word: String): Int {
        val vowels = listOf('A', 'E', 'I', 'O', 'U')
        val result = mutableListOf<String>()

        fun backtrack(currentWord: String) {
            if (currentWord.length <= 5) {
                if (currentWord.isNotEmpty()) {
                    result.add(currentWord)
                }
                for (vowel in vowels) {
                    backtrack(currentWord + vowel)
                }
            }
        }
        backtrack("")

        return result.indexOf(word) + 1
    }
}