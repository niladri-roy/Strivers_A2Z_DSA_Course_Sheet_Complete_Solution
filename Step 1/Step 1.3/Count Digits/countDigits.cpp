#include<iostream>
using namespace std;

int main(){

    int n;
    cout << "Enter the number to be checked : ";
    cin >> n;

    int count = 0;
    int digit;
    int temp = n;
    while(temp!=0){

        digit = temp%10;
        if(digit !=0 && n%digit == 0){
            count++;
        }
        temp = temp/10;
    }
    cout << count;
}