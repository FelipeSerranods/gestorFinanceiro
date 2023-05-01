import java.util.ArrayList;

public class Banco{
    public static ArrayList<Gasto> listaGastos = new ArrayList<>();
    public static ArrayList<Ganho> listaGanhos = new ArrayList<>();

    public static void adicionarGasto(Gasto gasto) {
        listaGastos.add(gasto);
    }

    public static void adicionarGanho(Ganho ganho) {
        listaGanhos.add(ganho);
    }

    public static void gerarRelatorioGasto(){
        double total = 0.0;
        System.out.println();
        System.out.println("Relatório de gastos");
        System.out.println("---------------------");
        for (Gasto gasto : listaGastos) {
            System.out.println("Tipo: " + gasto.getTipo());
            System.out.println("Data: " + gasto.getData());
            System.out.println("Valor: " + gasto.getValor());
            System.out.println("Forma de Pagamento: " + gasto.getFormaPag());
            System.out.println();
            total += gasto.getValor();
        }
        System.out.println("Total: "+ total);
        System.out.println();
    }

    public static void gerarRelatorioGanho(){
        double total = 0.0;
        System.out.println();
        System.out.println("Relatório de ganhos");
        System.out.println("---------------------");
        for (Ganho ganho : listaGanhos) {
            System.out.println("Tipo: " + ganho.getTipo());
            System.out.println("Data: " + ganho.getData());
            System.out.println("Valor: " + ganho.getValor());
            System.out.println();
            total += ganho.getValor();
        }
        System.out.println("Total: " + total);
    }

    public static void gerarRelatorioMensal() {
        double totalGanhos = 0.0;
        double totalGastos = 0.0;
        for (Ganho ganho : listaGanhos) {
            totalGanhos += ganho.getValor();
        }
        for (Gasto gasto : listaGastos) {
            totalGastos += gasto.getValor();
        }
        double saldo = totalGanhos - totalGastos;
        System.out.println();
        System.out.println("Relatório Mensal");
        System.out.println("-------------------------");
        System.out.println("Total de Receitas: R$" + totalGanhos);
        System.out.println("Total de Despesas: R$" + totalGastos);
        System.out.println("Saldo: R$" + saldo);
        System.out.println();
    }

}
