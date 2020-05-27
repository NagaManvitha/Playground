#include<iostream>
using namespace std;
int main()
{
  int n,a=6,b;
  std::cin>>n;
  std::cout<<a<<" ";
  for(int i=1;i<n;i++)
  {
    b=a+5*i;
    a=b;
    std::cout<<b<<" ";
  }
}