#include<iostream>
using namespace std;
int main(){
    int n , sum = 0 , count = 0;
    cin>>n;
    int pages[7];
    for(int i = 0 ; i  < 7 ; i++){
        cin>>pages[i];
    }
    for(int i = 0 ; sum < n ; i++){
        count++;
        i = i % 7;
        sum += pages[i];
    }
    count %= 7;
    if(count == 0)
        cout<<7;
    else  
        cout<<count;
    return 0;
}