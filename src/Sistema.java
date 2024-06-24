import java.util.List;

public class Sistema {
    private static void exibirMenu() {
        System.out.println("\nMENU");
        System.out.println("1) Jogar");
        System.out.println("2) Cadastro");
        System.out.println("3) Resultados");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void verificarOpcao(int op, List<Pergunta> perguntas) {
        int id;
        String opc;
        String nome;

        switch (op) {
            case 1:
                Lista.apresentarPerguntas(perguntas);
                break;

            case 2:
                System.out.println("\nO que deseja?");
                System.out.println("Cadastrar Usuário (Digite C)");
                System.out.println("Excluir Usuário (Digite E)");
                System.out.print("Informe uma opção: ");

                opc = Console.lerString();

                if (opc.equals("C")) {

                    System.out.print("ID: ");
                    id = Console.lerInt();

                    System.out.print("Nome: ");
                    nome = Console.lerString();

                    Usuario usuario = new Usuario(id, nome);

                    Cadastro.cadastrar(usuario);

                    System.out.println("\nUsuário cadastrado com sucesso!");

                } else if (opc.equals("E")) {

                    System.out.print("ID: ");
                    id = Console.lerInt();

                    boolean excluido = Cadastro.excluir(id);

                    if (excluido) {
                        System.out.println("Usuário excluído com sucesso");
                    }

                    System.out.println("Usuário não encontrado");

                } else {

                    System.out.println("Opção inválida. Por favor, tente novamente.");

                }

                break;

            case 3:

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar(List<Pergunta> perguntas) {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op, perguntas);
        } while (op != 0);
    }
}