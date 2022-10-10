
public class Coche {

	
	public int puertas;
	
	public Coche() {
		this.puertas = 4;
    }
	
	
	public Coche(int puertas) {
		this.puertas = puertas;
    }
	
	public  int agregarPuertas(int num) {
		
		puertas = puertas + num;
		
		return puertas;
	}
}
