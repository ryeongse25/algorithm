#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);
    
    vector<int> v;
    
    for(int i=0; i<9; i++) {
        int x;
        cin >> x;
        v.push_back(x);
    }
    
    int sum = 0;
    
    for(int i=0; i<9; i++) {
        sum += v[i];
    }
    
    for(int i=0; i<9; i++) {
        for(int j=i+1; j<9; j++) {
            
            if (sum - v[i] - v[j] == 100) {
                for(int l=0; l<9; l++) {
                    if (l != i && l != j) {
                        cout << v[l] << "\n";
                    }
                }
            }
        }
    }
    
}
