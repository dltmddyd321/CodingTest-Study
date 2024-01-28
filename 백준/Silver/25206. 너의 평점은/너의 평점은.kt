import java.util.*

fun main() = with(Scanner(System.`in`)) {

    fun parseGradeToScore(grade: String): Double {
        return when (grade) {
            "A+" -> {
                4.5
            }
            "A0" -> {
                4.0
            }
            "B+" -> {
                3.5
            }
            "B0" -> {
                3.0
            }
            "C+" -> {
                2.5
            }
            "C0" -> {
                2.0
            }
            "D+" -> {
                1.5
            }
            "D0" -> {
                1.0
            }
            "F" -> {
                0.0
            }
            else -> {
                -1.0
            }
        }
    }

    var sum = 0.0
    var sumScore = 0.0
    for (i in 0..19) {
        val subject = next()
        val score = nextDouble()
        val grade = next()
        val parsedGrade = parseGradeToScore(grade)
        if (parsedGrade != -1.0) {
            sum += parsedGrade * score
            sumScore += score
        }
    }
    println(sum / sumScore)
}