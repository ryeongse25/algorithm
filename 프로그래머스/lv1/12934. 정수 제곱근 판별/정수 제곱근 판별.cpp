#include <string>
#include <vector>
#include <cmath>

using namespace std;

long long solution(long long n) {
    int num = sqrt(n);
    if (num == sqrt(n)) return pow(num + 1, 2);
    return -1;
}