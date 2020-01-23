import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count, fac=1;
      for (count=1;count<=n;count++)
      {
      fac=fac*count;
      }
      System.out.println(fac);
	}
}