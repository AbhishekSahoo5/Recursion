
public class Q1_printNameNtimes{

    public static void nameNTimes(int n)
    {
        if(n==0){
            return;
        }
        System.out.println("Abhishek");
        nameNTimes(n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        nameNTimes(n);
    }
}