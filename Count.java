import java.util.Scanner;

public class Count
{

	public static void main(String[] args) 
    {
		// TODO Auto-generated method stub
		 Scanner apple =new Scanner(System.in);
	       // creating an empty array
	       int num[] = new int[15];
	      int even=0;
	      int odd=0;
	       for(int i=0;i<15; i=i+1)
	       {
	         System.out.println("Enter the numbers");  
	         num[i]=apple.nextInt();
	         
	         if(num[i]%2==0)
	           {
	    	   even=even+1;
	           }
	         else 
	         {
	    	   odd=odd+1;
	         }
	       }
	       System.out.println("Odd numbers:"  + odd);
	       System.out.println("Even numbers:" + even);
           
      }
}
	


