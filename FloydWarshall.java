import java.io.*;
import java.util.*;
public class FloydWarshall {
	
	  public int vNumber; // nu'mero de ve'rtices
	  public int graphMatrix[][];
	  public final static int INF = 99999;

	  public FloydWarshall(int n, int[][] graph){
	    vNumber  = n;
	    graphMatrix = graph;
	  }

	   //funcion utilitaria para imprimir nuestros resultados
	   private void printResult(int dist[][]){
	     System.out.println("Matriz de distancias m'as cortas");

	     for(int i=0; i<vNumber; i++){
	       for(int j=0; j<vNumber; j++){
	         if(dist[i][j] == INF){
	            System.out.print("INF ");
	         }
	         else{
	            System.out.print(dist[i][j]+" ");
	         }
	       }
	       System.out.println();
	     }
	   }


	  //recorrido de FloydWarshall
	  public void traversal(){

	    // memorizacion va a ser una matriz donde acumularemos
	    // las distancias
	    int dist[][] = new int[vNumber][vNumber];


	    //vamos a inicializar nuestras distancias con los pesos
	    //originales del grafo
	    for(int i=0; i<vNumber; i++){
	      for(int j=0; j<vNumber; j++){
	        dist[i][j] = graphMatrix[i][j];
	      }
	    }

	    for(int k=0; k<vNumber; k++){
	      //escoger todos los vertices como origen uno por uno
	      for(int i=0; i<vNumber; i++){
	        //elegir todos los vertices como destino para el
	        //vertice que fue seleccionado como origen
	        for(int j=0; j<vNumber; j++){
	          //si es que el vertice de k esta en la ruta mas corta de i a j,
	          // entonces actualizamos el valor de dist[i][j]
	          if(dist[i][k]+dist[k][j]< dist[i][j]){
	            dist[i][j] = dist[i][k]+dist[k][j];
	          }

	        }
	      }
	    }
	    //imprimir el resultado
	    printResult(dist);
	  }
}
