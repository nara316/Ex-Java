class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arrStr = new String [n];
        
        //1. 먼저 2진법으로 변환(비트연산 사용)
        for (int i=0; i<n; i++) {
            arrStr[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        
        //2. 암호 해독 (먼저 자릿수 맞추기)
        for (int i=0; i<n; i++) {
            arrStr[i] = String.format("%" + n + "s", arrStr[i]); //0을 공백으로 채워준다
            arrStr[i] = arrStr[i].replaceAll("1", "#");
            arrStr[i] = arrStr[i].replaceAll("0", " ");
        }
            
        return arrStr;
    }
}