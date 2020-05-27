#include<iostream>
int main()
{
    int r,c,a[100][100],b[100][100],d[100][100];
  std::cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      d[i][j]=a[i][j]+b[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cout<<d[i][j]<<" ";
    }
    std::cout<<"\n";
  }
  }
