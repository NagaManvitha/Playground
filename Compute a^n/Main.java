#include<iostream>
using namespace std;
int power(int a,int n)
{
  if (n != 0)
        return (a*power(a,n-1));
    else
        return 1;
}
int main()
{
  int a,n;
  std::cout<<"Enter the value of a";
  std::cin>>a;
  std::cout<<"\nEnter the value of n"<<"\n";
  std::cin>>n;
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
  return 0;
}