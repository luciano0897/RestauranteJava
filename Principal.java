package projetoManha;
public class Principal {

    public static void main(String[] args) {
        // Inicia a tela de login do dono e do funcionário
        new LoginFuncionario().setVisible(true);
        new LoginDono().setVisible(true);
    }
}
