package projetoManha;

import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class TelaFuncionario extends JFrame{
	private JTextField txtNomeProduto;
	private JTextField txtPrecoProduto;
	private JTextField txtQuantidade;
	private JComboBox<String> comboProdutos;
	private ArrayList<Produto> produtos;
	private ArrayList<Venda> vendas;
	
	
	public TelaFuncionario() {
		setTitle("Restaurante Barriga Cheia - Cadastro e Vendas");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		produtos= new ArrayList<>();
		vendas = new ArrayList<>();
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		// cadastra de produto
		JLabel lblNome = new JLabel("Nome do Produto: ");
		lblNome.setBounds(50, 30, 150, 30);
		panel.add(lblNome);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setBounds(200, 30, 150, 30);
		panel.add(txtNomeProduto);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setBounds(50, 70, 150, 30);
		panel.add(lblPreco);
		
		txtPrecoProduto = new JTextField();
	    txtPrecoProduto.setBounds(200, 70, 150, 30);
	    panel.add(txtPrecoProduto);
	    
	    JButton btnCadastrar = new JButton("Cadastrar Produto");
        btnCadastrar.setBounds(400, 30, 150, 30);
        panel.add(btnCadastrar);
        
        btnCadastrar.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		String nome = txtNomeProduto.getText();
        		double preco = Double.parseDouble(txtPrecoProduto.getText());
        		Produto produto = new Produto(produtos.size() + 1, nome, preco, ABORT);
        		produtos.add(produto);
        		comboProdutos.addItem(nome);
        		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        		
        	}
        });
     // Vendas
        JLabel lblVenda = new JLabel("Registrar Venda:");
        lblVenda.setBounds(50, 150, 150, 30);
        panel.add(lblVenda);
        
        comboProdutos = new JComboBox<>();
        comboProdutos.setBounds(200, 150, 150, 30);
        panel.add(comboProdutos);
        
        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(50, 190, 150, 30);
        panel.add(lblQuantidade);

        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(200, 190, 150, 30);
        panel.add(txtQuantidade);

		JButton btnRegistraVenda = new JButton("Registrar venda");
		btnRegistraVenda.setBounds(400, 150, 150, 30);
		panel.add(btnRegistraVenda);
		
		btnRegistraVenda.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String nomeProduto = (String) comboProdutos.getSelectedItem();
				Produto produtoSelecionado = null;
				for (Produto p : produtos) {
					if (p.getNome().equals(nomeProduto)) {
						produtoSelecionado = p;
						break;
					}
				}
				int quantidade = Integer.parseInt(txtQuantidade.getText());
				Venda venda = new Venda(produtoSelecionado, quantidade);
				vendas.add(venda);
				
				JOptionPane.showMessageDialog(null, "Venda registrada com sucesso!");
			}
			
		});
		JButton btnExibirVendas = new JButton("Exibir Vendas");
        btnExibirVendas.setBounds(400, 190, 150, 30);
        panel.add(btnExibirVendas);
        
        btnExibirVendas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder historico = new StringBuilder("Histórico de Vendas:\n");
                for (Venda v : vendas) {
                    historico.append(v.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, historico.toString());
            }
        });
     // Adicionando data de validade e lote
        JLabel lblValidade = new JLabel("Data de Validade:");
        lblValidade.setBounds(50, 110, 150, 30);
        panel.add(lblValidade);

        JTextField txtValidade = new JTextField();
        txtValidade.setBounds(200, 110, 150, 30);
        panel.add(txtValidade);

        JLabel lblLote = new JLabel("Lote:");
        lblLote.setBounds(50, 150, 150, 30);
        panel.add(lblLote);

        JTextField txtLote = new JTextField();
        txtLote.setBounds(200, 150, 150, 30);
        panel.add(txtLote);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNomeProduto.getText();
                double preco = Double.parseDouble(txtPrecoProduto.getText());
                String validade = txtValidade.getText();
                String lote = txtLote.getText();
                Produto produto = new Produto(produtos.size() + 1, nome, preco, 100);  // estoque fixo para exemplo
                produtos.add(produto);
                comboProdutos.addItem(nome);
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            }
        });

        add(panel);
	}
}















