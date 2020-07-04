#include<iostream>
using namespace std;
int find(int a[],int n,int x)
{
  for(int i=0;i<n;i++)
  {
    if(a[i]==x)
      return 1;
  }
  return 0;
}
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int x;
  int i;
  cin>>x;
  int ans=find(a,n,x);
  if(ans==1)
    cout<<"She passed her exam"<<endl;
  else
    cout<<"She failed"<<endl;
 
  
 
  return 0;
}