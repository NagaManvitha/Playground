#include<iostream>
int main()
{
  int n,a[100],k,f=0;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>k;
  for(int i=0;i<n;i++)
  {
    if(a[i]==k){
      f=1;
      break;
    }
  }
  if(f==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}
  
