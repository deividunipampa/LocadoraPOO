package InterfacesGraficas.Veiculos;

import Fonte.RelacaoDeClientes;
import Fonte.RelacaoDeVeiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscarVeiculoFrame extends JFrame {
    RelacaoDeVeiculos relacaoDeVeiculos;
    private JTextField placaField;
    public BuscarVeiculoFrame(RelacaoDeVeiculos relacaoDeVeiculos){
        super("Buscar veículo: ");
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel buscarPanel = new JPanel();
        buscarPanel.setLayout(new GridLayout(30,20));
        JLabel placaLabel = new JLabel("Placa:");
        placaField = new JTextField();
        buscarPanel.add(placaLabel);
        buscarPanel.add(placaField);

        JButton buscarButton = new JButton("Buscar");
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String placa = placaField.getText();
                try {
                    JOptionPane.showMessageDialog(null, relacaoDeVeiculos.get(placa), "Successo", JOptionPane.INFORMATION_MESSAGE);
                } catch (IllegalArgumentException g) {
                    JOptionPane.showMessageDialog(null,"Não foi encontrado um veículo com a placa informada.","Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(buscarPanel, BorderLayout.CENTER);
        add(buscarButton, BorderLayout.SOUTH);
        setVisible(true);
    }
}