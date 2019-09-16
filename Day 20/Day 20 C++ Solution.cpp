#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for(int a_i = 0; a_i < n; a_i++){
    	cin >> a[a_i];
    }
    // Write Your Code Here

    int numSwaps = 0;
    int thisRound = 1;

    while(thisRound > 0){
        thisRound = 0;
        for(int i = 0; i < a.size() - 1; i++) {
            if(a[i] > a[i+1]){
                int temp = a.at(i);
                a.at(i) = a.at(i+1);
                a.at(i+1) = temp;
                numSwaps++;
                thisRound++;
            }
        }
    }

    cout << "Array is sorted in " << numSwaps << " swaps." << endl;
    cout << "First Element: " << a[0] << endl;
    cout << "Last Element: " << a[a.size()-1] << endl;

    return 0;
}
