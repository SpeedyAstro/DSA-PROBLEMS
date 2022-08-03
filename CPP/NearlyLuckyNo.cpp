#include<iostream>
using namespace std;
void run_case(){
    int count = 0;
    long long n ;
    cin>>n;
    while (n!= 0)
    {
        if(n%10 == 4 || n%10 == 7){
            count++;
            n = n/10;
    }
        else{
            n = n/10;
        }
    }
    if(count == 4 || count == 7){
        cout<<"YES";
    }
    else{
        cout<<"NO";
    }
    
}
int main(){
    run_case();
    return 0;
}