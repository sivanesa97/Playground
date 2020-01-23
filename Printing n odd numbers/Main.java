import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int count;
      for(count=1; count<=n*2; count++)
      {
        if(count%2==1)
        System.out.println(count);
      }
	}
}