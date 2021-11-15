
import java.util.Scanner;

public class Difference
{

	public static void main(String[] args) 
    {
		// TODO Auto-generated method stub
		 Scanner orange =new Scanner(System.in);
	       // creating an empty array
	       int num[] = new int[10];
	      int sumeven=0;
	      int sumodd=0;
	       for(int i=0;i<10; i=i+1)
	       {
	         System.out.println("Enter the numbers");  
	         num[i]=orange.nextInt();
	         if(num[i]%2==0)
	           {
	    	   sumeven=sumeven+num[i];
	           }
	         else 
	         {
	    	   sumodd=sumodd+num[i];
	         }
	       }
	       System.out.println("Sum of Odd numbers:"  + sumodd);
	       System.out.println("Sum of Even numbers:" + sumeven);
	       int diff = sumeven-sumodd;
	       System.out.println("Difference:" + diff);
           
      }
}
	
