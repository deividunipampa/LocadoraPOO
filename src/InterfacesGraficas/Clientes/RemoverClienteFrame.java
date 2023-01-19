package InterfacesGraficas.Clientes;

import Fonte.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoverClienteFrame extends JFrame {
    RelacaoDeClientes relacaoDeClientes;
    private JTextField cpfField;
    public RemoverClienteFrame(RelacaoDeClientes relacaoDeClientes){
        super("Remover Cliente");
        this.relacaoDeClientes = relacaoDeClientes;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel buscarPanel = new JPanel();
        buscarPanel.setLayout(new GridLayout(30,20));
        JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField();
        buscarPanel.add(cpfLabel);
        buscarPanel.add(cpfField);

        JButton removerButton = new JButton("Remover");
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfField.getText();
                try {
                    JOptionPane.showMessageDialog(null, relacaoDeClientes.get(cpf) , "Sucesso! Cliente Removido", JOptionPane.INFORMATION_MESSAGE);
                    relacaoDeClientes.remove(cpf);
                } catch (IllegalArgumentException g) {
                    JOptionPane.showMessageDialog(null,"Não foi encontrado um cliente com o CPF informado.","Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(buscarPanel, BorderLayout.CENTER);
        add(removerButton, BorderLayout.SOUTH);
        setVisible(true);

    }
}