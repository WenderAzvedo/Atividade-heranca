public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }



    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double salarioEmpregado() {
        return salarioBase - (salarioBase * (imposto / 100));
    }

    public void exibirDados () {
        super.exibirDados();
        System.out.println("Codigo setor: " + codigoSetor);
        System.out.println("Salario base: R$" + salarioBase);
        System.out.println("Imposto: " + imposto);
        System.out.println("Salario Liquido: R$" + salarioEmpregado());

    }


}
