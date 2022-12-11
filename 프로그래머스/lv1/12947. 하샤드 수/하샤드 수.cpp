#include <string>

using namespace std;

bool solution(int x) {
    
    int sum = 0;
    string str = to_string(x);
    
    for (int i=0; i<str.size(); i++) {
        sum += str[i] - '0';
    }
    
    if (x % sum == 0) return true;
    else return false;
    
}