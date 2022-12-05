#include <algorithm>
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    sort(numbers.begin(), numbers.end());
    int answer = numbers[numbers.size()-2] * numbers[numbers.size()-1];
    return answer;
}