#include <string>
#include <vector>

using namespace std;

int solution(int order) {
    int answer = 0;
    
    string str = to_string(order);
    
    for (int i=0; i<str.size(); i++) {
        char ch = str[i];
        if (ch == '3' || ch == '6' || ch == '9') answer++;
    }
    
    return answer;
}