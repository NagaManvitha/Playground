#include<iostream>
using namespace std;
int main()
{
  int b,a,c;
  std::cin>>b>>a>>c;
  if(a*75+c*30<b)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}