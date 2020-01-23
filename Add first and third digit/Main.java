#include<stdio.h>
int main()
{
 int n,fd,td,sum;
  scanf("%d",&n);
  fd=n/100;
  td=n%10;
  sum=fd+td;
  printf("%d",sum);
  return 0;
}