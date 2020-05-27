#include<iostream>
#include<string>
int main() 
{ 
 int count=0,i;
  std::string fnum;
  std::cin>>fnum;
  for(i=0;fnum[i]!='\0';i++)
  {
    if(fnum[i]=='.')
      break;
    else
      count++;
  }
  std::cout<<"Floating part is : ";
  for(i=count+1;fnum[i]!='\0';i++)
    std::cout<<fnum[i];
}
