// https://github.com/erickweil/javamisc/blob/main/src/br/erickweil/estruturas/ListaEncadeada.java

public class ListaEncadeada {

	//Classe que define um elemento na lista. Contém o valor e uma referência ao próximo
	public static class Elemento {
		String valor;
		Elemento prox;

		public Elemento(String valor) {
			this.valor = valor;
			this.prox = null;
		}

		/** Para escrever na tela os elementos. Ex: A --> B --> C --> null */
		@Override
		public String toString() {
			return this.valor + " --> " + this.prox;
		}
	}

	// Indica o início da lista.
	Elemento inicio;
    Elemento fim;
    Elemento especifico;

	//Este método adiciona um elemento no início da lista. Ou seja, este novo valor será o primeiro da lista. @param valor O valor que vai será adicionado

	public void addFirst(String valor) {
		Elemento novo = new Elemento(valor);
		novo.prox = inicio;
		inicio = novo;
	}

	//Remove um elemento do início da lista. @return o valor removido
    //>> int removeFirst() - Remove o primeiro elemento da lista, além de remover da lista retorna o seu valor
	public String removeFirst() {
		String valor = inicio.valor;    //Salvo valor deletado
		inicio = inicio.prox;           //Mudo a referencia para o próximo
		return valor;                   //Retorno o valor deletado
	}

	//>> int removeLast() - Remove o último elemento da lista, além de remover da lista retorna o seu valor]
    public String removeLast() {
		String valor = inicio.valor;
		inicio = inicio.prox;
		return valor;
	}

    //>> int remove(int indice) - Remove o elemento da lista na posição especificada, retornando o seu valor
    public String removeEspecifico() {
		String valor = inicio.valor;
		inicio = inicio.prox;
		return valor;
	}

	// Crie aqui outro método na classe ListaEncadeada
	//Método principal. Para testar o código e ver se os métodos funcionam como deveriam.
	public static void main(String[] args) {
		System.out.println("OK");
		
		// Criando uma lista inicialmente vazia.
		ListaEncadeada lista = new ListaEncadeada();

		// Testando o método addFirst
		lista.addFirst("Batata");
		lista.addFirst("Cenoura");
		lista.addFirst("Melancia");
	
		// Se printar na tela esses três valores é porque adicionou
		System.out.println("Lista antes de remover: " + lista.inicio);
		
		// Testando o método removeFirst
		String removido = lista.removeFirst();
		System.out.println("Removido: "+removido);

        // Testando o método removeLast
		removido = lista.removeLast();
		System.out.println("Removido: "+removido);

        // Testando o método removeLast
		removido = lista.removeEspecifico();
		System.out.println("Removido: "+removido);
		
		// Se printar na tela a lista sem o que foi removido é porque removeu
		System.out.println("Lista depois de remover: " + lista.inicio);
	}
}