package projetoManha;
import javax.swing.*;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		 ArrayList<Venda> vendas = new ArrayList<>();
	        
	        // Adiciona algumas vendas para teste (substitua isso com sua lógica real)
	      
	        
	        // Inicializa a tela do dono passando as vendas
	        TelaDono telaDono = new TelaDono(vendas);
	        telaDono.setVisible(true);  // Exibe a tela do dono
	        
	        TelaFuncionario  funcionario = new TelaFuncionario();
	        funcionario.setVisible(true);

	}

}
