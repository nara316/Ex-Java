class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        //1. 배열의 길이가 1일 경우
        if(arr.length == 1) return arr[0];

        int min = gcd(arr[0], arr[1]);
        answer = (arr[0]*arr[1])/min;

        if (arr.length>2) {
            for (int i=2; i<arr.length; i++) {
                min = gcd(answer, arr[i]);
                answer = (answer*arr[i])/min;
            }
        }

        return answer;
    }

    //유클리드 호제법(최대공약수)
    public int gcd(int a, int b) {
        int tmp = a % b;
        if(tmp == 0) return b;
        else return gcd(b,tmp);
    }
}
