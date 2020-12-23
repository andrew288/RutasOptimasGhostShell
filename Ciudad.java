
public class Ciudad {
	public Distrito[] nodos;
	protected int[][] matrizauto;
	protected int[][] matrizpie;
	public static int puntero;
	public String nombre;
	//constructor
	public Ciudad(int tama�o) {
		puntero=0;
		nodos= new Distrito[tama�o];
		matrizauto= new int[tama�o][tama�o];
		matrizpie= new int[tama�o][tama�o];
		for(int i=0;i<tama�o;i++) {
			for (int j=0;j<tama�o;j++) {
				matrizauto[i][j]=99999;
				matrizpie[i][j]=99999;
			}
		}
	}
	//metodos
	//a�adir nodo
	public void a�adirNodo(String distrito, int numero) {
		nodos[puntero]= new Distrito(distrito,numero);
		puntero++;
	}
	//a�adir vertice
	public void a�adirVertice(int a, int b, int minutosAuto, int minutosPie) {
		if((a<1 || a>nodos.length) || (b<1 || b>nodos.length)) {
			System.out.println("Esta tratando de relacionar nodos no existentes");
		}
		else {
			//agregamos un valor a las matrices de adyacencia
			matrizauto[a-1][b-1]=minutosAuto;
			matrizauto[b-1][a-1]=minutosAuto;
			matrizpie[a-1][b-1]=minutosPie;
			matrizpie[b-1][a-1]=minutosPie;
		}
	}
	public String toString() {
		String texto="";
		for(int i=0;i<nodos.length;i++) {
			texto+="["+nodos[i].toString()+"]->";
		}
		return texto;
	}
}
