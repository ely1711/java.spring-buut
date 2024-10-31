
package app;

import controller.FuncionarioController;
import view.FuncionarioView;

public class Main {
    public static void main(String[] args) {
        FuncionarioView view = new FuncionarioView();
        FuncionarioController controller = new FuncionarioController(view);

        controller.criarFuncionario(101, "Carlos Silva", "carlos@empresa.com", "Desenvolvedor", "TI", true);
        controller.exibirFuncionario();
    }
}

