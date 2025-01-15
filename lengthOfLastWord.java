package DSA;

class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        String st=s.trim();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==' '){
                c=0;
            }
            else{
                c++;
            }
        }
        return c;
    }
}