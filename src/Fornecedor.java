public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;


    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo () {
        return valorCredito - valorDivida;
    }
    public  void exibirDados() {
        super.exibirDados();
        System.out.println("Valor de credito: R$" + valorCredito);
        System.out.println("Valor gasto: R$" + valorDivida);
        System.out.println("Saldo restante: R$" + obterSaldo());

    }
}
