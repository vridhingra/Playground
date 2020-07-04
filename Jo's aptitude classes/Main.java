#include<bits/stdc++.h>
using namespace std;
int gcd(int m,int n)
{
        int rem;
        while(n!=0)
        {
                rem=m%n;
                m=n;
                n=rem;
        }
        return(m);
}
int main()
{
    int a,b,c,gcd1,res,ans,gcd2;
    std::cin>>a>>b>>c>>ans;
 gcd1=gcd(a,b);
        gcd2=gcd(c,gcd1);
if(ans==gcd2)
  cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  

   
  return 0;
    
}