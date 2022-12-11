#include <string>
#include <vector>

using namespace std;

int solution(int num, int k) {
    int answer = -1;
    string str = to_string(num);
    
    for(int i=0; i<str.size(); i++) {
        int digit = str[i] - '0';
        if (digit == k) {
            answer = i + 1;
            break;
        }
    }
    
    return answer;
}