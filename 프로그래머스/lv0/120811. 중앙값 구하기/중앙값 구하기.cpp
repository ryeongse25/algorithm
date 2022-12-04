#include <algorithm>
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array) {
    sort(array.begin(), array.end());
    int mid = array.size() / 2;
    int answer = array[mid];
    return answer;
}