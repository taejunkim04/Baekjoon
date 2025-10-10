import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int choNum=nums.length/2;
        Set<Integer> sets =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            sets.add(nums[i]);
        }
        if(sets.size()>=choNum){
            answer=choNum;
        }else{
            answer=sets.size();
        }
        return answer;
    }
}