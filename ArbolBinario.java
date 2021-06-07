package lab5;

public class ArbolBinario {
//aqui la logica
	

	NodoArbol raiz;
	
	public ArbolBinario() {
		//inicializa la raiz
		raiz=null;
	}
	
	//Metodo para insertar un Nodo en el Arbol
	
	public void agregarNodo(int dato,String nombre) {
		
		NodoArbol nuevo =new NodoArbol(dato, nombre);
		//todavia no habia nada
		if(raiz== null) {
			
			raiz=nuevo;
		}
		else {
			
			NodoArbol auxiliar=raiz;
			NodoArbol padre;
			while(true) {
				padre=auxiliar;
				//se va a la izquierda
				if(dato<auxiliar.dato) {
					auxiliar=auxiliar.hijoIzquierdo;
				//ya llego hasta el final
					if(auxiliar==null) {
						padre.hijoIzquierdo=nuevo;
						return;
					}
					
				}else {
					auxiliar=auxiliar.hijoDerecho;
					if(auxiliar==null) {
						padre.hijoDerecho=nuevo;
						return;
					}
					
				}
			
			}
			
			
			
		}
		
		
	}
	
}
