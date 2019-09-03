#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void printStrings(string s){
    string evens = "";
    string odds = "";
    for(int i = 0; i < s.length(); i++) {
        if((i%2 == 0)) {
            evens.append(string(1, s.at(i)));
        } else {
            odds.append(string(1, s.at(i)));
        }
    }

    cout << evens << " " << odds << endl;
    
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int tests;
    cin >> tests;
    cin >> ws; // clear whitespace

    for(int i = 0; i < tests; i++) {
        string s;
        getline(cin, s);
        printStrings(s);
    }

    return 0;
}


