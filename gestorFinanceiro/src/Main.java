import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoOperacional = 0;

        while (opcaoOperacional != 6) {
            Menus.telaInicial();
            opcaoOperacional = Integer.parseInt(input.nextLine());

            switch (opcaoOperacional) {
                case 1:
                    Menus.telaTipoGasto();
                    String tipoGasto = input.nextLine();
                    if ("99".equals(tipoGasto)){
                        System.out.println("Operação Cancelada.Voltando à tela inicial.... ");
                        System.out.println();
                        break;
                    }
                    Menus.telaData();
                    String data = input.nextLine();

                    Menus.telaValor();
                    double valor = Double.parseDouble(input.nextLine());

                    Menus.telaFormaPagamento();
                    String tipoPag = input.nextLine();

                    Gasto gasto = new Gasto(tipoGasto,data,valor,tipoPag);
                    Banco.adicionarGasto(gasto);
                    break;
                case 2:
                    Menus.telaTipoGanho();
                    String tipoGanho = input.nextLine();
                    if (tipoGanho == "99"){
                        break;
                    }

                    Menus.telaData();
                    String dataGanho = input.nextLine();

                    Menus.telaValor();
                    double valorGanho = Double.parseDouble(input.nextLine());

                    Ganho ganho = new Ganho(tipoGanho,dataGanho,valorGanho);
                    Banco.adicionarGanho(ganho);
                    break;
                case 3:
                    Banco.gerarRelatorioGasto();
                    break;
                case 4:
                    Banco.gerarRelatorioGanho();
                    break;
                case 5:
                    Banco.gerarRelatorioMensal();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("[ERRO] Opção inválida! Tente novamente.");
                    System.out.println();
            }
        }
    }
}