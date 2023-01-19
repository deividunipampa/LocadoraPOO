package InterfacesGraficas.Veiculos;

import Fonte.RelacaoDeVeiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class RemoverVeiculoFrame extends JFrame {
    RelacaoDeVeiculos relacaoDeVeiculos;
    private JTextField placaField;
    public RemoverVeiculoFrame(RelacaoDeVeiculos relacaoDeVeiculos){
        super("Remover Veículo");
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel buscarPanel = new JPanel();
        buscarPanel.setLayout(new GridLayout(30,20));
        JLabel placaLabel = new JLabel("Placa:");
        placaField = new JTextField();
        buscarPanel.add(placaLabel);
        buscarPanel.add(placaField);

        JButton removerButton = new JButton("Remover");
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = placaField.getText();
                try {
                    JOptionPane.showMessageDialog(null, relacaoDeVeiculos.get(placa) , "Sucesso! Veículo Removido", JOptionPane.INFORMATION_MESSAGE);
                    relacaoDeVeiculos.remove(placa);
                } catch (IllegalArgumentException g) {
                    JOptionPane.showMessageDialog(null,"Não foi encontrado um veículo com a PLACA informada.","Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(buscarPanel, BorderLayout.CENTER);
        add(removerButton, BorderLayout.SOUTH);
        setVisible(true);

    }
}
