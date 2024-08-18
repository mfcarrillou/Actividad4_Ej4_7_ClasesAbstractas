package ej4_7_clasesabstractas;

public abstract class Felinos extends Animal {
    
    public Felinos (String snd, String almnts, String hbtt, String nombre){
        sonido = snd;
        alimentos = almnts;
        habitat = hbtt;
        nombreCientifico = nombre;
    }
    
    public String getSonido(){
        return sonido;
    }
    
    public String getAlimentos(){
        return alimentos;
    }
    
    public String getHabitat(){
        return habitat;
    }
    
    public String getNombreCientifico(){
        return nombreCientifico;
    }
    
}