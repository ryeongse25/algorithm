#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> array, int n) {
    
    sort(array.begin(), array.end());
    
    int answer = 0, diff = 100;
    
    for (int i=0; i<array.size(); i++) {
        
        if (abs(array[i] - n) < diff) {
            diff = abs(array[i] - n);
            answer = array[i];
        };
        
    }
    
    return answer;
}