public class Pessoa {
    private String nome;
    private  String endereco;
    private  String telefone;

    public  Pessoa() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";

    }

    public Pessoa (String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public  Pessoa (String nome) {
        this.nome = nome;
        this.endereco = "";
        this.telefone = "";
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
}

    public void exibirSeparador() {
        System.out.println("────────────────────────────────────────");
    }

    public  void exibirDados() {
        exibirSeparador();
        System.out.println("Cargo: " + this.getClass().getSimpleName());
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
