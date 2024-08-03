public class Q6_reverseAnArray {

    public static void reverse(int arr[])
    {
        int i=0;
        rev(arr,i);
    }
    public static void rev(int arr[],int i)
    {
        int n=arr.length;
        if(i>=n/2){
            return;
        }
        swap(arr,i,n-i-1);
        rev(arr,i+1);

    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
