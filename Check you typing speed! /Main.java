#include<iostream>
using namespace std;
int main()
{
int id,m;
std::cin>>id>>m;
if(m>0)
  std::cout<<id<<" is eligible for reward.";
else if(m<0)
   std::cout<<" ";
}