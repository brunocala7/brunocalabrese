let margen = "1cm";

function moverHaciaDerecha (){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargen = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargen + "cm";
    cuadrado.style.marginLeft = margen;

}

function moverHaciaIzquierda (){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargen = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargen + "cm";
    cuadrado.style.marginLeft = margen;
}

function moverHaciaAbajo (){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargen = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargen + "cm";
    cuadrado.style.marginTop = margen;
}

function moverHaciaArriba (){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargen = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargen + "cm";
    cuadrado.style.marginBottom = margen;
}