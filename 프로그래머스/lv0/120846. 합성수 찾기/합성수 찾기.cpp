#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int tmp = 0;
    
    for (int i=4; i<=n; i++) {
        
        for (int j=1; j<=i; j++) {
            if (i % j == 0) tmp++;
        }
        
        if (tmp >= 3) answer++;
        tmp = 0;
    }
    
    return answer;
}