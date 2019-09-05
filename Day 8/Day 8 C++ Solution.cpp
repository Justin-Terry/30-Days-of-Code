#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <sstream>
#include <map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin >> n;
    string whitespace;
    getline(cin, whitespace);
    map<string, string> phoneBook;

    for(int i = 0; i < n; i++) {
        string st;
        getline(cin, st);
        stringstream ss(st);
        string name;
        string number;
        ss >> name;
        ss >> number;

        phoneBook.insert(pair<string, string>(name, number));
    }
    
    string queryName;
    while(getline(cin, queryName)) {
                if(phoneBook.find(queryName) == phoneBook.end()) {
            cout << "Not found" << endl;
        } else{
            cout << queryName << "=" << phoneBook.find(queryName) -> second << endl;
        }
    }




    return 0;
}

