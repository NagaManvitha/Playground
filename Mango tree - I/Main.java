#include<iostream>
using namespace std;
int main()
{
int row,col,num,col1;
std::cin>>row>>col>>num;
if(num<col)
std::cout<<"Yes";
else if(num>col&&num%2!=0)
std::cout<<"Yes"; 
else
std::cout<<"No";
}
