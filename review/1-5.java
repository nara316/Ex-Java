class Solution {
    public String solution(String str) {
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = arr.length-1;

        while (lt<rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt++;
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(arr);
    }
}