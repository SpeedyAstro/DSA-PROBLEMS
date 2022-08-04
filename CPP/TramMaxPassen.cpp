#include<iostream>
using namespace std;
int main(){
    int stops,ans = 0;
    int maxpassenger = INT32_MIN;
    cin>>stops;
    int train[stops*2];
    for(int i = 0 ; i < stops*2; i++){
        int passenger;
        cin>>passenger;
        train[i] = passenger;
    }
    for(int i = 0 ; i < stops*2; i++){
        if(i == 1){
            ans = train[0] + train[i];
        }
        else if (i>1)
        {
            ans = ans + train[i+1] - train[i];
            i++;
        }
        maxpassenger = max(ans , maxpassenger);
    }
    cout<<maxpassenger;
    return 0;
}