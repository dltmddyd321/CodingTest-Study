class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sp = s.split(" ");

        for (String string : sp) {
            if (string.isEmpty()) answer.append(" ");
            else {
                answer.append(string.substring(0, 1).toUpperCase());
                answer.append(string.substring(1).toLowerCase());
                answer.append(" "); // 띄어쓰기
            }
        }
        
        if(s.charAt(s.length() - 1) == ' ') return answer.toString();
        return answer.substring(0, answer.length() - 1);
    }
}