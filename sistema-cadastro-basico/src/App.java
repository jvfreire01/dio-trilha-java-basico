import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int opcao;
    int opcaoAluno;
    int opcaoProfessor;
    int opcaoCoordenador;

    Scanner input = new Scanner(System.in);

    //Utilizando estrutura de loop Do While  + Switch Case para criação do sistema;

    do {

    // Criação do Menu Principal
    System.out.println("--------------");
    System.out.println("Menu Principal");
    System.out.println("--------------");
    System.out.println(" Escolha uma das opções abaixo:");
    System.out.println("1 - Cadastrar Aluno");
    System.out.println("2 - Cadastrar Professor");
    System.out.println("3 - Cadastrar Coordenador");
    System.out.println("0 - Sair");

    System.out.println("Qual deseja acessar?");

    opcao = input.nextInt(); 
      
    
    switch (opcao) {

    //Criando Menu Aluno;

      case 1:
        System.out.println("----------");
        System.out.println("Menu Aluno");
        System.out.println("----------");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Nota");
        System.out.println("0 - Sair");

        opcaoAluno = input.nextInt();

        if (opcaoAluno == 1) {
          System.out.println ("Aluno cadastrado!");
        } else if (opcaoAluno == 2) {
          System.out.println ( "Nota cadastrada!");
        } else if (opcaoAluno == 0) {
          System.out.println ("Saindo...");
        } else {
            System.out.println("Opção Inválida!");
        }
        break;

        //Criando Menu Professor;

        case 2:
        System.out.println("----------");
        System.out.println("Menu Professor");
        System.out.println("----------");
        System.out.println("1 - Cadastrar Professores");
        System.out.println("2 - Cadastrar Frequência");
        System.out.println("0 - Sair");

        opcaoProfessor = input.nextInt();

        if (opcaoProfessor == 1) {
          System.out.println ("Professor cadastrado!");
        } else if (opcaoProfessor == 2) {
          System.out.println ( "Frequência cadastrada!");
        } else if (opcaoProfessor == 0) {
          System.out.println ("Saindo...");
        } else {
            System.out.println("Opção Inválida!");
        } 
        
        break;

        //Criando Menu Coordenador;

        case 3:
        System.out.println("----------");
        System.out.println("Menu Coordenador");
        System.out.println("----------");
        System.out.println("1 - Cadastrar Coordenador");
        System.out.println("2 - Cadastrar Disciplina");
        System.out.println("0 - Sair");

        opcaoCoordenador = input.nextInt();

        if (opcaoCoordenador == 1) {
          System.out.println ("Coordenador cadastrado!");
        } else if (opcaoCoordenador == 2) {
          System.out.println ( "Disciplina cadastrada!");
        } else if (opcaoCoordenador == 0) {
          System.out.println ("Saindo...");
        } else {
            System.out.println("Opção Inválida!");
        }
        break;

      case 0:
        System.out.println ("Saindo...");
        break;

    
    //Default para impedir que números diferentes dos pré-estabelecidos sejam inseridos;
      default: 
        System.out.println("Opção inválida");
    
    } 

    } while (opcao != 0);


    // input.close para fechar o Scanner e liberar os recursos;
    input.close();

    }
}
