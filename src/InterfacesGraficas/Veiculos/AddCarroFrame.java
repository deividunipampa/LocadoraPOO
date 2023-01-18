package InterfacesGraficas.Veiculos;

import Fonte.RelacaoDeVeiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCarroFrame extends JFrame {

    //String placa, int ano, double valor, int passageiros, int portas, double quilometros, boolean arCondicionado
    private JLabel placaLabel, anoLabel, valorLabel, passageirosLabel, portasLabel, quilometrosLabel, arCondicionadoLabel;
    private JTextField placaField, anoField, valorField, passageirosField, portasField, quilometrosField, arCondicionadoField;
    private JButton btnCadastrar, btnLimpar;

    RelacaoDeVeiculos relacaoDeVeiculos;
    public AddCarroFrame(RelacaoDeVeiculos relacaoDeVeiculos){
        super("Adicionar Carro");
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setLayout( new FlowLayout());

        JPanel addCarroPanel = new JPanel();

        placaLabel = new JLabel("Modelo:");

        placaField = new JTextField(20);
        anoLabel = new JLabel("Marca:");
        anoField = new JTextField(20);
        valorLabel = new JLabel("Ano:");
        valorField = new JTextField(20);
        passageirosLabel = new JLabel("Cor:");
        passageirosField = new JTextField(20);


        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //String placa, int ano, double valor, int passageiros, int portas, double quilometros, boolean arCondicionado
                //colocar tudo em variaveis string e criar o eiuclo e add e lipar os campos e setar a visibulidade
                String placa = placaField.getText();
                int ano = Integer.parseInt(anoField.getText());
                double valor = Double.parseDouble(valorField.getText());
                int passageiros = Integer.parseInt(passageirosField.getText());
                int portas = Integer.parseInt(portasField.getText());
                double quilometros = Double.parseDouble(quilometrosField.getText());


            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                placaField.setText("");
                anoField.setText("");
                valorField.setText("");
                passageirosField.setText("");
            }
        });

        addCarroPanel.add(placaLabel);
        addCarroPanel.add(placaField);
        addCarroPanel.add(anoLabel);
        addCarroPanel.add(anoField);
        addCarroPanel.add(valorLabel);
        addCarroPanel.add(valorField);
        addCarroPanel.add(passageirosLabel);
        addCarroPanel.add(passageirosField);
        addCarroPanel.add(btnCadastrar);
        addCarroPanel.add(btnLimpar);
        add(addCarroPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}