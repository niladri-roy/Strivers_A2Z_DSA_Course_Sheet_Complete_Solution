#include<iostream>
using namespace std;

int main(){

    int n;
    cout << "Enter the number of rows ";
    cin >> n;
    int i,j;
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            cout<<"* ";
        }
        cout<<endl;
    }
}