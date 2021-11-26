         PROGRAM-1
import java.util.*;
import java.lang.Math;
class Solutiontest
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
  {
        int a=sc.nextInt();
        int b=sc.nextInt();                
        int n=sc.nextInt();
        int sum=a; 
        for(int j=0;j<n;j++)
{
        
         sum+=(Math.pow(2,j))*b;
      System.out.println(+sum);
}
}
 sc.close();
}
}        

OUTPUT:
C:\Users\LENOVO\Documents>java Solutiontest
2
0 2 10 5 3 5
2
6
14
30
62
126
254
510
1022
2046
8
14
26
50
98

    
  
      
            