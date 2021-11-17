
class ArrayEx1 
{
    public static void main(String[] args) 
    {
      int marks[] = {78,85,96,98,97,88};
      int x = 0;
      int sum = 0;
     do {
     System.out.println(marks[x]);
     sum = sum + marks[x];
     x = x + 1;
    }while(x<6);
      System.out.println("Total marks are "+sum);
      float avg = sum / (1.0f * x);
      System.out.println("The average marks are "+avg);
    } 
}