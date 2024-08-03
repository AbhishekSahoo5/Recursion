public class Q7_checkPallindrome {

    public static boolean checkPalindrome(String str)
    {
        int i=0;
        return reverse(str,i);
    }
    public static boolean reverse(String str,int i)
    {
        int n=str.length();
        if(i>=n/2){
            return true;
        }

        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return reverse(str, i+1);
    }

    public static void main(String[] args) {
        String str="madam";
        System.out.println(checkPalindrome(str));

    }
    
}
