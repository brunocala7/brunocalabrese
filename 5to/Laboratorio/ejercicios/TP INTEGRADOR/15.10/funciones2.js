function ingresoAlumno() {
    //obtiene los datos que el user pasa por el forms 
    var idIngresada = document.getElementById("id").value;
    var nombreIngresado = document.getElementById("nombre").value;
    var edadIngresada = document.getElementById("edad").value;

    let objetoConInformacion = {id:idIngresada,nombre:nombreIngresado,edad:edadIngresada};

    $.ajax({
        url: "http://localhost:8080/api/datos/alumnos",
        type: 'POST',
        contentType: "application/json",
        data: JSON.stringify(objetoConInformacion)
    })
    .done(function (data) {

        alert("Datos ingresados con éxito!");

    })
    .fail(function (jqXHR, textStatus, errorThrown) {
        console.log("error, no se pudo ingresar los nuevos datos");
        console.log(jqXHR);
        console.log(textStatus);
        console.log(errorThrown);
    });
}

function editarAlumno() {
    //obtiene los datos que el user pasa por el forms
    var idIngresada = $("#idAlumnoModificar").val();
    var campo = verificar();
    var valor = $("#valorAModificar").val();
    console.log(campo);

    let objetoConActualizacion = {campo : campo,nuevoValor : valor};

    $.ajax({
        url: "http://localhost:8080/api/datos/alumnos/" + idIngresada,
        type: 'PATCH',
        contentType: "application/json",
        data: JSON.stringify(objetoConActualizacion)
    })
    .done(function (data) {

        alert("Alumno modificado!");

    })
    .fail(function (jqXHR, textStatus, errorThrown) {
        console.log("error, no se pudo ingresar los nuevos datos");
        console.log(jqXHR);
        console.log(textStatus);
        console.log(errorThrown);
    });
}

function borrarAlumno(){
    var id = $("#idABorrar").val();

    var url = "http://localhost:8080/api/datos/alumnos/" + id;

    

    $.ajax({
        url: url,
        type: 'DELETE',
    })
    .done(function (data) {

        alert("El alumno fue borrado con éxito")

    })
    .fail(function (jqXHR, textStatus, errorThrown) {
        console.log("error, no se pudo ingresar los nuevos datos");
        console.log(jqXHR);
        console.log(textStatus);
        console.log(errorThrown);
    });
}

function verificar() {
    var campo = "";
    let valores = document.getElementsByName("check");
    for(var i = 0;i < valores.length;i++){
        if(valores[i].checked){
            var valor = valores[i].value;
            if(valor == 1){
                campo = "nombre";
            }
            else if(valor == 2){
                campo = "edad";
            }
        }
    }
    return campo;
}

function buscarAlumno() {
    var idIngresada = $("#idAlumnoABuscar").val();
    $.ajax({
        url: "http://localhost:8080/api/datos/alumnos/" + idIngresada,
        type: 'GET'
    })
    .done(function (data) {

        alert("Datos alumno" + "\n" + 
        "Id: " + idIngresada + "\n" + 
        "Nombre: " + data.nombre + "\n" +
        "Edad: " + data.edad + "\n");
    
    })
    .fail(function (jqXHR, textStatus, errorThrown) {
        console.log("error, no se pudo obtener datos");
        console.log(jqXHR);
        console.log(textStatus);
        console.log(errorThrown);
    });
}

function buscarTodosLosAlumnos() {
    $.ajax({
        url: "http://localhost:8080/api/datos/alumnos/",
        type: 'GET'
    })
    .done(function (data) {
        let arrayAlumnos = data.alumnos;

        var mensaje = "";

        for (let i = 0; i < arrayAlumnos.length; i++) {
            let alumno = arrayAlumnos[i];
            mensaje += "Alumno " + alumno.id + "\n" + "Nombre: " + alumno.nombre + "\n" + "Edad: " + alumno.edad + "\n" + "\n";
        }

        alert(mensaje);

    })
    .fail(function (jqXHR, textStatus, errorThrown) {
        console.log("error, no se pudo obtener datos");
        console.log(jqXHR);
        console.log(textStatus);
        console.log(errorThrown);
    });
}