#include<iostream>
int main()
{
  int w,f;
  std::cin>>w>>f;
  if(w>f)
    std::cout<<"Yes, you can enter.";
  else if(w==f)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}