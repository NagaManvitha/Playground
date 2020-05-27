#include<iostream>
using namespace std;
int main()
{
  int a;
  float t,x=10.15,y=13.30,z=18.00,b=22.00;
  std::cin>>a>>t;
  if(a>=13&&t==y)
    std::cout<<"$5.00";
  else if(a>=13&&t==x||t==z||t==b)
    std::cout<<"$8.00";
  else if(a<13&&t==y)
    std::cout<<"$2.00";
  else if(a<13&&t==x||t==z||t==b)
    std::cout<<"$4.00";
  }