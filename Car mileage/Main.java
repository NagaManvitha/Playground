#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,d,r;
  std::cin>>m>>p>>d;
  r=m*p;
  if(r<d)
   std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
  
}