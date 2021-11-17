import java.util.Scanner;
class AscandDes 
{
       public static void main(String[] args) 
      {
       int arr[] = new int[10];
       Scanner scan = new Scanner(System.in);
       //accept the data and push it in an array
        for(int i=0;i<10;i++) 
        {
         System.out.println("Enter an element ");
         arr[i] = scan.nextInt();
         }
     //Sorting data....
     //Bubble sort.
      for(int i=0;i<9;i++) 
      {
      for(int j=i+1;j<10;j++) 
      {
      if(arr[i] > arr[j]) 
      {
      int tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
      } 
    } 
 }
//display the elements in an array
       System.out.println("Elements in ascending order");
       for(int i=0;i<10;i++)
       {
       System.out.println(arr[i]);
       }
       System.out.println("Elements in descending order");
       //display elements in descending order
         for(int i=9;i>=0;i--) 
         {
         System.out.println(arr[i]);
        } 
      } 
}