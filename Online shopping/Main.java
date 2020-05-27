#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int j=a-a*b/100;
  int k=j+c;
  int l=d-d*e/100;
  int m=l+f;
  int n=g-g*h/100;
  int o=n+i;
  std::cout<<"In Flipkart Rs."<<k<<"\n";
  std::cout<<"In Snapdeal Rs."<<m<<"\n";
  std::cout<<"In Amazon Rs."<<o<<"\n";
  if(k<=m && k<=o)
    std::cout<<"He will prefer Flipkart";
  else if(m<=k&&m<=o)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
}
  
