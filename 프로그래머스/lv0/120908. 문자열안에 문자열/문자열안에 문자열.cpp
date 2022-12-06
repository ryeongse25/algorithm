#include <string>
#include <vector>

using namespace std;

int solution(string str1, string str2) {
    int answer = str1.find(str2);
    if (answer == -1) answer = 2;
    else answer = 1;
    return answer;
}