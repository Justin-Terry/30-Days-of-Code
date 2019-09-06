#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int max = 0;
    int tempMax = 0;

        while(n >= 1) {
            if(n%2 == 1) {              // If the bit is going to be a 1
                tempMax++;              // Increment tempMax
                if(tempMax > max) {     
                    max = tempMax;      // Update max if a new max was found
                }
            } else {
                tempMax = 0;            // Reset temp max
            }
            n = n/2;                    // Remove the bit we've determined from n
        }

    cout << max;
    return 0;
}
