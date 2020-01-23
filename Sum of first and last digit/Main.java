import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n2=n%10, sum;
      int count=n;
      while(count/10>0)
      {
      count=count/10;
        if(count>0&&count<10)
        {
          sum=count+n2;
        System.out.println(sum);
        }
      }
        
	}
}