package NodoParam;
public class Lifo {
	private Nodo topo;
	Lifo(){
		topo=null;
		
	}
	//ta igual o quadro
	public void inserir(int mat, int idd) {
		Nodo<Integer> aux;
		aux = new Nodo<Integer>(mat, idd);
		aux.vizinho=topo;
		topo=aux;
		
	}
	//ta igual o quadro
	public int retirar() {
		int aux = 0;
		if(topo!=null) {
			aux=(int)topo.matricula;
			topo=topo.vizinho;
			
		}
			return aux;	
	}
	//ta certo
	public void Mostrar()
	{Nodo aux;
	if (topo == null)
	{System.out.println("LISTA VAZIA");
	return;
	}
	System.out.println("\nVEJA A LISTA:");
	aux = topo;
	while (aux != null)
	{System.out.println(" "+aux.matricula);
	aux = aux.vizinho;
	}

	 }
	public int Media() {
		int soma=0,cont=0;
		Nodo<Integer> aux;
		if(topo !=null) {
			aux=topo;
			while(aux !=null) {
				soma += aux.idade;
				cont++;
				aux= aux.vizinho;
			}
		}
		return(soma/cont);
		
	}

	public int achar(int quem) {
		Nodo<Integer> aux=topo;
		while(aux!= null){
			if(aux.matricula==quem) {
				return aux.idade;
				
			}
			aux=aux.vizinho;
			
		}
			return -999;
		
	}
}

