#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   

    int retDay, retMonth, retYear, dueDay, dueMonth, dueYear;
    cin >> retDay >> retMonth >> retYear;
    cin >> dueDay >> dueMonth >> dueYear;

    int fee = 0;

    if(retYear == dueYear) {
        // Same Year
        if(retMonth == dueMonth){
            // Same Month
            if(retDay > dueDay){
                fee = (retDay - dueDay) * 15;
            } 
        }else{
            if(retMonth > dueMonth){
                fee = (retMonth - dueMonth) * 500;
            }
        }
    } else {
        // Fixed fee
        if(retYear > dueYear){
            fee = 10000;
        }
    }
    cout << fee;
    return 0;
}
