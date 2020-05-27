
#include<iostream>
using namespace std;
int main()
{
  int s,l,sum,i,j;
  std::cin>>s>>l;
  for(i=s;i<=l;i++)
  {
     sum = 0;
     for(j=1;j<i;j++)
     {
       if(i%j==0)
         sum=sum+j;
     }
    if(sum==i)
      std::cout<<i<<" ";
  }
}
    