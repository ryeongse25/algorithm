#include <iostream>
#include <queue>

using namespace std;

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);
    
    priority_queue<int> pq;
    
    int n, sum=0;
    cin >> n;
    
    while(n--) {
        int num;
        cin >> num;
        
        pq.push(-num);
    }
    
    while(pq.size() > 1) {
        
        int n1 = -pq.top();
        pq.pop();
        
        int n2 = -pq.top();
        pq.pop();
        
        sum += n1 + n2;

        pq.push(-(n1 + n2));
    }
    
    cout << sum;
}