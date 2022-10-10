package aplicacao;

import java.util.Scanner;

import dominio.Agenda;

public class Programa {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);
		char resposta;
		do {
			System.out.println("Bem- vindo à Agenda de contatos\n\n"
					+ "*** Escolha uma opção ***\n\n"
					+ "1 - Adicionar pessoa\n"
					+ "2 - Remover pessoa\n"
					+ "3 - Buscar pessoa\n"
					+ "4 - Imprimir agenda\n"
					+ "5 - Imprimir pessoa\n");
			int opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("*** Adicionar pessoa ***\n\n"
						+ "Informe os dados do contato:\n"
						+ "Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Telefone: ");
				int telefone = sc.nextInt();
				System.out.print("Email: ");
				String email = sc.next();
				agenda.armazenaPessoa(nome, telefone, email);
				System.out.println("Pessoa salva na agenda!\n");
				agenda.imprimeAgenda();
				break;
			case 2:
				System.out.println("*** Remover pessoa ***\n\n"
						+ "Informe o nome da pessoa que deseja excluir: ");
				sc.nextLine();
				nome = sc.nextLine();
				agenda.removePessoa(nome);
				System.out.println("Pessoa removida da agenda!\n");
				agenda.imprimeAgenda();
				break;
			case 3:
				System.out.println("*** Buscar pessoa ***\n\n"
						+ "Informe o nome da pessoa que deseja procurar: ");
				sc.nextLine();
				nome = sc.nextLine();
				int busca = agenda.buscaPessoa(nome);
				System.out.println(busca);
				break;
			case 4:
				agenda.imprimeAgenda();
				break;
			case 5:
				System.out.println("*** Imprimir pessoa ***\n\n"
						+ "Informe a posição que deseja procurar na agenda");
				int posicao = sc.nextInt();
				agenda.imprimePessoa(posicao);
				break;
			default:
				System.out.println("Opção incorreta!");
				break;	
			}
			System.out.println();
			System.out.println("Deseja realizar outra operação [s/n]? ");
			resposta = sc.next().charAt(0);
		} while (resposta == 's');
		sc.close();
	}
}
