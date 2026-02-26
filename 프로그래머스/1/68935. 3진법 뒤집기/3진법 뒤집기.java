import java.util.*;
class Solution {
    public int solution(int n) {
        Stack<Integer> stack =new Stack<>();
        int div=1;
        int len=1;
        while(n>=div*3){
            div*=3;
            len++;
        }
        int copyDiv=div;
        for (int i=0;i<len;i++){
            if (n==0){
                stack.add(0);
            }else{
                int temp=n/div;
                stack.add(temp);
                n-=div*temp;
            }
            div/=3;
        }
        int answer=0;
        for (int i=0;i<len;i++){
            int num=stack.pop();
            if (num!=0){
                answer+=num*copyDiv;
            }
            copyDiv/=3;
        }
        return answer;
    }
}