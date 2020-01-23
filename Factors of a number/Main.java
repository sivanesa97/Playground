import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int factor;
      int c=1;
      while(c>0)
      {
        factor=c++;
      if(n%factor==0&&factor<=n)
        System.out.println(factor);
      }
	}
}