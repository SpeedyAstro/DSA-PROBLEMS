 #include<iostream>
 using namespace std;
 int main(){
    int n,frnd;
    cin>>n;
    int friends [n+1];
    for(int i = 1; i <= n ; i++){ 
        cin>>frnd;
        friends[frnd] = i;
    }
    for(int i = 1; i<= n ; i++){
        cout<<friends[i]<<" ";
    }
    return 0;
}