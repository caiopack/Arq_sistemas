public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(int id, String nome, String cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
    }
}