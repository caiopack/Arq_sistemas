public class Cliente implements Cloneable {
    private int id;
    private String nome;
    private String email;

    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }

    @Override
    public Cliente clone() {
        try {
            return (Cliente) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}