
public class test2 {

	public static void main(String[] args) {
		//creamos nuestra ciudad
		Ciudad arequipa= new Ciudad(29);
		//añadimos los vertices
		arequipa.añadirNodo("A",1);
		arequipa.añadirNodo("B",2);
		arequipa.añadirNodo("C",3);
		arequipa.añadirNodo("D",4);
		arequipa.añadirNodo("E",5);
		
		//añadimos los vertices
		arequipa.añadirVertice(1, 2, 4, 4);
		arequipa.añadirVertice(1, 3, 8, 8);
		arequipa.añadirVertice(1, 4, 3, 3);
		arequipa.añadirVertice(1, 5, 2, 2);
		arequipa.añadirVertice(2, 4, 7, 7);
		arequipa.añadirVertice(2, 3, 1, 1);
		arequipa.añadirVertice(3, 4, 2, 2);
		arequipa.añadirVertice(4, 5, 7, 7);
		
		//Dijkstra
		//Dijkstra A= new Dijkstra(5,arequipa.matrizauto,arequipa);
		//System.out.println(A.traversal(1-1, 3-1));

	}

}
