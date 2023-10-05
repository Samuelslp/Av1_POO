package questao1;

public class Pagamento {

    private String dataHoraPagamento;
    private int numeroPagamento;
    private double valorPago;

    public Pagamento(String dataHoraPagamento, int numeroPagamento, double valorPago) {
        this.dataHoraPagamento = dataHoraPagamento;
        this.numeroPagamento = numeroPagamento;
        this.valorPago = valorPago;
    }

    public String getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setDataHoraPagamento(String dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    public String imprimirCupomFiscal() {
        return "Data/Hora: " + dataHoraPagamento +
                ", Número do Pagamento: " + numeroPagamento +
                ", Valor Pago: " + valorPago;
    }

}

