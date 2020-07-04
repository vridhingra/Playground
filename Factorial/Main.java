#include<iostream>
using namespace std;
int fact(int num)
{
  
  if(num==0)
    return 1;
 
  return num*fact(num-1);
}
int main()
{
 int n;
  cin>>n;
  int ans=fact(n);
  cout<<"The factorial of "<<n<<" is "<<ans;
  return 0;
}