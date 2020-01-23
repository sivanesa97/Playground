import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=n;
      int sum=0;
      while(n/10>0)
      {
        sum=sum+(count%10);
        if(count/10==0)
        {
          System.out.println(sum);
          break;
        }
        count=count/10;
      }
	}
}