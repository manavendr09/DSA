class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int sum=0;
        int i=1;
        while(n>0){
            int m=n % 10;
            n /=10;
            if(m == 0) continue;
            sum += m;
            x += (m * i);
            i *=10;
        }
        return (long) x * sum;

        // if(n==0) return 0;
        // StringBuilder st=new StringBuilder();
        // int s=0;
        // while(n>0){
        //     int a=n%10;
        //     if(a!=0){
        //         s+=a;
        //     st.append(a);
        //     }
        //     n=n/10;
        // }
        // st.reverse();
        // String s1=st.toString();
        // int x=Integer.parseInt(s1);
        // long l=(long)x*(long)s;
        // return l;
    }
}