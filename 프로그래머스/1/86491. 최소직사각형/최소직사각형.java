import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int[] ans=new int[2];
        for (int i=0;i<sizes.length;i++){
            if (sizes[i][0]>sizes[i][1]){
                ans[0]=Math.max(ans[0],sizes[i][0]);
                ans[1]=Math.max(ans[1],sizes[i][1]);
            }else{
                ans[0]=Math.max(ans[0],sizes[i][1]);
                ans[1]=Math.max(ans[1],sizes[i][0]);
            }
        }
        return ans[0]*ans[1];
    }
}