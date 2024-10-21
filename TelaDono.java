package projetoManha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaDono extends JFrame{
	
	private ArrayList<Venda> vendas;
	
	public TelaDono(ArrayList<Venda> vendas) {
		this.vendas = vendas;

	setTitle("Restaurante Barriga Cheia - Teala do Dono");
	setSize(400, 300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	 JPanel panel = new JPanel();
     panel.setLayout(null);

     JLabel lblLucro = new JLabel("Lucro Total:");
     lblLucro.setBounds(50, 50, 100, 30);
     panel.add(lblLucro);

     JButton btnCalcularLucro = new JButton("Calcular Lucro");
     btnCalcularLucro.setBounds(150, 50, 150, 30);
     panel.add(btnCalcularLucro);

     btnCalcularLucro.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             double lucroTotal = 0;
             for (Venda venda : vendas) {
                 lucroTotal += venda.getValorTotal();
             }
             JOptionPane.showMessageDialog(null, "Lucro Total: R$ " + lucroTotal);
         }
     });

     add(panel);
	

}
}
