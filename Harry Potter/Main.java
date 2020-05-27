#include<iostream>
using namespace std;
int main()
{
  int n,last,first,s=0;
  std::cin>>n;
  last=n%10;
  first=(n/1000)%10;
  s=first+last;
  std::cout<<s;
}