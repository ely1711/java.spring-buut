package view;

import model.Funcionario;

public class FuncionarioView {
    public void exibirFuncionario(Funcionario funcionario) {
        System.out.println("Código: " + funcionario.getCodigo());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        System.out.println("Status: " + (funcionario.isStatus() ? "Ativo" : "Inativo"));
    }
}
