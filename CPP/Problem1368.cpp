#include<iostream>
using namespace std;
int main(){
    int tc;
    cin>>tc;
    for(int i = 0 ; i < tc ; i++){
        int  counter = 0;
        int a , b ,n;
        cin>>a>>b>>n;
        while((a+b)<=n){
            counter++;
            if(a>=b){
                b += a;
            }
            else{
                a += b;
            }
        }
        cout<<counter+1<<"\n";
    }
    return 0;
}