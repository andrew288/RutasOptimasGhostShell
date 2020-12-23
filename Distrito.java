
public class Distrito {
	
	public String nombre;
	public int numero;
	public Distrito(String nombre, int numero) {
		this.nombre=nombre;
		this.numero=numero;
	}
	public Distrito(int numero) {
		this.numero=numero;
	}
	public String toString() {
		return "Nombre: "+nombre+"\n"+
				"Nodo: "+numero;
	}

}
