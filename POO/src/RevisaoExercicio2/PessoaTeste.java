package RevisaoExercicio2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        pessoa1.setNome(leitor.nextLine());

        System.out.println("Digite sua idade: ");
        pessoa1.setIdade(Integer.parseInt(leitor.nextLine()));

        System.out.println(pessoa1.toString());

        pessoa1.fazNiver();
        pessoa1.fazNiver();
        pessoa1.fazNiver();
        pessoa1.fazNiver();
        pessoa1.fazNiver();

        System.out.println(pessoa1.toString());
    }
}
