package edu.escuelaing.arep;

public class Conversion {
    //private Float numAconvertir;
    private Float Resultado;

    public Conversion(){
    }

    public Float convertirAfahrenheit (Float numAconvertir){
        Resultado = (numAconvertir * 9/5) + 32;
        return Resultado;
    }

    public Float convertirAcelcius (Float numAconvertir){
        Resultado = ((5*numAconvertir)-160)/9;
        return Resultado;
    }
    public Float getResultado(){
        return Resultado;
    }

    public void setResultado(Float resultado){
        this.Resultado = resultado;
    }
}
