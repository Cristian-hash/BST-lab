package lab5;

import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String []args) {
		
		int option=0,elemento;
		String nombre;
		ArbolBinario arbolito=new ArbolBinario();		
		do {
			
			try {
				option=Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Agregar un nodo\n"
						+"2. Salir\n"
						+"Elige una Opcion...","Arboles Binarios"
						,JOptionPane.QUESTION_MESSAGE));
				switch(option) {
					case 1:
						elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
								"Ingresa el numero del Nodo","Agregando Nodo"
								,JOptionPane.QUESTION_MESSAGE));
						nombre=JOptionPane.showInputDialog(null,
								"Ingresa el nombre del Nodo...",
								JOptionPane.QUESTION_MESSAGE);
						arbolito.agregarNodo(elemento, nombre);
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
								"Fin",JOptionPane.INFORMATION_MESSAGE);
						break;
						default:
							JOptionPane.showMessageDialog(null, "Opcion Incorrecta",
									"Cuidado!",JOptionPane.INFORMATION_MESSAGE);
				
				}
				
				
			} catch (NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
			}
		}while(option!=2);
		
		
		
	}

}
