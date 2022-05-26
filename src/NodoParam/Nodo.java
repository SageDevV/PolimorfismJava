package NodoParam;

public class Nodo <T> {
public T matricula;
public T idade;
public Nodo vizinho;

Nodo(T mtrnv, T iddnv){
	matricula=mtrnv;
	idade=iddnv;
	vizinho=null;
	
}
}
