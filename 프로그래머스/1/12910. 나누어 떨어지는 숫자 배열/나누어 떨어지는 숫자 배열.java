import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
            Queue<Integer> queue=new PriorityQueue<>();
            for (int i=0;i<arr.length;i++){
                if(arr[i]%divisor==0){
                    queue.add(arr[i]);
                }
            }
            int[] answer;
            if (queue.size()==0){
                answer = new int[]{-1};
            }else{
                int temp=queue.size();
                answer = new int[temp];
                for (int i=0;i<temp;i++){
                    answer[i]=queue.remove();
                }
            }
            return answer;
        }
}