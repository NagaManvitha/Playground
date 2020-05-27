#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int n,a=121,s,s1,p;
  std::cin>>n;
  s=sqrt(a);
  std::cout<<a<<" ";
  for(int i=1;i<n;i++)
  {
    s1=s+4;
    p=s1*s1;
    s=s1;
    std::cout<<p<<" ";
  }
}