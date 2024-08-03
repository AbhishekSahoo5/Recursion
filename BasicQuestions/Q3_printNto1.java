public class Q3_printNto1 {

    public static void printNto1(int n)
    {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);

    }
    // Don't use printNto1(n-1)
    public static void printNto1(int i,int n)
    {
        if(n<i){
            return;
        }
        printNto1(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n=5;
        printNto1(n);
        System.out.println("-------------");
        printNto1(1,n);
    
    }
    
}
