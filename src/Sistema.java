import java.util.List;

public class Sistema {
    private static void exibirMenu() {
        System.out.println("\nMENU");
        System.out.println("1) Jogar");
        System.out.println("2) Resultados");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void verificarOpcao(int op, List<Pergunta> perguntas) {

        switch (op) {
            case 1:
                System.out.print("Digite seu nome: ");
                String nomeUsuario = Console.lerString();
                Personalidade.reiniciarPontuacoes();
                try {
                    Lista.apresentarPerguntas(perguntas);
                } catch (Exception e) {
                    System.out.println("Erro ao apresentar perguntas: " + e.getMessage());
                    return;
                }
                Resultados.quiz(perguntas, nomeUsuario);
                Resultados.armazenarResultado(nomeUsuario, perguntas);
                Resultados.exibirResultado(nomeUsuario, perguntas);
                break;

            case 2:
                
                Resultados.exibirResultados();
                Resultados.salvarResultados();
                break;

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