#include <iostream>
using namespace std;
int fib(int x) {
  if(x==1)
    return 0;
  if(x==2)
    return 1;
  else
      return fib(x-1)+fib(x-2);
}
int main() {
   int x;
   std::cin >> x;
   std::cout<<"The term "<<x<<" in the fibonacci series is "<<fib(x);
   return 0;
}
