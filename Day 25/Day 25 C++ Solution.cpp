#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  

    int T;
    cin >> T;

    for(int i = 0; i < T; i++) {
        int n;
        cin >> n;
        string result = "Prime";
        if(n == 1) {
            result = "Not prime";
        }else {
            for(int j = 2; j*j <= n; j++){
                if(n%j == 0) {
                    result = "Not prime";
                    break;
                }
            }
        }
        cout << result << endl;
    }

    return 0;
}
