#include <iostream>
#include <vector>

using namespace std;

int main(){
    vector<int> v;
    int n;
    
    for(int i = 0;i < 3;i++){
        cin >> n;
        v.push_back(n);
    }

    for(int a : v){
        cout << a << " ";
    }

    cout << endl;

    return 0;
}