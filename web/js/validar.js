function validar(){
var nombre, apellidos,correo,numerodeserie,comentarios,fecha,
nombre = document.getElementById("nombre").value;
apellido= document.getElementById("apellido").value;
correo = document.getElementById("correo").value;
numerodeserie = document.getElementById("ns").value;
comentarios = document.getElementById("comentario").value;
fecha = document.getElementById("fecha").value;
if(nombre ===""|| apellido ===""||correo ===""||numerodeserie===""||comentarios ===""|| fecha ===""){
alert("Todos los campos son obligatorios");
return false;
}
