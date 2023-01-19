package InterfacesGraficas.Veiculos;

import Fonte.Carro;
import Fonte.RelacaoDeVeiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCarroFrame extends JFrame {
    private JLabel placaLabel, anoLabel, valorLabel, passageirosLabel, portasLabel, quilometrosLabel;
    private JTextField placaField, anoField, valorField, passageirosField, portasField, quilometrosField;
    private JButton btnCadastrar, btnLimpar;
    private JRadioButton jRadioButton;

    RelacaoDeVeiculos relacaoDeVeiculos;
    public AddCarroFrame(RelacaoDeVeiculos relacaoDeVeiculos){
        super("Adicionar Carro");
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel addCarroPanel = new JPanel();

        placaLabel = new JLabel("Placa:");
        placaField = new JTextField(10);
        anoLabel = new JLabel("Ano:");
        anoField = new JTextField(10);
        valorLabel = new JLabel("Valor:");
        valorField = new JTextField(10);
        passageirosLabel = new JLabel("Capacidade de Passageiros:");
        passageirosField = new JTextField(10);
        portasLabel = new JLabel("Número de Portas:");
        portasField = new JTextField(10);
        quilometrosLabel = new JLabel("Quilometros Rodados:");
        quilometrosField = new JTextField(10);
        jRadioButton = new JRadioButton("Ar condicionado:");
        jRadioButton.setSelected(false);

        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String placa = placaField.getText();
                int ano = Integer.parseInt(anoField.getText());
                double valor = Double.parseDouble(valorField.getText());
                int passageiros = Integer.parseInt(passageirosField.getText());
                int portas = Integer.parseInt(portasField.getText());
                double quilometros = Double.parseDouble(quilometrosField.getText());
                boolean arCondicionado = jRadioButton.isSelected();
                Carro carro = new Carro(placa,ano,valor,passageiros,portas,quilometros,arCondicionado);
                relacaoDeVeiculos.add(carro);


            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                placaField.setText("");
                anoField.setText("");
                valorField.setText("");
                passageirosField.setText("");
                portasField.setText("");
                quilometrosField.setText("");
            }
        });
        // int portas, double quilometros, boolean arCondicionado
        addCarroPanel.add(placaLabel);
        addCarroPanel.add(placaField);
        addCarroPanel.add(anoLabel);
        addCarroPanel.add(anoField);
        addCarroPanel.add(valorLabel);
        addCarroPanel.add(valorField);
        addCarroPanel.add(passageirosLabel);
        addCarroPanel.add(passageirosField);
        addCarroPanel.add(portasLabel);
        addCarroPanel.add(portasField);
        addCarroPanel.add(quilometrosLabel);
        addCarroPanel.add(quilometrosField);
        addCarroPanel.add(jRadioButton);
        addCarroPanel.add(btnLimpar);
        addCarroPanel.add(btnCadastrar);
        add(addCarroPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}