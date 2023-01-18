package InterfacesGraficas.Clientes;
import Fonte.Cliente;
import Fonte.RelacaoDeClientes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AdicionarClienteFrame extends JFrame{
    private JTextField nomeField;
    private JTextField cpfField;
    private JTextField enderecoField;
    private JTextField habilitacaoField;
    private JTextField telefoneField;
    private RelacaoDeClientes relacaoDeClientes;

    public AdicionarClienteFrame(RelacaoDeClientes relacaoDeClientes) {
        super("Adicionar Cliente");
        this.relacaoDeClientes = relacaoDeClientes;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel adicionarPanel = new JPanel();
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);
        adicionarPanel.add(nomeLabel);
        adicionarPanel.add(nomeField);

        JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField(20);
        adicionarPanel.add(cpfLabel);
        adicionarPanel.add(cpfField);

        JLabel habilitacaoLabel = new JLabel("Habilitação:");
        habilitacaoField = new JTextField(20);
        adicionarPanel.add(habilitacaoLabel);
        adicionarPanel.add(habilitacaoField);

        JLabel enderecoLabel = new JLabel("Endereço:");
        enderecoField = new JTextField(20);
        adicionarPanel.add(enderecoLabel);
        adicionarPanel.add(enderecoField);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField(20);
        adicionarPanel.add(telefoneLabel);
        adicionarPanel.add(telefoneField);

        JButton addButton = new JButton("Adicionar");
        setVisible(true);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String cpf = cpfField.getText();
                String endereco = enderecoField.getText();
                String habilitacao = habilitacaoField.getText();
                String telefone = telefoneField.getText();
                Cliente cliente = new Cliente(cpf,nome,habilitacao,endereco,telefone);
                relacaoDeClientes.add(cliente);
                nomeField.setText("");
                cpfField.setText("");
                enderecoField.setText("");
                setVisible(false);
                //caixa que mostra que o cliente foi adicionado com sucesso
                JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!", "Successo", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        add(adicionarPanel, BorderLayout.CENTER);
        adicionarPanel.add(addButton);
    }
}
