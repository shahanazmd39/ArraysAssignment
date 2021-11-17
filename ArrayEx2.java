class ArrayEx2 
{
     public static void main(String[] args) 
    {
    int salaries[] = {24120,25478,55451,52145,78452};
    double totalSalary=0,avgSalary;
    for(int i=0;i<5;i++) {
     totalSalary = totalSalary + salaries[i];
     }
    System.out.println("Total salary is "+totalSalary);
     avgSalary = totalSalary/5;
    System.out.println("Average salary is "+avgSalary);
    }
 }
