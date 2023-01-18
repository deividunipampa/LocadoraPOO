package InterfacesGraficas.Locacoes;

import Fonte.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscarLocacaoFrame extends JFrame {
    RelacaoDeLocacoes relacaoDeLocacoes;
    private JTextField codigoField;
    public BuscarLocacaoFrame(RelacaoDeLocacoes relacaoDeLocacoes){
        super("Buscar Locação");
        this.relacaoDeLocacoes = relacaoDeLocacoes;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel buscarPanel = new JPanel();
        buscarPanel.setLayout(new GridLayout(30,20));
        JLabel codigoLabel = new JLabel("Código de locação: ");
        codigoField = new JTextField();
        buscarPanel.add(codigoLabel);
        buscarPanel.add(codigoField);

        JButton buscarButton = new JButton("Buscar");
        setVisible(true);
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(codigoField.getText());
                try {
                    JOptionPane.showMessageDialog(null, relacaoDeLocacoes.getInfo(codigo), "Successo", JOptionPane.INFORMATION_MESSAGE);
                } catch (IllegalArgumentException g) {
                    JOptionPane.showMessageDialog(null,"Não foi encontrado uma locação com o código informado.","Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(buscarPanel, BorderLayout.CENTER);
        add(buscarButton, BorderLayout.SOUTH);

    }
}