import java.io.*;
import java.util.*;

class Dijkstra{
  Ciudad A;
  int vNumber; // nu'mero de ve'rtices
  int graphMatrix[][];
  final static int INF = 99999;
  String variable;

  Dijkstra(int n, int[][] graph, Ciudad A,String variable){
    vNumber  = n;
    graphMatrix = graph;
    this.A=A;
    this.variable=variable;
  }

   //funcion utilitaria para retornar el nodo con la minima distancia
   private int minDistance(int dist[], boolean includedPath[]){

     //inicializar nuestro valor minimo
     int min = INF, min_node = -1;

     for(int i =0; i<vNumber; i++){
       if(includedPath[i]==false && dist[i]<=min){
         min = dist[i];
         min_node = i;
       }
     }
     return min_node;
   }


   //funcion utilitaria para imprimir nuestros resultados
   private String printResult(int dist[], int d){
	 String respuesta="";
     respuesta+=dist[d];
     return respuesta;
   }

  //recorrido de dijkstra
  public String traversal(int s, int d){ //si d es igual a -1 entonces vamos a retornar
    // las distancias hacia todos los otros nodos, caso contrario
    // retornamos solo la distancia hasta el nodo d

    // vector que va a contener nuestras distancias mas cortas de ese s para ese default:
    int dist[] = new int[vNumber];

    // array donde colocaremos si un nodo es parte de nuestro
    //camino mas corto
    boolean includedPath[] = new boolean[vNumber];

    // inicializar todas las distancias con infinito
    // y todos nuestros includedPath como falso

    for(int i=0; i<vNumber; i++){
      dist[i] = INF;
      includedPath[i] = false;
    }

    // la distancia del nodo hacia el mismo nodo
    dist[s] = 0;


    //vamos a encontrar todas las distancias minimos
    for(int count=0; count < vNumber-1; count++){

        // escoger el nodo con la distancia minima del conjunto
        // de nodos que no fueron procesados, que estan con
        // falso dentro del includedPath
        int u = minDistance(dist, includedPath); // nodo de la minima distancia

        // marcamos ese nodo u como procesado
        includedPath[u] = true;

        //actualizamos los vectores de las distancias
        // de los nodos adyacentes del nodo escogido

        for(int v=0; v<vNumber; v++){
          // actualizar dist[v] si y solo si no esta en includedPath
          // hay una arista entre u y v, y el peso de la ruta entre
          // s y v a traves de u es mas pequenho que el valor
          //actual de dist[v]

          if(!includedPath[v] && graphMatrix[u][v]!=INF && dist[u]+graphMatrix[u][v]<dist[v]){
            dist[v] = dist[u] + graphMatrix[u][v];
          }
        }
    }
    String rutaMasCorta="";
    if(variable.contentEquals("auto")) {
    	rutaMasCorta=rutaAuto(dist,d);
    }
    else {
    	rutaMasCorta=rutaPie(dist,d);
    }
    //imprimir el resultado
    return printResult(dist, d)+":"+rutaMasCorta;
  }

  public String rutaAuto(int[] distancias, int d) {
	  String ruta=A.nodos[d].nombre+"<-";
	  int nodoActual=d;
	  int resto=-1;
	  while(resto!=0) {
		  for(int i=0;i<distancias.length;i++) {
			  if(A.matrizauto[nodoActual][i]!=99999) {
				  resto=distancias[nodoActual]-A.matrizauto[nodoActual][i];
				  if(resto==distancias[i]) {
					  nodoActual=i;
					  ruta+=A.nodos[nodoActual].nombre+"<-";
					  i=distancias.length;
				  }
			  }
		  }
	  }
	  return ruta;
  }
  
  public String rutaPie(int[] distancias, int d) {
	  String ruta=A.nodos[d].nombre+"<-";
	  int nodoActual=d;
	  int resto=-1;
	  while(resto!=0) {
		  for(int i=0;i<distancias.length;i++) {
			  if(A.matrizpie[nodoActual][i]!=99999) {
				  resto=distancias[nodoActual]-A.matrizpie[nodoActual][i];
				  if(resto==distancias[i]) {
					  nodoActual=i;
					  ruta+=A.nodos[nodoActual].nombre+"<-";
					  i=distancias.length;
				  }
			  }
		  }
	  }
	  return ruta;
  }

}