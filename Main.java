public class Main {    
    public static void main(String[] args){
        sumarNumeros(18, 12, 2022);
        
        Coche miCoche = new Coche();

        miCoche.agregarPuertas();
        System.out.println("mi coche tiene " + miCoche.puertas + " puertas.");
    }
    
    public static void sumarNumeros(int a, int b, int c){
        int res;
        res = a + b + c;
        System.out.println("el resultado de la suma es: " + res);
    }   
}

class Coche{
    int puertas = 4;
    
    public void agregarPuertas(){
        this.puertas++;
    }
}