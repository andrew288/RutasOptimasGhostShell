
public class Test {

	public static void main(String[] args) {
		//creamos nuestra ciudad
		Ciudad arequipa= new Ciudad(29);
		//añadimos los vertices
		arequipa.añadirNodo("Cerro Colorado",1);
		arequipa.añadirNodo("Alto Selva Alegre",2);
		arequipa.añadirNodo("Miraflores",3);
		arequipa.añadirNodo("Mariano Melgar",4);
		arequipa.añadirNodo("Yanahuara",5);
		arequipa.añadirNodo("Arequipa",6);
		arequipa.añadirNodo("Sachaca",7);
		arequipa.añadirNodo("Tiabaya",8);
		arequipa.añadirNodo("Jose Luis Bustamante y Rivero",9);
		arequipa.añadirNodo("Paucarpata",10);
		arequipa.añadirNodo("Sabandia",11);
		arequipa.añadirNodo("Socabaya",12);
		arequipa.añadirNodo("Jacobo Hunter",13);
		arequipa.añadirNodo("Characato",14);
		arequipa.añadirNodo("Mollebaya",15);
		arequipa.añadirNodo("Quequeña",16);
		arequipa.añadirNodo("San Juan de Siguas",17);
		arequipa.añadirNodo("Santa Isabel de Siguas",18);
		arequipa.añadirNodo("Santa Rita de Siguas",19);
		arequipa.añadirNodo("Vitor",20);
		arequipa.añadirNodo("La Joya",21);
		arequipa.añadirNodo("Uchumayo",22);
		arequipa.añadirNodo("Yarabamba",23);
		arequipa.añadirNodo("Polobaya",24);
		arequipa.añadirNodo("Pocsi",25);
		arequipa.añadirNodo("Chiguata",26);
		arequipa.añadirNodo("San Juan de Tarucani",27);
		arequipa.añadirNodo("Cayma",28);
		arequipa.añadirNodo("Yura",29);
		//añadimos los vertices
		arequipa.añadirVertice(18, 17,49,283);
		arequipa.añadirVertice(17, 19,48,453);
		arequipa.añadirVertice(18, 20,59,853);
		arequipa.añadirVertice(17, 20,53,811);
		arequipa.añadirVertice(19, 20,24,590);
		arequipa.añadirVertice(20, 21,52,520);
		arequipa.añadirVertice(20, 22,67,579);
		arequipa.añadirVertice(20, 29,90,698);
		arequipa.añadirVertice(29, 22,39,249);
		arequipa.añadirVertice(22, 21,71,747);
		arequipa.añadirVertice(29, 1,17,92);
		arequipa.añadirVertice(1, 5,23,100);
		arequipa.añadirVertice(5, 7,12,45);
		arequipa.añadirVertice(7, 23,54,310);
		arequipa.añadirVertice(29, 28,29,155);
		arequipa.añadirVertice(1, 28,13,75);
		arequipa.añadirVertice(1, 22,35,157);
		arequipa.añadirVertice(23, 24,34,253);
		arequipa.añadirVertice(29, 27,150,1312);
		arequipa.añadirVertice(28, 27,140,1190);
		arequipa.añadirVertice(26, 27,115,955);
		arequipa.añadirVertice(28, 26,61,342);
		arequipa.añadirVertice(24, 25,24,180);
		arequipa.añadirVertice(24, 27,207,1395);
		arequipa.añadirVertice(25, 27,199,1225);
		arequipa.añadirVertice(28, 5,21,85);
		arequipa.añadirVertice(28, 2,22,105);
		arequipa.añadirVertice(22, 5,24,154);
		arequipa.añadirVertice(22, 7,22,112);
		arequipa.añadirVertice(22, 23,75,429);
		arequipa.añadirVertice(28, 6,20,94);
		arequipa.añadirVertice(2, 3,12,48);
		arequipa.añadirVertice(2, 6,20,70);
		arequipa.añadirVertice(2, 26,57,327);
		arequipa.añadirVertice(3, 4,11,44);
		arequipa.añadirVertice(3, 6,14,49);
		arequipa.añadirVertice(3, 26,48,288);
		arequipa.añadirVertice(4, 26,48,244);
		arequipa.añadirVertice(4, 6,14,53);
		arequipa.añadirVertice(4, 10,15,70);
		arequipa.añadirVertice(5, 8,17,19);
		arequipa.añadirVertice(5, 6,13,42);
		arequipa.añadirVertice(7, 8,8,48);
		arequipa.añadirVertice(7, 12,27,127);
		arequipa.añadirVertice(8, 12,32,155);
		arequipa.añadirVertice(8, 6,22,122);
		arequipa.añadirVertice(8, 9,28,149);
		arequipa.añadirVertice(6, 9,10,50);
		arequipa.añadirVertice(6, 10,23,123);
		arequipa.añadirVertice(10, 26,41,213);
		arequipa.añadirVertice(10, 11,32,135);
		arequipa.añadirVertice(10, 9,18,83);
		arequipa.añadirVertice(10, 13,29,133);
		arequipa.añadirVertice(26, 11,62,300);
		arequipa.añadirVertice(26, 14,56,292);
		arequipa.añadirVertice(26, 25,71,281);
		arequipa.añadirVertice(23, 12,37,203);
		arequipa.añadirVertice(23, 15,38,145);
		arequipa.añadirVertice(23, 16,13,66);
		arequipa.añadirVertice(9, 12,13,59);
		arequipa.añadirVertice(9, 13,13,57);
		arequipa.añadirVertice(12, 15,37,145);
		arequipa.añadirVertice(12, 13,15,52);
		arequipa.añadirVertice(13, 15,46,194);
		arequipa.añadirVertice(13, 14,30,134);
		arequipa.añadirVertice(13, 11,36,145);
		arequipa.añadirVertice(11, 14,18,75);
		arequipa.añadirVertice(14, 25,36,283);
		arequipa.añadirVertice(14, 15,26,94);
		arequipa.añadirVertice(15, 16,37,144);
		arequipa.añadirVertice(15, 25,34,214);
		arequipa.añadirVertice(16, 25,56,219);
		arequipa.añadirVertice(16, 24,46,191);
		arequipa.añadirVertice(25, 24,24,175);
		
		//Dijkstra rutaCortaAuto= new Dijkstra(arequipa,"auto",29);
		//System.out.println(rutaCortaAuto.traversal(17,19));
		
	}

}
