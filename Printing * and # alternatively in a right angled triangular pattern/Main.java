import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  	Scanner in = new Scanner(System.in);
  	  int n=in.nextInt();
      int row,col,a=1;
      for(row=1;row<=n;row++)
      {
      for(col=1;col<=row;col++)
      {
        a=a+1;
        if(a%2==0)
          System.out.print("*");
        else
          System.out.print("#");
      }
             System.out.print("\n");
      }
    }
}