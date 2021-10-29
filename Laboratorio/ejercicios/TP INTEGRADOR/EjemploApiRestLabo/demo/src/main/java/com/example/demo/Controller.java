package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

/** url: http://localhost:8080/api/... **/

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    @Autowired
    private AccesoBaseDeDatos accesoABaseDeDatos;

    public Controller() {
        this.accesoABaseDeDatos = new AccesoBaseDeDatos("personas","alumnos");
    }


    @RequestMapping(value = "datos/alumnos", method = RequestMethod.GET)
    public ResponseEntity<Object> obtenerPaginas() throws SQLException {
        accesoABaseDeDatos.conectar("alumno","alumnoipm");
        HashMap<String, Object> datos = accesoABaseDeDatos.obtenerDatos();
        return new ResponseEntity<>(datos, HttpStatus.OK);
    }

    @RequestMapping(value = "datos/alumnos", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarPagina(@RequestBody HashMap alumno) {
        accesoABaseDeDatos.conectar("alumno","alumnoipm");
        int id = Integer.parseInt((String) alumno.get("id"));
        String nombre = (String) alumno.get("nombre");
        int edad = Integer.parseInt((String) alumno.get("edad"));
        Alumno nuevoAlumno = new Alumno(id,nombre,edad);
        accesoABaseDeDatos.agregarAlumno(nuevoAlumno);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "datos/alumnos/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Object> modificarAlumno(@RequestBody HashMap alumno,@PathVariable int id) {
        accesoABaseDeDatos.conectar("alumno","alumnoipm");
        String campo = (String) alumno.get("campo");
        System.out.println(campo);
        String valor = (String) alumno.get("nuevoValor");
        System.out.println(valor);

        String consulta = "UPDATE " + accesoABaseDeDatos.getNombreTabla() + " SET "  + campo + " = '" + valor + "' WHERE id = " + id;
        accesoABaseDeDatos.modificarTabla(consulta);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "datos/alumnos/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> obtenerInformacionDeAlumno(@PathVariable int id){
        accesoABaseDeDatos.conectar("alumno","alumnoipm");
        HashMap<String, Object> infoDeRespuesta = new HashMap<>();
        String consulta = "SELECT * FROM alumno WHERE id = " + id;
        Alumno alumno = accesoABaseDeDatos.buscarAlumno(consulta);
        HashMap<String,Object> datos = new HashMap<>();
        datos.put("Persona:", alumno);
        return new ResponseEntity<>(alumno,HttpStatus.OK);

    }

    @RequestMapping(value = "datos/alumnos/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> borrarAlumno(@PathVariable int id) throws SQLException {
        accesoABaseDeDatos.conectar("alumno","alumnoipm");
        String consulta = "DELETE FROM alumno WHERE id = " + id;
        accesoABaseDeDatos.modificarTabla(consulta);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

