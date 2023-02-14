public class Main {    
    public static void main(String[] args){
        sumarNumeros(18, 12, 2022);
        
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println("el numero de puertas de mi coche es de: " + miCoche.puertas);
    }
    
    public static int sumarNumeros(int a, int b, int c){
        return a + b + c;
    }   
}

class Coche{
    int puertas = 4;
    
    public void agregarPuertas(){
        this.puertas++;
    }
}
