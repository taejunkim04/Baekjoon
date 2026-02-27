import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[]{7,7};
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<lottos.length;i++){
            set.add(win_nums[i]);
        }
        for (int i=0;i<lottos.length;i++){
            if (lottos[i]==0){
                answer[0]--;
            }else{
                if (set.contains(lottos[i])){
                    answer[0]--;
                    answer[1]--;                       
                }
            }
        }
        if (answer[0]==7){
            answer[0]--;
        }
        
        if (answer[1]==7){
            answer[1]--;
        }
        return answer;
    }
}