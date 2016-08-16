public class StackList extends AbstractStack{
	

    private List<Object> pila;
    private Factory fact = new Factory();
	
    public StackList(){
		pila = fact.crearLista();
    }
	
	 /**
	 * Este metodo se utiliza para obtener la cantidad de elementos que hay en la pila
	 * @param no necesita
	 * @return el tamaño de la pila
	 */
    public int size(){
	return pila.size();
    }

    public void push(Object e){
        pila.add(e);
    }
	
    public Object pop() {
        return pila.remove();
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public Object get() {
        return pila.remove();
    }

}
	

