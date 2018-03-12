package com.dext.cl;

import java.util.ArrayList;

public class CL {
    ArrayList<Empleado>empleados;
    ArrayList<Computadora>computadoras;

    public CL() {
        this.empleados = new ArrayList<>();
        this.computadoras = new ArrayList<>();
    }

    public void nuevoEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public Empleado nuevoEmpleado(String cedula,String nombre){
        Empleado miempleado=new Empleado(cedula,nombre);
        return miempleado;
    }
    public void nuevaComputadora(String serie,String marca,String nombre,String cedula){
        Computadora miComputadora=new Computadora(serie,marca,nuevoEmpleado(cedula,nombre));
        computadoras.add(miComputadora);
        nuevoEmpleado(miComputadora.getResponsable());
    }
    public void nuevaComputadora(String serie,String marca){
        Computadora miComputadora=new Computadora(serie,marca);
        computadoras.add(miComputadora);
    }
    public boolean validdarCedula(String cedula){
        boolean valido =true;
        for (Empleado var:empleados ) {
            if (var.getCedula().equals(cedula)){
                valido=false;
            }
        }
        return valido;
    }
    public boolean validarSerie(String serie){
        boolean valido=true;
        for (Computadora var:computadoras) {
            if (var.getSerie().equals(serie)){
                valido=false;
            }
        }
        return valido;
    }
    public String[] listarEmpleados(){
        String lista[]=new String[empleados.size()];
        int i=0;
        for (Empleado var:empleados) {
            lista[i]=var.toString();
            i++;
        }
        return lista;
    }
    public String[] listarComputadoras(){
        String lista[]=new String[computadoras.size()];
        int i=0;
        for (Computadora var:computadoras) {
            lista[i]=var.toString();
            i++;
        }
        return lista;
    }
}
