class Solution {
    fun solution(babbling: Array<String>): Int {
//         val availableWords = arrayOf("aya", "ye", "woo", "ma")

//         fun isEnableSentence(sentence: String): Boolean {
//             for (word in availableWords) {
//                 sentence.replace(word, "")
//             }
//             return sentence.isEmpty()
//         }
//         var answer = 0
//         babbling.forEach {
//             if (isEnableSentence(it)) answer ++
//         }
//         return answer
        
        var answer: Int = 0

        for (i in babbling.indices) {
            if (babbling[i].contains("ayaaya") ||
                babbling[i].contains("yeye") ||
                babbling[i].contains("woowoo") ||
                babbling[i].contains("mama")
            ) { //연속해서 같은 발음을 못함;
                continue
            }
            babbling[i] = babbling[i].replace("aya", " ")
            babbling[i] = babbling[i].replace("ye", " ")
            babbling[i] = babbling[i].replace("woo", " ")
            babbling[i] = babbling[i].replace("ma", " ")
            babbling[i] = babbling[i].replace(" ", "")

            if (babbling[i].isEmpty()) answer++
        }
        return answer
    }
}