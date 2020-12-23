import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DemoCaminoCorto extends JFrame{
	Scanner sc = new Scanner(System.in);
	Ciudad arequipa= new Ciudad(29);
	Dijkstra rutaCortaAuto;
	Dijkstra rutaCortaPie;
	//añadimos los vertices
	//interface grafica
	private JFrame presentacion= new JFrame();
	//botones
	private ButtonGroup grupo= new ButtonGroup();
	private JRadioButton boton1= new JRadioButton("Distancia minima entre dos distritos",true);
	private JRadioButton boton2= new JRadioButton("Distancia minima entre todos los distritos");
	private JRadioButton boton3= new JRadioButton("Mapa de Arequipa");
	private JRadioButton boton7= new JRadioButton("Salir");
	String[] distritos= {"Cerro Colorado","Alto Selva Alegre","Miraflores",
						"Mariano Melgar","Yanahuara","Arequipa","Sachaca",
						"Tiabaya","Jose Luis Bustamante y Rivero","Paucarpata",
						"Sabandia","Socabaya","Jacobo Hunter","Characato",
						"Mollebaya","Quequeña","San Juan de Siguas","Santa Isabel de Siguas",
						"Santa Rita de Siguas","Vitor","La Joya","Uchumayo","Yarabamba",
						"Polobaya","Pocsi","Chiguata","San Juan de Tarucani","Cayma","Yura"};
	JComboBox combo1= new JComboBox(distritos);
	JComboBox combo2= new JComboBox(distritos);
	public int contador=0;
	public int contador2=0;
	private JFrame ventanaDistritos= new JFrame();
	//ventanas
	private JFrame ventanaIniciar= new JFrame();
	private JFrame ventanaMapa= new JFrame();
	public DemoCaminoCorto() {
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
		rutaCortaAuto= new Dijkstra(29,arequipa.matrizauto,arequipa,"auto");
		rutaCortaPie= new Dijkstra(29,arequipa.matrizpie,arequipa,"pie");
		iniciarDemo();
	}
	private void iniciarDemo() {
		JButton biniciar= new JButton("Iniciar");
		JButton bsalir= new JButton("Salir");
		//propiedades de la ventana
		presentacion.setSize(600,350);
		presentacion.setTitle("Caminos mas cortos");
		presentacion.setDefaultCloseOperation(EXIT_ON_CLOSE);
		presentacion.setLayout(null);
		presentacion.setResizable(false);
		//hacer visible la ventana
		presentacion.setVisible(true);
		presentacion.setLocationRelativeTo(null);
		//propiedades del titulo
		JLabel titulo= new JLabel("GHOSTSHELL");
		titulo.setBounds(170, 30, 300, 37);
		titulo.setFont(new Font("arial",Font.BOLD,33));
		presentacion.add(titulo);
		//propiedades de sus botones
		//propiedad boton iniciarJuego
		biniciar.setBounds(200,100, 150,60);
		presentacion.add(biniciar);
		//propiedades boton salir
		bsalir.setBounds(200, 180, 150, 60);
		presentacion.add(bsalir);
		//acciones
		biniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==biniciar) {
					iniciar();
					presentacion.setVisible(false);
				}
			}
		});
		bsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== bsalir) {
					System.exit(0);
				}
			}
		});
	}
	//iniciar
	public void iniciar() {
		//declaraciones
				JLabel titulo= new JLabel("Menu de Opciones");
				JButton aceptar= new JButton();
				// agregamos al grupo de botones
				grupo.add(boton1);
				grupo.add(boton2);
				grupo.add(boton3);
				grupo.add(boton7);
				//propiedades de la ventana
				ventanaIniciar.setSize(455,360);
				ventanaIniciar.setTitle("Opciones");
				ventanaIniciar.setLayout(null);
				ventanaIniciar.setDefaultCloseOperation(EXIT_ON_CLOSE);
				ventanaIniciar.setResizable(false);
				//colocamos el titulo
				titulo.setBounds(120,25,200,50);
				titulo.setFont(new Font("arial",Font.BOLD,22));
				ventanaIniciar.add(titulo);
				//propiedades de los radioBotones
				boton1.setBounds(50, 85, 350,30);
				boton1.setFont(new Font("arial",Font.BOLD,16));
				ventanaIniciar.add(boton1);
				boton2.setBounds(50, 120,350, 30);
				boton2.setFont(new Font("arial",Font.BOLD,16));
				ventanaIniciar.add(boton2);
				boton3.setBounds(50, 155, 250,30);
				boton3.setFont(new Font("arial",Font.BOLD,16));
				ventanaIniciar.add(boton3);
				boton7.setBounds(50, 190, 250, 30);
				boton7.setFont(new Font("arial",Font.BOLD,16));
				ventanaIniciar.add(boton7);
				aceptar.setBounds(160, 240, 100,40);
				aceptar.setText("Aceptar");
				aceptar.setFont(new Font("arial",Font.BOLD,15));
				ventanaIniciar.add(aceptar);
				//propiedades para visibilidad
				ventanaIniciar.setVisible(true);
				ventanaIniciar.setLocationRelativeTo(null);
				//acciones
				aceptar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						
						if(boton1.isSelected()) {
							ventanaIniciar.setVisible(false);;
							minimoDosDistritos();
						}
						if(boton2.isSelected()) {
							ventanaIniciar.setVisible(false);;
							minimoTodosDistritos();
						}
						if(boton3.isSelected()) {
							ventanaIniciar.setVisible(false);;
							mapaArequipa();
						}
						if(boton7.isSelected()) {
							presentacion.setVisible(true);
							ventanaIniciar.dispose();
						}
					}
				  }
				);
	}
	private String distrito1;
	private String distrito2;
	public void minimoDosDistritos() {
		//declaraciones
		JLabel ejercito1= new JLabel();
		JLabel ejercito2= new JLabel();
		JButton aceptar= new JButton();
		JButton atras= new JButton();
		//propiedades de la ventana
		ventanaDistritos.setSize(400,365);
		ventanaDistritos.setTitle("Distancia minima entre dos distritos");
		ventanaDistritos.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventanaDistritos.setLayout(null);
		ventanaDistritos.setResizable(false);
		//propiedades de los titulos
		ejercito1.setBounds(35, 30, 100, 50);
		ejercito1.setText("Origen:");
		ejercito1.setFont(new Font("arial",Font.BOLD,18));
		ventanaDistritos.add(ejercito1);
		ejercito2.setBounds(35, 150, 100, 50);
		ejercito2.setText("Destino:");
		ejercito2.setFont(new Font("arial",Font.BOLD,18));
		ventanaDistritos.add(ejercito2);
		//propiedades de los comboBox
		combo1.setBounds(165, 35, 150 ,40);
		ventanaDistritos.add(combo1);
		combo2.setBounds(165, 155, 150 ,40);
		ventanaDistritos.add(combo2);
		//propiedades del boton
		aceptar.setBounds(200,245, 100, 40);
		aceptar.setText("Aceptar");
		ventanaDistritos.add(aceptar);
		//propiedades de atras
		atras.setBounds(80,245, 100, 40);
		atras.setText("Atras");
		ventanaDistritos.add(atras);
		//hacemos visible la ventana
		ventanaDistritos.setVisible(true);
		ventanaDistritos.setLocationRelativeTo(null);
		//acciones
		combo1.addActionListener(new EscucharAccion());
		combo2.addActionListener(new EscucharAccion());
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador2>=2) {
					informacion(distrito1,distrito2);
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Asegurese de escoger los dos distritos");
				}
			}
		});
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaIniciar.setVisible(true);
				ventanaDistritos.dispose();
			}
		});
	}
	private class EscucharAccion implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==combo1) {
				if(!(((String)combo1.getSelectedItem()).contentEquals(((String)combo2.getSelectedItem())))){
					String primero;
					primero= (String) combo1.getSelectedItem();
					distrito1=primero;
					contador2++;
				}
				else {
					JOptionPane.showMessageDialog(null, "Elija distritos diferentes");
				}
			}
			if(e.getSource()==combo2) {
				if(!(((String)combo1.getSelectedItem()).contentEquals(((String)combo2.getSelectedItem())))){
					String segundo;
					segundo=(String) combo2.getSelectedItem();
					distrito2=segundo;
					contador2++;
				}
				else {
					JOptionPane.showMessageDialog(null, "Elija distritos diferentes");
				}
			}
		}
		
	}
	String rutaAuto="";
	String rutaPie="";
	public void informacion(String distrito1, String distrito2) {
		//declaraciones
		JFrame ventanaMostrar= new JFrame();
		ImageIcon ga= new ImageIcon("src/iconodesplegable.png");
		JButton desplegable1= new JButton();
		JButton desplegable2= new JButton();
		JLabel origen= new JLabel();
		JLabel destino= new JLabel();
		JLabel auto= new JLabel();
		JLabel pie= new JLabel();
		JButton aceptar= new JButton();
		String formatoRutaAuto="";
		String formatoRutaPie="";
		int nodoA=0;
		int nodoB=0;
		//ejecucion de funciones
		nodoA=numeroNodo(arequipa,distrito1);
		nodoB=numeroNodo(arequipa,distrito2);
		//propiedades de la ventana
		ventanaMostrar.setSize(350, 290);
		ventanaMostrar.setTitle("Resultados");
		ventanaMostrar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventanaMostrar.setLayout(null);
		ventanaMostrar.setResizable(false);
		//propiedades de desplazable
		desplegable1.setBounds(280, 100, 25, 25);
		desplegable1.setIcon(new ImageIcon(ga.getImage().getScaledInstance(desplegable1.getWidth(), desplegable1.getHeight(), Image.SCALE_SMOOTH)));
		desplegable2.setBounds(280, 140, 25, 25);
		desplegable2.setIcon(new ImageIcon(ga.getImage().getScaledInstance(desplegable2.getWidth(), desplegable2.getHeight(), Image.SCALE_SMOOTH)));
		//propiedades de aceptar
		aceptar.setText("Aceptar");
		aceptar.setBounds(100,180, 120, 35);
		aceptar.setFont(new Font("arial",Font.BOLD,14));
		//propiedades del origen
		origen.setText("Origen: "+distrito1);
		origen.setBounds(30, 10, 280, 50);
		origen.setFont(new Font("arial",Font.BOLD,15));
		//propiedades del destino
		destino.setText("Destino: "+distrito2);
		destino.setBounds(30, 50, 280, 50);
		destino.setFont(new Font("arial",Font.BOLD,15));
		//propiedades del auto
		formatoRutaAuto=rutaCortaAuto.traversal(nodoA, nodoB);
		rutaAuto=formatoRutaAuto.substring(formatoRutaAuto.indexOf(":")+1);
		System.out.println(rutaAuto);
		auto.setText("Auto: "+formatearMinutosAHoraMinuto(Integer.parseInt(formatoRutaAuto.substring(0,formatoRutaAuto.indexOf(":")))));
		auto.setBounds(30, 90, 280, 50);
		auto.setFont(new Font("arial",Font.BOLD,15));
		//propiedades del pie
		formatoRutaPie=rutaCortaPie.traversal(nodoA, nodoB);
		rutaPie=formatoRutaPie.substring(formatoRutaPie.indexOf(":")+1);
		System.out.println(rutaPie);
		pie.setText("A pie: "+formatearMinutosAHoraMinuto(Integer.parseInt(formatoRutaPie.substring(0,formatoRutaPie.indexOf(":")))));
		pie.setBounds(30, 130, 280, 50);
		pie.setFont(new Font("arial",Font.BOLD,15));
		//añadimos los componentes
		ventanaMostrar.add(origen);
		ventanaMostrar.add(aceptar);
		ventanaMostrar.add(destino);
		ventanaMostrar.add(auto);
		ventanaMostrar.add(pie);
		ventanaMostrar.add(desplegable1);
		ventanaMostrar.add(desplegable2);
		//visible pantalla
		ventanaMostrar.setVisible(true);
		ventanaMostrar.setLocationRelativeTo(null);
		//acciones
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				ventanaMostrar.dispose();
			}
		});
		desplegable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				JOptionPane.showMessageDialog(null, rutaAuto);
			}
		});
		desplegable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				JOptionPane.showMessageDialog(null, rutaPie);
			}
		});
	}
	//funcion utilitaria
	private int numeroNodo(Ciudad A,String a) {
		int index=0;
		for(int i=0;i<29;i++) {
			if(A.nodos[i].nombre.contentEquals(a) ) {
				index=A.nodos[i].numero-1;
			}
		}
		return index;
	}
	
	public String formatearMinutosAHoraMinuto(int minutos) {
	    String formato = "%02d horas y %02d minutos";
	    long horasReales = TimeUnit.MINUTES.toHours(minutos);
	    long minutosReales = TimeUnit.MINUTES.toMinutes(minutos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(minutos));
	    return String.format(formato, horasReales, minutosReales);
	}
	public void minimoTodosDistritos() {
		
	}
	
	public void mapaArequipa() {
		//declaraciones
		String leyenda= "1.-   Cerro Colorado \n"
						+ "2.-   Alto Selva Alegre \n"+
						"3.-   Miraflore \n"+
						"4.-   Mariano Melgar \n"+
						"5.-   Yanahuara \n"+
						"6.-   Arequipa \n"+
						"7.-   Sachaca \n"+
						"8.-   Tiabaya \n"+
						"9.-   Jose Luis Bustamante y Rivero \n"+
						"10.-   Paucarpata \n"+
						"11.-   Sabandia \n"+
						"12.-   Socabaya \n"+
						"13.-   Jacobo Hunter \n"+
						"14.-   Characato \n"+
						"15.-   Mollebaya \n"+
						"16.-   Quequeña \n"+
						"17.-   San Juan de Siguas \n"+
						"18.-   Santa Isabel de Siguas \n"+
						"19.-   Santa Rita de Siguas \n"+
						"20.-   Vitor \n"+
						"21.-   La Joya \n"+
						"22.-   Uchumayo \n"+
						"23.-   Yarabamba \n"+
						"24.-   Polobaya \n"+
						"25.-   Pocsi \n"+
						"26.-   Chiguata \n"+
						"27.-   San Juan de Tarucani \n"+
						"28.-   Cayma \n"+
						"29.-   Yura";
		JLabel titulo = new JLabel();
		JButton volveratras= new JButton();
		JLabel imagen= new JLabel(new ImageIcon("src/mapaArequipa.png"));
		JLabel titulo2= new JLabel();
		JButton aceptar= new JButton();
		JPanel miPanel= new JPanel();
		JFrame mostrar= new JFrame();
		JTextArea texto= new JTextArea();
		JScrollPane scroll= new JScrollPane();
		ImageIcon ga= new ImageIcon("src/iconodesplegable.png");
		JButton desplegable= new JButton();
		//propiedades de la ventana
		mostrar.setSize(320,450);
		mostrar.setTitle("Leyenda");
		mostrar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mostrar.setResizable(false);
		//propiedades para la leyenda
		aceptar.setText("Aceptar");
		aceptar.setBounds(60,400, 120, 35);
		aceptar.setFont(new Font("arial",Font.BOLD,18));
		miPanel.setLayout(null);
		miPanel.setPreferredSize(new Dimension(270,600));
		scroll.setBounds(5, 10,300,550);
		titulo2.setBounds(100, 15, 120,25);
		titulo2.setText("Leyenda");
		titulo2.setFont(new Font("arial",Font.BOLD,18));
		texto.setBounds(20,50,400,550);
		texto.setText(leyenda);
		scroll.setViewportView(miPanel);
		mostrar.add(aceptar);
		miPanel.add(titulo2);
		miPanel.add(texto);
		mostrar.add(scroll);
		//propiedades de la ventana
		ventanaMapa.setSize(1200,750);
		ventanaMapa.setTitle("Mapa");
		ventanaMapa.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		ventanaMapa.setLayout(null);
		ventanaMapa.setResizable(false);
		//propiedades de la imagen
		imagen.setBounds(220,10, 750, 650);
		ventanaMapa.add(imagen);
		//propiedades del titulo
		titulo.setBounds(420, 20, 400,30);
		titulo.setFont(new Font("arial",Font.BOLD,25));
		titulo.setText("Mapa de los distritos de Arequipa");
		ventanaMapa.add(titulo);
		//propiedades del boton desplegable
		desplegable.setBounds(370, 42, 25, 25);
		desplegable.setIcon(new ImageIcon(ga.getImage().getScaledInstance(desplegable.getWidth(), desplegable.getHeight(), Image.SCALE_SMOOTH)));
		ventanaMapa.add(desplegable);
		//propiedades de los botones
		volveratras.setBounds(500,600,156,60);
		volveratras.setText("Volver");
		ventanaMapa.add(volveratras);
		//visualizar ventana
		ventanaMapa.setLocationRelativeTo(null);
		ventanaMapa.setVisible(true);
		//acciones
		volveratras.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ventanaIniciar.setVisible(true);
				ventanaMapa.dispose();
			}
		 }
		);
		desplegable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==desplegable) {
					mostrar.setVisible(true);
				}
			}
			
		});
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				mostrar.dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new DemoCaminoCorto();
	}
}
