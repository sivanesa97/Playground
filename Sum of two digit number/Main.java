#include<stdio.h>
int main()
{
  int n,fd,ld,sum;
  scanf("%d",&n);
  fd=n/10;
  ld=n%10;
  sum=fd+ld;
  printf("%d",sum);
  return 0;
}