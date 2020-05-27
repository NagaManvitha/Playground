#include<iostream>
using namespace std;
int main()
{
  int n;
  float h,i,j,k;
  std::cin>>n>>h;
  i=n*h;
  j=(h*50)/100;;
  if(n<=2)
    std::cout<<i-j;
  else if(n==3)
    std::cout<<2*h;
  else
    std::cout<<"Number of items is more";
}