#include<iostream>
using namespace std;
int gcd(int a,int b ,int c,int d)
{
  int s,g;
  if(a<b&&a<c)
    s=a;
  else if(b<a&&b<c)
    s=b;
  else
    s=c;
  while(s>=1)
  {
    if(a%s==0&&b%s==0&&c%s==0)
    {
       g=s;
      break;
    }
     else
       s--;
   }
  if(g==d)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}
      
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c>>d;
  gcd(a,b,c,d);
  return 0;
}