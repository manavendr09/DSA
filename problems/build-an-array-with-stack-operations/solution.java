class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> st=new Stack<>();
        List <String> s=new ArrayList<>();
        // int f[]=new int[101];
        // for(int i=0;i<target.length;i++){
        //     f[target[i]]++;
        // }
        int a=0;
        for(int i=1;i<=n;i++){
              if(st.size()==target.length) break;
              if(target[a]==i){
                st.push(i);
                s.add("Push");
                a++;
              }
               else{
                s.add("Push");
                s.add("Pop");
            }
          
        }
      return s;
    }
}