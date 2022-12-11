#include <string>
#include <vector>

using namespace std;

int solution(int i, int j, int k) {
    int answer = 0;
    for (int x=i; x<=j; x++) {
        string str = to_string(x);
        for (int u=0; u<str.size(); u++) {
            int num = str[u] - '0';
            if (num == k) answer++;
        }
    }
    return answer;
}