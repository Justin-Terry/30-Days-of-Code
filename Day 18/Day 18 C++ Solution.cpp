#include <iostream>
#include <vector>

using namespace std;

class Solution {
    private:
        vector<char> stack;
        vector<char> queue;
    public:
        char popCharacter(){
            char c = stack.back();
            stack.pop_back();
            return c;
        }
        void pushCharacter(char c){
            stack.push_back(c);
        }
        void enqueueCharacter(char c){
            queue.insert(queue.begin(), c);
        }
        char dequeueCharacter(){
            char c = queue.back();
            queue.pop_back();
            return c;
        }
};

int main() {
    // read the string s.
    string s;
    getline(cin, s);
    
  	// create the Solution class object p.
    Solution obj;
    
    // push/enqueue all the characters of string s to stack.
    for (int i = 0; i < s.length(); i++) {
        obj.pushCharacter(s[i]);
        obj.enqueueCharacter(s[i]);
    }
    
    bool isPalindrome = true;
    
    // pop the top character from stack.
    // dequeue the first character from queue.
    // compare both the characters.
    for (int i = 0; i < s.length() / 2; i++) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false;
            
            break;
        }
    }
    
    // finally print whether string s is palindrome or not.
    if (isPalindrome) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }
    
    return 0;
}