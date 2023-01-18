package InterfacesGraficas.Locacoes;

import Fonte.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoverLocacaoFrame extends JFrame {
    RelacaoDeLocacoes relacaoDeLocacoes;
    private JTextField codigoField;
    public RemoverLocacaoFrame(RelacaoDeLocacoes relacaoDeLocacoes){
        super("Remover Locação");
        this.relacaoDeLocacoes = relacaoDeLocacoes;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel buscarPanel = new JPanel();
        buscarPanel.setLayout(new GridLayout(30,20));
        JLabel codigoLabel = new JLabel("Código da locação:");
        codigoField = new JTextField();
        buscarPanel.add(codigoLabel);
        buscarPanel.add(codigoField);

        JButton removerButton = new JButton("Remover");
        setVisible(true);
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int codigo = Integer.parseInt(codigoField.getText());
                    JOptionPane.showMessageDialog(null, relacaoDeLocacoes.get(codigo) , "Sucesso! Locação Removida", JOptionPane.INFORMATION_MESSAGE);
                    relacaoDeLocacoes.remove(codigo);
                } catch (IllegalArgumentException g) {
                    JOptionPane.showMessageDialog(null,"Não foi encontrado uma locação com o código informado.","Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(buscarPanel, BorderLayout.CENTER);
        add(removerButton, BorderLayout.SOUTH);

    }
}