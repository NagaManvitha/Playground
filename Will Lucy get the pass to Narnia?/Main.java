#include<iostream>
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  std::cout<<"Enter first number : Enter second number : Menu";
  std::cout<<"\n1.Addition";
  std::cout<<"\n2.Subtraction";
  std::cout<<"\n3.Multiplication";
  std::cout<<"\n4.Division";
  std::cout<<"\n5.Remainder";
  switch(c)
  {
    case 1:
      std::cout<<"\n"<<a+b;
      break;
    case 2:
      std::cout<<"\n"<<a-b;
      break;
    case 3:
      std::cout<<"\n"<<a*b;
      break;
    case 4:
      std::cout<<"\n"<<a/b;
      break;
    case 5:
      std::cout<<"\n"<<a%b;
      break;
    default:
      std::cout<<"\nInvalid operation";
  }
}