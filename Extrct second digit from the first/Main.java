import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=n;
      while(n/10>0)
      {
        if(count<100&&count>9)
        {
          int second_digit=count%10;
          System.out.println(second_digit);
        }
        count=count/10;
      }
	}
}