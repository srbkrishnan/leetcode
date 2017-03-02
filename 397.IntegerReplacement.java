public class IntegerReplacement {
    public int integerReplacement(int N) {
        long n=N;
        int count=0;
        while(n>1){
            if((n & 1)==0)
                n>>>=1;
            else if(n==3 || ((n >>> 1) & 1 )==0)
                n--;
            else
                n++;
            count++;
            //System.out.println(n);
        }
        return count;
    }
}