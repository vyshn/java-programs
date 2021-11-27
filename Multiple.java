import java.util.Scanner;
class Multiple
{
public static void main(String args[])
{
  int N;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  int n=sc.nextInt();
  for(int i=1;i<=10;i++)
{
N=n*i;
System.out.println(""+n+"*"+i+"="+N);
}
}
}
 OUTPUT:
C:\Users\LENOVO\Documents>javac Multiple.java

C:\Users\LENOVO\Documents>java Multiple
enter the number
6
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
6*6=36
6*7=42
6*8=48
6*9=54
6*10=60
