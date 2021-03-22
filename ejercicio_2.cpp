#include <iostream>
#include <vector>
#include <stdlib.h>

using namespace std;

int main(){
    vector<string> productos = {"lapiz 2B","auricular","pelota","coca"};
    vector<int> precios = {80,1250,900,100};

    bool estado_compra = true;
    char letra;
    int precio_total = 0, aux;

    while(estado_compra){
        cout << "Lista de productos:" << endl;
        for(int i = 0;i < productos.size();i++){
            cout << i+1 << ". " << productos[i] << " - " << precios[i] << "$" << endl;
        }
        cout << "0. Para salir" << endl;
        cout << "Importe Parcial: " << precio_total << endl;

        cout << "Que producto desea agregar?" << endl;
        cin >> aux;

        if(aux == 0){
            break;
        }

        precio_total += precios[aux-1];

        system("clear");

        cout << "Importe Parcial: " << precio_total << endl;
        cout << "DESEA SEGUIR COMPRANDO? INGRESE n PARA SALIR" << endl;
        cin >> letra;
        if(letra == 'n'){
            estado_compra = false;
        }

        system("clear");
    }

    cout << "Precio Total: " << precio_total << endl;




    return 0;
}