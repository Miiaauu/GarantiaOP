
function sendData2Back() {
    var idFormulario;
    var nombreUsuario;
    var apellidoUsuario;
    var numeroSerie;
    var descripcion;
    var fecha;
    var correo;


    console.log(idFormulario);
    console.log(nombreUsuario);

    $.post("Registra",
    {
    idFormulario : idFormulario,
    nombreUsuario : nombreUsuario,
    apellidoUsuario : apellidoUsuario,
    numeroSerie : numeroSerie,
    descripcion : descripcion,
    fecha : fecha,
    correo : correo
}

    ,
    function(data){
        if(data.resultado === true){
           
        }  
        else{
            
        }
    }
    );
}


