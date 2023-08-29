class Solution {
    public String solution(String new_id) {
        String answer = "";

        answer=new_id.toLowerCase();

        String match="[^0-9a-z-_.]";
        answer=answer.replaceAll(match,"");

        while(answer.contains("..")){
            answer=answer.replace("..",".");
        }

        answer=answer.replaceAll("^[.]","");
        answer=answer.replaceAll("[.]$","");

        if(answer.equals("")){
            answer+="a";
        }

        if(answer.length()>=16){
            answer=answer.substring(0,15);
            answer=answer.replaceAll("[.]$","");
        }

        while(answer.length()<3){
            String last=answer.substring(answer.length()-1);
            answer=answer.concat(last);
        }
        return answer;
    }
}