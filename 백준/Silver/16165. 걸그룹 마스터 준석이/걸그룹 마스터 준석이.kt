fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val teamToMembers = mutableMapOf<String, MutableList<String>>()
    val memberToTeam = mutableMapOf<String, String>()

    // 걸그룹 정보 입력
    repeat(n) {
        val teamName = readLine()!! // 팀 이름 입력
        val memberCount = readLine()!!.toInt() // 멤버 수 입력
        val members = mutableListOf<String>()

        repeat(memberCount) {
            val memberName = readLine()!! // 멤버 이름 입력
            members.add(memberName)
            memberToTeam[memberName] = teamName // 멤버 -> 팀 매핑 저장
        }

        teamToMembers[teamName] = members // 팀 -> 멤버들 저장
    }

    // 퀴즈 처리
    repeat(m) {
        val query = readLine()!! // 팀 이름이나 멤버 이름이 주어짐
        val quizType = readLine()!!.toInt() // 퀴즈 타입: 0 또는 1

        if (quizType == 0) {
            // 팀 이름이 주어졌을 때, 해당 팀의 멤버를 사전순으로 출력
            val members = teamToMembers[query]!!.sorted()
            for (member in members) {
                println(member)
            }
        } else {
            // 멤버 이름이 주어졌을 때, 해당 멤버가 속한 팀 출력
            println(memberToTeam[query])
        }
    }
}