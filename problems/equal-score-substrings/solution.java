class Solution {
    public boolean scoreBalance(String s) {
        int l[]=new int[s.length()];
        int r[]=new int[s.length()];
        l[0]=s.charAt(0)-'a'+1;
        for(int i=1;i<s.length();i++){
            l[i]=s.charAt(i)-'a'+1;
            l[i]=l[i-1]+l[i];
        }
        r[s.length()-1]=s.charAt(s.length()-1)-'a'+1;
        for(int i=s.length()-2;i>=0;i--){
            r[i]=s.charAt(i)-'a'+1;
            r[i]=r[i]+r[i+1];
        }
        for(int i=0;i<s.length()-1;i++){
            if(l[i]==r[i+1]){
             return true;     
            }
        }
        return false;
    }
}