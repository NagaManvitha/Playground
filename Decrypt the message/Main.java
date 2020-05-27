#include<iostream>
int main()
{
  int e,t,s,sum=0;
  std::cin>>e>>t;
  s=e+t;
  for(int i=1;i<s;i++)
  {
    if(s%i==0)
    {
      sum=sum+i;
    }
  }
  if(s==sum)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}