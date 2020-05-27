#include<iostream>
using namespace std;
int main()
{
  int b,c;
  std::cin>>b>>c;
  if(b>c)
  {
    int x=1800+b;
    int y=1900+c;
    std::cout<<y-x;
}
  else
  {
    int x=1800+b;
    int y=1800+c;
    std::cout<<y-x;
  }
}