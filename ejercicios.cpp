#include "ejercicios.h"
#include <iostream>
#include <vector>

bool esPar(int n){
    bool es_par = false;
    
    if(n % 2 == 0){
        es_par = true;
    }

    return es_par;
}

bool todosSonPares(vector<int> numeros){
    bool son_pares = true; 

    for(int i = 0;i < numeros.size();i++){
        if(numeros[i] % 2 != 0){
            son_pares = false;
            break;
        }
    }

    return son_pares;
}

void agregarNumeros(vector<int> &numeros, vector<int> elementosNuevos){
    for(int i = 0;i < elementosNuevos.size();i++){
        numeros.push_back(elementosNuevos[i]);
    }
}

void imprimirValores(vector<int> numeros){
    for(int i = 0;i < numeros.size();i++){
        cout << numeros[i];
        if(i == numeros.size()-1){
            cout << endl;
            break;
        }
        else{
            cout << " - ";
        }
    }
}

void eliminarImpares(vector<int> &numeros){
    vector<int> vectorConPares;
    for (int i = 0; i < numeros.size(); ++i) {
        int valorActual = numeros[i];
        if (esPar(valorActual)){
            vectorConPares.push_back(valorActual);
        }
    }
    numeros.clear();
    agregarNumeros(numeros,vectorConPares);

}

//necesitamos dos contadores

vector<vector<int> > multiplicarMatriz(vector<vector<int> > matriz){
    
}

void mezclarMatrices(vector<vector<int> > matrizA, vector<vector<int> > matrizB){
    
}
