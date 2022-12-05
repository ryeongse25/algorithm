#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int i = 6;
    
    while(true) {
        if (i % n == 0) {
            answer = i / 6;
            break;
        }
        i += 6;
    }
    
    return answer;
}