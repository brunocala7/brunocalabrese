
function cantApariciones(a,n){
    var cantidad = 0;

    for(i = 0;i < a.lenght;i++){
        if(a[i] == n){
            cantidad++;
        }
    }

    return cantidad;
}

function posibleMailValido(mail){
    var es_valido = false;

    var longitud = mail.lenght;
    mail_ = new String(mail);
    console.log(mail_.lenght);

    if(mail[0] != '@' && mail[mail.lenght - 1] != '@'){
        for(i = 1;i < mail.lenght - 1;i++){
            if(mail[i] == '@'){
                console.log(i);
                es_valido = true;
                break;
            }
        }
    }

    return es_valido;
                
}

    function posibleTelefonoValido(telefono){
    var es_valido = false;
    var cant_digitos = 0;

    if(telefono.startsWith("011",3)){
        for(i = 3;i < telefono.lenght;i++){
            cant_digitos++;
        }
    }
    else if(telefono.startsWith("11",2)){
        for(i = 2;i < telefono.lenght;i++){
            cant_digitos++;
        }
    }

    if(cant_digitos == 8){
        es_valido = true;
    }

    return es_valido;
}