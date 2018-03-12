package com.dext.gestor;
import com.dext.gestor.Gestor;

public class GestorComputadoras extends Gestor {
    public GestorComputadoras() {
    }
    public void nuevaComputadora(String serie,String marca,String nombre,String cedula){
        logica.nuevaComputadora(serie,marca,nombre,cedula);
    }
    public void nuevaComputadora(String serie,String marca){
        logica.nuevaComputadora(serie,marca);

    }
    public String[]listarComputadoras(){
        return logica.listarComputadoras();
    }
    public boolean validarSerie(String serie){
        boolean valido=true;
        if (!logica.validarSerie(serie)){
            valido=false;
        }
        return valido;
    }
}
