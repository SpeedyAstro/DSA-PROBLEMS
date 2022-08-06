#include<iostream>
using namespace std;
int main(){
    string s , result = "";
    cin>>s;
    int hash[123] = {0};
    for(int i = 0 ;  i < s.length(); i++){
        if(hash[s[i]] == 0){
            hash[s[i]] =1;
            result += s[i];
        }
    }
    if(result.length() %2 == 0){
        cout<<"CHAT WITH HER!";
    }
    else{
        cout<<"IGNORE HIM!";
    }
    return 0;
}