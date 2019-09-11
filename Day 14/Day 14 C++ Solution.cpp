#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;

	// Add your code here
    Difference(vector<int> ele) {
        elements = ele;
    }

    void computeDifference () {
        int max = -1; // Problem defines arr[i] values as being <= 0
        int min = 101; // Problem defines arr[i] values as being <= 100
        for(int i = 0; i < elements.size(); i++) {
            if(elements[i] > max) {
                max = elements[i];
            }
            if(elements[i] < min) {
                min = elements[i];
            }
        }
        maximumDifference = (abs(max - min));
    }
}; // End of Difference class