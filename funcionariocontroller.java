package controller;

import model.Funcionario;
import view.FuncionarioView;

public class FuncionarioController {
    private Funcionario funcionario;
    private FuncionarioView view;

    public FuncionarioController(FuncionarioView view) {
        this.view = view;
    }

    public void criarFuncionario(int codigo, String nome, String email, String cargo, String departamento, boolean status) {
        this.funcionario = new Funcionario(codigo, nome, email, cargo, departamento, status);
    }

    public void exibirFuncionario() {
        view.exibirFuncionario(funcionario);
    }
}
