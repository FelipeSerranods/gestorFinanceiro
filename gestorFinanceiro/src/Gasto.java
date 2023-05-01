public class Gasto {
    private String tipoGasto;
    private String dataGasto;
    private double valorGasto;
    private String formaPag;
    public Gasto(String  tipoGasto, String dataGasto, double valorGasto, String formaPag) {
        this.tipoGasto = tipoGasto;
        this.dataGasto = dataGasto;
        this.valorGasto= valorGasto;
        this.formaPag = formaPag;
    }
    public String  getTipo(){
        return tipoGasto;
    }
    public String getData() {
        return dataGasto;
    }
    public double getValor() {
        return valorGasto;
    }
    public String getFormaPag() {
        return formaPag;
    }
}