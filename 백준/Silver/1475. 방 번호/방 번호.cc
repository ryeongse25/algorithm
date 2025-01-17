#include <iostream>
#include <algorithm>
#include <map>

using namespace std;

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);
    
    string s;
    cin >> s;
    
    map<char, int> mp;
    
    for (int i=0; i<s.size(); i++) {
        char c = s[i];
        int n = c - 48;
        if (n == 9) mp[6]++;
        else mp[n]++;
    }
    
    if (mp[6] % 2 == 0) mp[6] /= 2;
    else mp[6] = mp[6] / 2 + 1;
    
    int cnt=0;
    for(int i=0; i<10; i++) {
        cnt = max(cnt, mp[i]);
    }
    
    cout << cnt;
}
