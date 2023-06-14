import java.util.*;
public class Plus91_TestProblem{

    
   public static int cal(int array[], int n, int k)
   {
      
       Arrays.sort(array); 
       int sum = 0, sum1 = 0, sum2 = 0;    
       for (int i = 0; i < n; i++) 
       {
           sum += array[i];
       }
     
       
       for (int i = 0; i < k; i++) 
       {
           sum1 += array[i];
       }
     
       for (int i = k; i < n; i++) 
       {
           sum2 += array[i];
       }
     
      
       return 
       Math.max(Math.abs(sum1 - (sum - sum1)), Math.abs(sum2 - (sum - sum2)));
   }
    
   
   public static void main(String[] args)
   
   {
	   System.out.println("OUTPUT");
 // 1st input 
 // arr[]=[8,4,5,2,10]     k=2     output= 2
       int k = 2;
       int array[] = { 8, 4, 5, 2, 10 };
       int n = array.length;
       
       System.out.print(cal(array, n, k));
     
    //2nd input 
    //arr[1,1,1,1,1,1,1,1]    k= 2   output= 17
       
     
       int array2[]= {1,1,1,1,1,1,1,1};
       int k1 = 3;
       int n2= array2.length;
       
       System.out.println("\n"+cal(array2,n2,k1));
       
   }
}
