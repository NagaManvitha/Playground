#include<iostream>
using namespace std;
int main()
{
  int n,i;
  float a=0.5;
  std::cin>>n;
  std::cout<<a<<" ";
  for(i=1;i<n;i++)
  {
    a=a*3;
    std::cout<<a<<" ";
  }
}