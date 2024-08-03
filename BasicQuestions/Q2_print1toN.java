public class Q2_print1toN {
    public static void prin1Ton(int n)
    {
        if(n==0){
            return;
        }
        prin1Ton(n-1);
        System.out.println(n);
        
    }

    public static void main(String[] args) {
        int n=5;
        prin1Ton(n);
    
    }
    
}
