package javando;

import java.util.Scanner;

public class projeto1mensagensdiarias {
	/*
	 * Projeto: Mensagens Diárias
	 * Objetivo: Praticar o uso de arrays (vetores) e estruturas condicionais em Java.
	 * Desenvolvedora: Priscila Vitória 
	 * Funcionalidade: O usuário escolhe um número de 1 a 7 e o sistema 
	 * retorna uma mensagem motivacional correspondente ao dia.
	 */
	public static String[] guardaFrases() {
		Scanner sc = new Scanner(System.in);
		String[] frases = new String[7];
		frases[0] = "Domingo é dia de descansar a mente e recarregar as energias.";
		frases[1] = "Nova semana, novas oportunidades. Comece com o pé direito!";
		frases[2] = "Grandes conquistas são feitas de pequenos passos diários.";
		frases[3] = "Metade da semana! Mantenha o foco e confie no seu processo.";
		frases[4] = "Acredite em você e na sua capacidade de ir mais longe.";
		frases[5] = "A persistência de hoje é o sucesso de amanhã. Você conseguiu!";
		frases[6] = "Celebre as suas pequenas vitórias e aproveite o fim de semana.";
		return frases;
	}

	public static void main(String[] args) {

		String[] frases = guardaFrases();
		Scanner sc = new Scanner(System.in);

		int dia;

		System.out.println("                           Mensagens Diárias                             ");
		System.out.println("Escolha um dia da semana:");
		System.out.println("1= Domingo");
		System.out.println("2= Segunda");
		System.out.println("3= Terça");
		System.out.println("4= Quarta");
		System.out.println("5= Quinta ");
		System.out.println("6= Sexta ");
		System.out.println("7= Sabado");
		dia = sc.nextInt();

		if (dia == 1) {
			System.out.println(frases[0]);
		}
		if (dia == 2) {
			System.out.println(frases[1]);
		}
		if (dia == 3) {
			System.out.println(frases[2]);
		}
		if (dia == 4) {
			System.out.println(frases[3]);
		}
		if (dia == 5) {
			System.out.println(frases[4]);
		}
		if (dia == 6) {
			System.out.println(frases[5]);
		}
		if (dia == 7) {
			System.out.println(frases[6]);
		}

	}

}
