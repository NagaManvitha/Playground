#include<iostream>
using namespace std;
int main()
{
  int n,r,e=0,o=0,q;
  std::cin>>n;
  while(n>0)
  {
    r=n%10;
    n/=10;
    if(r%2==0)
      e=e+r;
    else
      o=o+r;
  }
  if(e==o)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}