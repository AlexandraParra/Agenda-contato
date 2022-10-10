package dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Contato> listaDeContato = new ArrayList<>();

	public void armazenaPessoa(String nome, int telefone, String email) {
		Contato contato = new Contato(nome, telefone, email);
		listaDeContato.add(contato);
	}

	public void removePessoa(String nome) {
		int i = 0;
		int posicao = 0;
		for (Contato contato : listaDeContato) {
			if (contato.getNome().equals(nome)) {
				posicao = i;
			}
			i++;
		}
		listaDeContato.remove(posicao);
	}

	public int buscaPessoa(String nome) {
		int i = 0;
		int posicao = 0;
		for (Contato contato : listaDeContato) {
			if (contato.getNome().equals(nome)) {
				posicao = i;
			}
			i++;
		}
		return posicao;
	}

	public void imprimeAgenda() {
		int i = 1;
		System.out.println("*** Lista de pessoas ***");
		for (Contato contato : listaDeContato) {
			System.out.println("Contato #" + i + " " + contato);
			i++;
		}
	}

	public void imprimePessoa(int index) {
		int i = 0;
		for (Contato contato : listaDeContato) {
			if (i == index) {
				System.out.println(contato);
			}
			i++;
		}
	}

}
