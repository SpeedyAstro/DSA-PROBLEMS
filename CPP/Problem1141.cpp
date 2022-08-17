#include<bits/stdc++.h>
 
using namespace std;
 
/// Typedef
typedef long long ll;
 
#define sc1(a) scanf("%lld",&a)
#define sc2(a, b) scanf("%lld %lld",&a,&b)
 
#define pf1(a) printf("%lld\n", a)
#define pf2(a, b) printf("%lld %lld\n",a,b)
 
#define mx 1000000
#define PI acos(-1.0)
#define Accepted 0
int main(){
    int n , m ,d, res = -1;
    cin>>n>>m;
    if(m % n == 0){
        res = 0;
        d = m / n;
        while (d % 2 == 0)
            d /= 2, res++;
        while(d % 3 == 0)
            d /= 3, res++;
        if(d != 1)
            res = -1;
    }
    cout<<res<<endl;
    return Accepted;
}