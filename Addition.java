public class Addition {
    public static void main(String[] args) {
        // array syntax datatype[] arrayname=new datatype[size];
        int[] arr= {10,23,34,56,78};
        int sum=0;
        int avg=0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        
         } 
           System.out.println("sum is :"+sum );
           avg=sum/arr.length;
            System.out.println("avg is :" +avg);
    }
}
