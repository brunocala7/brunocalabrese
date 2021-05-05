#include <iostream>
#include <vector>

using namespace std;

int main(){
    int num_1,num_2;
    vector<int> v;

    v.push_back(34);
    v.push_back(9032);
    v.push_back(7);

    cout << "Ingrese un numero: ";
    cin >> num_1;
    cout << "Ingrese otro numero: ";
    cin >> num_2;

    cout << "Resultado = " << num_1 + num_2 << endl;

    return 0;
}