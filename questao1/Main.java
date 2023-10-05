package questao1;

public class Main {
    public static void main(String[] args) {

        CartaoCredito cartaoCredito = new CartaoCredito("2023-10-05 14:30", 123456, 100.0,
                "1234567890", "Visa", "SAMUEL");
        System.out.println("Cupom Fiscal para Cartão de Crédito:");
        System.out.println(cartaoCredito.imprimirCupomFiscal());


        Pix pix = new Pix("2023-10-05 14:45", 654321, 75.0, true);
        System.out.println("\nCupom Fiscal para Pix:");
        System.out.println(pix.imprimirCupomFiscal());

        CartaoDebito cartaoDebito = new CartaoDebito("2023-10-05 15:00", 789012, 50.0,
                "0987654321", "MICHELLE");
        System.out.println("\nCupom Fiscal para Cartão de Débito:");
        System.out.println(cartaoDebito.imprimirCupomFiscal());
    }
}