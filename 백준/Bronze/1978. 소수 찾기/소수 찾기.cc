#include <iostream>

using namespace std;

bool prime(int x) {
    
    bool flag = true;
    
    if (x == 1) flag = false;
    
    for(int i=2; i<x; i++) {
        if (x % i == 0) flag = false;
    }
    
    return (flag ? true : false);
}

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);
    
    int n, cnt = 0;
    cin >> n;
    
    while(n--) {
        int num;
        cin >> num;
        (prime(num) ? cnt++ : cnt);
    }

    cout << cnt;
    
}