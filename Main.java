public class Main {

    // void function not have return
    // public static void main(String[] args) {
        
    //     int resultado;
    //     resultado = suma(10, 30);
    //     System.out.println(resultado);

    //     String concatenated;
    //     concatenated = sumaString("Hello ", "World!");
    //     System.out.println(concatenated);
    // }

    // // funcion estática que devuelve un entero(int) llamada suma.
    // public static int suma(int a, int b){
    //     return a + b;
    // }

    // public static String sumaString(String x, String y){
    //     var result = x + y;
    //     return result;
    // }
    
    public static void main(){
        sumarNumeros(18, 12, 2022);
        
        Coche miCoche = new Coche();
        miCoche.puertas += 1;
        System.out.println(miCoche.puertas);
    }
    
    public static int sumarNumeros(int a, int b, int c){
        return a + b + c;
    }
    
    public class Coche{
        int puertas = 4;
        
        public static void agregarPuertas(){
                
        }
    }
    
}
