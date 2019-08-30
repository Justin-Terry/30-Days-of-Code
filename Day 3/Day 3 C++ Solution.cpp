#include <bits/stdc++.h>

using namespace std;

bool isEven(int n) {
    if(n % 2 == 0) {
        return true;
    }
    return false;
}

bool inRange(int n, int low, int high) {
    if((n >= low) && (n <= high)) {
        return true;
    }
    return false;
}

int main()
{
    int N;
    cin >> N;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    if(!isEven(N)) {
        cout << "Weird";
    } else if(isEven(N) && inRange(N, 1, 5)) {
        cout << "Not Weird";
    } else if(isEven(N) && inRange(N, 6, 20)) {
        cout << "Weird";
    } else {
        cout << "Not Weird";
    }

    return 0;
}
