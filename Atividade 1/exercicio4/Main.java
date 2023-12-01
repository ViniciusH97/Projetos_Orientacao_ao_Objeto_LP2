package exercicio4;

class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void printEmpresa() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
    }
}

class Restaurante extends Empresa {
    private String tipoCozinha;

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone, String tipoCozinha) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.tipoCozinha = tipoCozinha;
    }

    @Override
    public void printEmpresa() {
        super.printEmpresa();
        System.out.println("Tipo de Cozinha: " + tipoCozinha);
    }
}

class Loja extends Empresa {
    private String categoria;

    public Loja(String nome, String endereco, String cidade, String estado, String cep, String telefone, String categoria) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.categoria = categoria;
    }

    @Override
    public void printEmpresa() {
        super.printEmpresa();
        System.out.println("Categoria: " + categoria);
    }
}

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Restaurante Jk", "Rua Principal, 123", "Minha Cidade", "Meu Estado", "12345-678", "123-456-7890");
        Restaurante restaurante = new Restaurante("Meu Restaurante", "Av. Secundária, 456", "Outra Cidade", "Outro Estado", "98765-4321", "987-654-3210", "Italiana");
        Loja loja = new Loja("Minha Loja", "Rua Comercial, 789", "Cidade Comercial", "Estado Comercial", "54321-678", "987-123-4560", "Eletrônicos");

        System.out.println("Dados da Empresa:");
        empresa.printEmpresa();

        System.out.println("\nDados do Restaurante:");
        restaurante.printEmpresa();

        System.out.println("\nDados da Loja:");
        loja.printEmpresa();
    }
}
