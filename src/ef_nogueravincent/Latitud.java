/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ef_nogueravincent;

/**
 *
 * @author Vins
 */
public class Latitud {
    //latitud de 0 a 90
    private int grados, minutos;
    Double segundos;
    private String orientacion;

    public Latitud(int grados, int minutos, Double segundos, String orientacion) {
        this.grados = grados;
        this.minutos = minutos;
        this.segundos = segundos;
        this.orientacion = orientacion;
    }
    
    public String encriptarLatitud(int grados, int minutos, Double segundos, String orientacion){
       String datos;
        if(grados>90||grados<0)throw new RuntimeException ("No existe ese valor");
        if(grados>90||grados<0)throw new NumberFormatException ("No existe ese valor");
      if(segundos>60||segundos<0) throw new RuntimeException("No existe ese valor");
       if(segundos>60||segundos<0) throw new NumberFormatException ("No existe ese valor");
      if(minutos>60||minutos<0) throw new RuntimeException("No existe ese valor");
        if(minutos>60||minutos<0) throw new NumberFormatException ("No existe ese valor");
      try{
        if(90>grados&&grados>0){
            grados=(grados*10)+200;
            
        }else{
            System.out.println("Dato invalido");
        }
        if(minutos>30){
            minutos=minutos*minutos;
        }else if(minutos<0&&minutos>60){
            System.out.println("Dato invalido");            
        }
        if(segundos<=30){
            segundos=segundos/10;
        }else if(segundos>=61) {
            System.out.println("Dato invalido");
            
        }
        if(orientacion.equals("Norte" +" ")){
            orientacion="Tita";
        }else if(orientacion.equals("Sur"+ " ")){
            orientacion="fox";
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

    public Double getSegundos() {
        return segundos;
    }

    public void setSegundos(Double segundos) {
        this.segundos = segundos;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
    
}
