#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int count(int n)
{
  int r,c=0;
  while(n>0)
  {
    r=n%10;
    n/=10;
    c++;
  }
  return c;
}
int arm(int n)
{
    int s=0,r,p;
  p=n;
int x=count(n);
  while(n>0)
  {
    r=n%10;
    s=s+power(r,x);
    n/=10;
}
  if(s==p)
    return 1;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}