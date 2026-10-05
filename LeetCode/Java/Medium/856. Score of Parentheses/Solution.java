class Solution {
    public int scoreOfParentheses(String s) {
        char[] arr = s.toCharArray();
        int count=0;
        for(char ch : arr){
            if(ch==')'){
                count++;
            }
        }
        return count;
    }
}