using namespace std;
#include <iostream>

bool inRange(int n, int low, int high) {
    if((n >= low) && (n <= high)) {
        return true;
    }
    return false;
}

class Person{
    public:
        int age;
        Person(int initialAge);
        void amIOld();
        void yearPasses();
    };

    Person::Person(int initialAge){
        // Add some more code to run some checks on initialAge
        if(initialAge > 0) {
            this->age = initialAge;
        } else {
            cout << "Age is not valid, setting age to 0." << endl;
            this->age = 0;
        }

    }

    void Person::amIOld(){
        // Do some computations in here and print out the correct statement to the console 
        if(inRange(this->age, 0, 12)){
            cout << "You are young." << endl;
        } else if(inRange(this->age, 13, 17)){
            cout << "You are a teenager." << endl;
        } else {
            cout << "You are old." << endl;
        }
    }

    void Person::yearPasses(){
        // Increment the age of the person in here
        this->age++;
    }

int main(){