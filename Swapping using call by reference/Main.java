#include<iostream>
using namespace std;
int swap(int &x,int &y)
{
  x=x+y;
  y=x-y;
  x=x-y;
  return 0;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";;
  swap(a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
  return 0;
}