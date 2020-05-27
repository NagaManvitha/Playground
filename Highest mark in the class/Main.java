#include<iostream>
int main()
{
  int m,a[100],l;
  std::cin>>m;
  for(int i=0;i<m;i++)
  {
    std::cin>>a[i];
  }
  l=a[0];
  for(int i=1;i<m;i++)
  {
     if(a[i]>l)
        l=a[i];
  }
  std::cout<<l;
  }