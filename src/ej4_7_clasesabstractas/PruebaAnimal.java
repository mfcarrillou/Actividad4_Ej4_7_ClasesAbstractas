package ej4_7_clasesabstractas;

public class PruebaAnimal {

    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        
        int i, tamano;
        tamano = animales.length;
        
        for (i = 0; i < tamano; i++){
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("\tSonido: " + animales[i].getSonido());
            System.out.println("\tAlimentos: " + animales[i].getAlimentos());
            System.out.println("\tHábitat: " + animales[i].getHabitat());
            System.out.println();
        }
    }
   
}