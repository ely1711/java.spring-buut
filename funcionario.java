package model;

public class Funcionario {
    private int codigo;
    private String nome;
    private String email;
    private String cargo;
    private String departamento;
    private boolean status; // true = ativo, false = inativo

    public Funcionario(int codigo, String nome, String email, String cargo, String departamento, boolean status) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.departamento = departamento;
        this.status = status;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

