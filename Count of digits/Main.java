#include<iostream>
int main()
{
  int n,r,cnt=0;
  std::cin>>n;
  do
  {
    r=n%10;
    cnt++;
    n/=10;
  }while(n>0);
  std::cout<<cnt;
}