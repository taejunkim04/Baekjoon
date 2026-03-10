class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total;
        if (count%2==0){
            total=price+price*count;
            total=total*(count/2);
        }else{
            total=price+price*(count-1);
            total=total*(count/2);
            total+=price*count;
        }
        if (total<=money){
            return 0;
        }else{
            return total-money;
        }
    }
}