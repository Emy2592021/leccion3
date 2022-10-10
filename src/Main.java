

public class Main
{
    public static void main(String[] args) {    	
    	 
    	System.out.println("Primer Ejercicio -----------------------------------\n");
    	
    	sumaDeTres(2,2,2); 
    	
    	System.out.println("\nSegundo Ejercicio -----------------------------------\n");
    	
    	Coche miCoche = new Coche();
    	
    	System.out.println("Mi Coche ahora tiene " + miCoche.agregarPuertas(1) + " puertas");
       	                   
        
    }
    
    public static void sumaDeTres(int num1, int num2, int num3) {
    	
    	 int suma = num1 + num2 +num3;
    			 
    	 System.out.println(suma);
    }
    
    
}


