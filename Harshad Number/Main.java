#include<iostream>
using namespace std;
int main()
{
  int n,s=0,t,r;
  std::cin>>n;
  t=n;
  while(n>0)
  {
    r=n%10;
    s=s+r;
    n/=10;
}
  if(t%s==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}