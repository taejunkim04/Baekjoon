class Solution {
    public String solution(int a, int b) {
        int[] days=new int[]{31,29,31,30,31,30,31,31,30,31,30};
        String[] wee=new String[]{"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int temp=b;
        for(int i=0;i<a-1;i++){
            temp+=days[i];
        }
        temp%=7;
        String answer = wee[temp];
        return answer;
    }
}