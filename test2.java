
public class test2 {

	public static void main(String[] args) {
		//creamos nuestra ciudad
		Ciudad arequipa= new Ciudad(29);
		//aņadimos los vertices
		arequipa.aņadirNodo("A",1);
		arequipa.aņadirNodo("B",2);
		arequipa.aņadirNodo("C",3);
		arequipa.aņadirNodo("D",4);
		arequipa.aņadirNodo("E",5);
		
		//aņadimos los vertices
		arequipa.aņadirVertice(1, 2, 4, 4);
		arequipa.aņadirVertice(1, 3, 8, 8);
		arequipa.aņadirVertice(1, 4, 3, 3);
		arequipa.aņadirVertice(1, 5, 2, 2);
		arequipa.aņadirVertice(2, 4, 7, 7);
		arequipa.aņadirVertice(2, 3, 1, 1);
		arequipa.aņadirVertice(3, 4, 2, 2);
		arequipa.aņadirVertice(4, 5, 7, 7);
		
		//Dijkstra
		//Dijkstra A= new Dijkstra(5,arequipa.matrizauto,arequipa);
		//System.out.println(A.traversal(1-1, 3-1));

	}

}
