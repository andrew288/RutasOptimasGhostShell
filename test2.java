
public class test2 {

	public static void main(String[] args) {
		//creamos nuestra ciudad
		Ciudad arequipa= new Ciudad(29);
		//a�adimos los vertices
		arequipa.a�adirNodo("A",1);
		arequipa.a�adirNodo("B",2);
		arequipa.a�adirNodo("C",3);
		arequipa.a�adirNodo("D",4);
		arequipa.a�adirNodo("E",5);
		
		//a�adimos los vertices
		arequipa.a�adirVertice(1, 2, 4, 4);
		arequipa.a�adirVertice(1, 3, 8, 8);
		arequipa.a�adirVertice(1, 4, 3, 3);
		arequipa.a�adirVertice(1, 5, 2, 2);
		arequipa.a�adirVertice(2, 4, 7, 7);
		arequipa.a�adirVertice(2, 3, 1, 1);
		arequipa.a�adirVertice(3, 4, 2, 2);
		arequipa.a�adirVertice(4, 5, 7, 7);
		
		//Dijkstra
		//Dijkstra A= new Dijkstra(5,arequipa.matrizauto,arequipa);
		//System.out.println(A.traversal(1-1, 3-1));

	}

}
