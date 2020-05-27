#include<iostream>
int main()
{
    int r,c,a[100][100],b[100][100];
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
      b[j][i]=a[i][j];
    }
  }
    for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
     std::cout<<b[i][j]<<" ";
    }
      std::cout<<"\n";
  }
    
  }