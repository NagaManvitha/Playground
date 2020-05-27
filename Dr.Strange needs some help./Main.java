#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,r,s;
  std::cin>>m>>n>>r;
  s=pow(m,n);
  if(s>=r)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}