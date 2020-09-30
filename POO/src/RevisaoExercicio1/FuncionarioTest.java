package RevisaoExercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o id do Funcionario: ");
        func.setIdFunc(Integer.parseInt(leitor.nextLine()));
        System.out.println("Digite o nome do Funcionario: ");
        func.setNomeFunc(leitor.nextLine());
        System.out.println("Digite o departamento: ");
        func.setDepartamento(leitor.nextLine());
        System.out.println("Digite o dia da contratação: ");
        func.setDia(Integer.parseInt(leitor.nextLine()));
        System.out.println("Digite o mes da contratação: ");
        func.setMes(Integer.parseInt(leitor.nextLine()));
        System.out.println("Digite o ano da contratação: ");
        func.setAno(Integer.parseInt(leitor.nextLine()));
        func.data();
        System.out.println("Digite o salario: ");
        func.setSalario(Double.parseDouble((leitor.nextLine())));
        System.out.println("Digite o documento: ");
        func.setDocumento(leitor.nextLine());
        System.out.println("Digite 'true' para funcionario ativo e 'false' para não ativo: ");
        func.setAtivo(Boolean.parseBoolean(leitor.nextLine()));

        System.out.println("Digite o valor de aumento no salario: ");
        func.atualizarSalario(Double.parseDouble((leitor.nextLine())));

        System.out.println(func.toString());

        System.out.println(" ");
        func.demiteFuncionario();

        System.out.println(func.toString());

    }
}
