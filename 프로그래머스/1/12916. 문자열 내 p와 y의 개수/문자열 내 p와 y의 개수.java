class Solution {
    boolean solution(String s) {
            int cou=0;

            for (int i=0;i<s.length();i++){
                int temp=s.charAt(i);
                if (temp == 80 || temp == 112) {
                    cou++;
                } else if (temp == 89 || temp == 121) {
                    cou--;
                }
            }

            return cou == 0;
        }
}