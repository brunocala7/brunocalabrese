#include <iostream>
#include <vector>

using namespace std;

int main(){
    string palabra;
    vector<string> v;

    for(int i = 0;i < 6;i++){
        cin >> palabra;

        v.push_back(palabra);
    }

    cout << endl << endl;

    cout << "Índice par: ";

    for(int i = 0;i < v.size();i += 2){
        if(i == v.size()-2){
            cout << v[i] << endl;
        }
        else{
            cout << v[i] << " - ";
        }
    }

    cout << "Índice impar: ";

    for(int i = 1;i < v.size();i += 2){
        
        if(i == v.size()-1){
            cout << v[i] << endl;
        }
        else{
            cout << v[i] << " - ";
        }
    }

    return 0;
}