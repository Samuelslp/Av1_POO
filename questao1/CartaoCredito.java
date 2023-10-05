package questao1;

public class CartaoCredito extends Pagamento {
    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago,
                         String numCartao, String bandeira, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeira;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }
    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }
    public String getbandeiraCartao() {
        return bandeiraCartao;
    }
    public void setBandeiraCartao(String bandeira) {
        this.bandeiraCartao = bandeira;
    }
    public String getTitularCartao() {
        return titularCartao;
    }
    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }
    @Override
    public String imprimirCupomFiscal() {
        return super.imprimirCupomFiscal() +
                ", Número do Cartão: " + numCartao +
                ", Bandeira: " + bandeiraCartao +
                ", Titular do Cartão: " + titularCartao;
    }
}