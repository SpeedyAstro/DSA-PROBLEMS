#include<iostream>
using namespace std;
int main(){
    int t,vr = 0,i;
    string ans = "",s;
    cin>>t>>s;
    for(i=0;vr+i<t;i++){
        vr += i;
        ans += s[vr];
    }
    cout<<ans;
    return 0;
}