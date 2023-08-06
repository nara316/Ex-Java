class Solution {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> list = new ArrayList<>();

        for(String x : str) {
            String tmp = new String(x).reverse().toString();
            list.add(tmp);
        }

        return list;
    }
}