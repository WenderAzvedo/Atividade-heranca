public class Operario extends Empregado{
private double valorProducao;
private double comissao;

    public Operario (String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao){

        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;

    }

    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double salarioOperario() {
        return super.salarioEmpregado() + (valorProducao * (comissao / 100));
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salario: R$" + salarioOperario());
    }
}
