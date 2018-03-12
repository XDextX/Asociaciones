package com.dext.gestor;
import com.dext.gestor.Gestor;

public class GestorEmpleados extends Gestor {
    public GestorEmpleados() {
    }
    public String[]listarRepresentantes(){
        return logica.listarEmpleados();
    }
    public boolean validarCedula(String cedula){
        boolean valido=true;
        if (!logica.validdarCedula(cedula)){
            valido=false;
        }
        return valido;
    }
    public void nuevoEmpleado(String nombre,String cedula){
        logica.nuevoEmpleado(nombre,cedula);
    }

}
