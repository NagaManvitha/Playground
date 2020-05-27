#include<iostream>
int fact(int n)
{
  if(n>=1)
    return n*fact(n-1);
  else
    return 1;
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
  return 0;
}