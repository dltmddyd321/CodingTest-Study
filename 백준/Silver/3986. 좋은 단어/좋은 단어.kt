import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var N = scanner.nextInt()
    
    var ans = 0
    while (N-- > 0) {
        val stack = Stack<Char>()
        val word = scanner.next()
        
        for (char in word) {
            if (stack.isEmpty()) {
                stack.push(char)
            } else {
                if (stack.peek() == char) {
                    stack.pop()
                } else {
                    stack.push(char)
                }
            }
        }
        
        if (stack.isEmpty()) {
            ans++
        }
    }
    
    println(ans)
}