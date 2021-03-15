#include <iostream>
#include <vector>

using namespace std;

int main (){
    int cant_numeros;
    int num_actual;
    int suma = 0;
    vector<int> v;

    cout << "Cuantos números quiere agregar? ";
    cin >> cant_numeros;

    for(int i = 0;i < cant_numeros;i++){
        cin >> num_actual;
        v.push_back(num_actual);
    }

    for(int i = 0;i < v.size();i++){
        suma += v[i];
    }

    cout << "La suma de los elementos del vector es: " << suma << endl;
}