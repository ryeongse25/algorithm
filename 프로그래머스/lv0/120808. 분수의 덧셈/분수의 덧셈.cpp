#include <string>
#include <vector>

using namespace std;

// 최대공약수
int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

// 최소공배수
int lcm(int a, int b) {
    return a * b / gcd(a, b);
}

vector<int> solution(int denum1, int num1, int denum2, int num2) {
    vector<int> answer;
    
    // 공통분모
    int num = lcm(num1, num2);
    // 분자
    int denum = denum1 * (num / num1) + denum2 * (num / num2);
    
    // 약분
    for (int i=min(denum, num); i>=1; i--) {
        if (denum % i == 0 && num % i == 0) {
            denum /= i;
            num /= i;
        }
    } 
    
    answer.push_back(denum);
    answer.push_back(num);
    return answer;
}