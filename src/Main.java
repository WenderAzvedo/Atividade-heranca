public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Pichau","R. Alecrim Dourado, N28", "(31)97070-7070", 1000 ,100 );
        fornecedor.exibirDados();

        Empregado empregado = new Empregado("Wender", "Rua joaquim manhães, N28", "(31)97070-7070", 1070, 3000, 10);
        empregado.exibirDados();

        Administrador administrador = new Administrador("Alexandre", "Rua itaituba, N431", "(31)97070-7070", 5, 5000, 10, 500);
        administrador.exibirDados();

        Operario operario = new Operario("Romario", "Rua solar, N34", "(31)97070-7070", 45, 2000, 10,200,10);
        operario.exibirDados();

        Vendedor vendedor = new Vendedor("Geovanni", "Rua Baile da combo","(31)97070-7070",24,1200,50, 3000, 30);
        vendedor.exibirDados();
    }
}
