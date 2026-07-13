class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int c=0;
        for(int i=0;i<k;i++){
           if(isv(s.charAt(i))==1){
            c++;
           } 
        }
        max=c;
            for(int j=k;j<s.length();j++){
                if(isv(s.charAt(j-k))==1) c--;
                if(isv(s.charAt(j))==1) c++;
                max=Math.max(c,max);
            }
           return max;
        }
        public int isv(char s){
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u') return 1;
            return 0;
        }
    }
