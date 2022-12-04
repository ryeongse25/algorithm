#include <iostream>
#include <algorithm>

using namespace std;

int n, m;
int arr[50][50];

bool in_range(int i, int j, int l) {
    return (i+l < n && j+l < m);
}

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);

    int result = 1;
    cin >> n >> m;
    
    for (int i=0; i<n; i++) {
        
        string row;
        cin >> row;
        
        for (int j=0; j<m; j++) {
            arr[i][j] = row[j] - '0';
        }
        
    }
    
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            for (int l=1; l<min(n,m); l++) {
                // 꼭지점 4개 : arr[i][j], arr[i+l][j], arr[i][j+l], arr[i+l][j+l]
                if (in_range(i, j, l) && arr[i][j] == arr[i+l][j] && arr[i][j] == arr[i][j+l] && arr[i][j] == arr[i+l][j+l]) {
                    result = max(result, l + 1);
                }
            }
        }
    }
    cout << result * result;
}