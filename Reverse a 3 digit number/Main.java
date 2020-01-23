import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int n1=n%10, n2=n/10, n3=n2%10, n4=n/100;
    int reverse=(n1*100)+(n3*10)+n4;
    System.out.println(reverse);
  }
}