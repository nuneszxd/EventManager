import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ManagerEvent manager = new ManagerEvent();

        System.out.println("=== Cadastro de Usuário ===");
        User user = new User();

        System.out.print("Digite seu nome: ");
        user.setName(sc.nextLine());

        System.out.print("Digite seu sobrenome: ");
        user.setSobrenome(sc.nextLine());

        System.out.print("Digite sua idade: ");
        user.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.print("Digite seu e-mail: ");
        user.setEmail(sc.nextLine());

        System.out.print("Digite seu telefone: ");
        user.setTelefone(sc.nextLong());
        sc.nextLine();

        System.out.println("\nCadastro concluído! Bem-vindo, " + user.getName() +"!\n");

        int opcao = 0;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Listar eventos disponíveis");
            System.out.println("2 - Participar de um evento");
            System.out.println("3 - Listar meus eventos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    manager.listEvents();
                    break;
                case 2:
                    System.out.print("Digite o índice do evento que deseja participar: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    manager.userJoinEvent(user, index);
                    break;
                case 3:
                    user.listMyEvents();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 0);

        sc.close();
    }

    }
