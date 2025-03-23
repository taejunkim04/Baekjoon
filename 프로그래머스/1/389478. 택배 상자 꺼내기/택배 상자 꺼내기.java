class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int numHe = num / w;
        if (num % w != 0) {
            numHe += 1;
        }
        int maxHe = n / w;
        if (n % w != 0) {
            maxHe += 1;
        }
        if (numHe == maxHe) {
            return 1;
        }
        answer = maxHe - numHe;
        //가장 위에 층에도 같은 위치에 상자가 있는지 확인
        if (maxHe % 2 != numHe % 2) {
            //둘의 시작점이 다른 경우
            if (n % w == 0) {
                answer += 1;
                return answer;
            }
            int numLoc;
            if (num % w == 0) {
                numLoc = w;
            } else {
                numLoc = num % w;
            }
            int maxLocLength = n % w;

            if (maxLocLength + numLoc > w) {
                answer += 1;
            }
        } else {
            //둘의 시작점이 같은 경우
            if (num % w <= n % w) {
                answer += 1;
            }
        }
        return answer;
    }
}