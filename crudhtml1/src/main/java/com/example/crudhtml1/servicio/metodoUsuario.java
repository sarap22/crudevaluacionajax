package com.example.crudhtml1.servicio;

import com.example.crudhtml1.modelo.usuario;

import java.util.ArrayList;
import java.util.Arrays;

public class metodoUsuario {
    private ArrayList<usuario> lista = new ArrayList<>();

    public ArrayList<usuario> getLista() {
        return lista;
    }

    public String añadir(usuario usuario) {
        lista.add(usuario);
        return "Usuario añadido";
    }

    public String eliminar(int doc) {
        for (usuario i : lista) {
            if (i.getDocumento() == doc) {
                //int pos=lista.indexOf(i);
                lista.remove(i);
            }
        }
        return "Eliminado";
    }

    public boolean actualizar(int id, usuario user) {
        boolean retorno=true;
        for (usuario i : lista) {
            if (i.getDocumento() == id) {
                i.setNombre(user.getNombre());
                i.setApellido(user.getApellido());
                i.setEdad(user.getEdad());
                i.setDocumento(user.getDocumento());
                i.setEstadoCivil(user.getEstadoCivil());
                retorno=true;
            }
            else{
                retorno=false;
            }
        }
        return retorno;
    }

    public String  mostrarId(int id) {
        String retorno="";
        for (usuario i : lista) {
            if (i.getDocumento() == id) {
                //int pos=lista.indexOf(i);
                retorno=i.getNombre()+
                        i.getApellido()+
                        i.getEdad()+
                        i.getDocumento()+
                        i.getEstadoCivil();
            }
            else{
                retorno="El dato no se encontró en la lista";
            }
        }
        return retorno;
    }
}