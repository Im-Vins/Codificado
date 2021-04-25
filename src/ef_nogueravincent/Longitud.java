/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ef_nogueravincent;

import java.io.IOException;

/**
 *
 * @author Vins
 */
public class Longitud {
    //longitud de 0 a 180 
    private int  grados, minutos, segundos;
    private String orientacion;

//    @Override
//    public String toString() {
//        return "Longitud{" + "grados=" + grados + ", minutos=" + minutos + ", segundos=" + segundos + ", orientacion=" + orientacion + '}';
//    }

    public Longitud(int grados, int minutos, int segundos, String orientacion) {
        this.grados = grados;
        this.minutos = minutos;
        this.segundos = segundos;
        this.orientacion = orientacion;
    }
    public String encriptarLongitud(int grados, int minutos, Double segundos, String orientacion){
      String datos;
       if(grados>180||grados<0)throw new RuntimeException ("No existe ese valor");
        if(grados>180||grados<0)throw new NumberFormatException ("No existe ese valor");
      if(segundos>60||segundos<0) throw new RuntimeException("No existe ese valor");
       if(segundos>60||segundos<0) throw new NumberFormatException ("No existe ese valor");
      if(minutos>60||minutos<0) throw new RuntimeException("No existe ese valor");
        if(minutos>60||minutos<0) throw new NumberFormatException ("No existe ese valor");
        try{
        if(180>grados&&grados>0){
            grados=(grados*grados);
            
        }
                
        if(minutos<0&&minutos>60){
            System.out.println("Dato invalido");
        }
        if(segundos<=30){
            segundos=segundos/10;
        }
            
        
        if(orientacion.equals("Este" +" ")){
            orientacion="oeste";
        }else if(orientacion.equals("Oeste"+ " ")){
            orientacion="este";
        }
        datos=grados+"º"+" "+minutos+"'"+" "+segundos+" "+ orientacion;
        
    } catch(RuntimeException exception){
            datos="Datos invalidos";
    }
        return datos;
    }
    

    public int getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
    
    
    
}
