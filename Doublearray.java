public class Doublearray {
   public static void main(String[] args) {
       int [][] arr = {{2,3,4,6},{5,7,3,2}};
       int sum = 0;
       int count = 0;

       for(int i = 0; i < arr.length; i++) {
           for(int j = 0; j < arr[i].length; j++) {  
               sum += arr[i][j];
               count++;
           }
           System.out.println("sum is :" + sum);
           int avg = sum / count;   
           System.out.println("avg is :" + avg);
       }
   }
}
