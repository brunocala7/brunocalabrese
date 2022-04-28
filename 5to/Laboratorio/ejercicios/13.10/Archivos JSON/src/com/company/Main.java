package com.company;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Cine cine = new Cine("jfisj","fesfes");

        HashSet<Sala> salas = new HashSet<>();

        ArrayList<Visitante> historialVisitantes = new ArrayList<>();
        HashSet<Visitante> visitantesPresentes = new HashSet<>();

        for(int i = 0;i < 5;i++){
            Visitante visitante = new Visitante(i,5+i);
            historialVisitantes.add(visitante);
            visitantesPresentes.add(visitante);
        }

        for(int i = 0;i < 5;i++){
            Sala sala = new Sala(i,20+i);
            sala.setHistorialVisitantes(historialVisitantes);
            sala.setVisitantesPresentes(visitantesPresentes);
            salas.add(sala);
        }

        cine.setSalas(salas);

        try{
            ObjectMapper mapper = new ObjectMapper();

            HashMap<Integer,Integer> mapASerializar = cine.visitantesConCantidadDeVisitas();

            String objetoJson = mapper.writeValueAsString(mapASerializar);

            File archivo = new File("src/com/company/cine.json");
            mapper.writeValue(archivo,mapASerializar);

            String objectoJsonPersona = "{ \"nombre\":\"Bruno\" " + "\"edad\":\"17\"";

            HashMap map = mapper.readValue(objectoJsonPersona,HashMap.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
