import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for(int scov:scoville) list.offer(scov);

        while(list.peek() < K){
            if(list.size() == 1) return -1;
            list.offer(list.poll() + list.poll() * 2);
        }
        return scoville.length - list.size();
    }
}