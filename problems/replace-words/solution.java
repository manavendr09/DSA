class Solution {
    public String replaceWords(List<String> d, String s) {
        int n=s.length();
        int m=d.size();
        String st[]=s.split(" ");
        for(int i=0;i<m;i++){
            for(int j=0;j<st.length;j++){
                if(st[j].length()>d.get(i).length() && st[j].substring(0,d.get(i).length()).equals(d.get(i))){
                    st[j]=d.get(i);
                }
            }
        }
        return String.join(" ",st);
    }
}