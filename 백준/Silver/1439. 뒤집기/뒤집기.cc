#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);
    
    string s;
    int ones = 0, zeros = 0;
    cin >> s;
    s += s.back();
    for(int i=0; i<s.size(); i++) {
        if( s[i] != s[i+1] ) {
            if (s[i] == '0') zeros++;
            else ones++;
        }
    }
    
    int answer = min(zeros, ones);
    
    cout << answer;
}
