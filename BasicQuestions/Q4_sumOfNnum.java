public class Q4_sumOfNnum {

    public static void sum(int i,int sum)
    {
        if(i<0){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);

    }
    public static int functionalSum(int n)
    {
        if(n==0) return 0;
        return n+functionalSum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        sum(n,sum); 
        System.out.println(functionalSum(n));
    }
}
