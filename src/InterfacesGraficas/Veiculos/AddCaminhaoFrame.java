package InterfacesGraficas.Veiculos;

import Fonte.Caminhao;
import Fonte.RelacaoDeVeiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCaminhaoFrame extends JFrame {
    private JLabel placaLabel, anoLabel, valorLabel, cargaMaxLabel, eixosLabel;
    private JTextField placaField, anoField, valorField, cargaMaxField, eixosField;
    private JButton btnCadastrar, btnLimpar;
    RelacaoDeVeiculos relacaoDeVeiculos;
    public AddCaminhaoFrame(RelacaoDeVeiculos relacaoDeVeiculos){
        super("Adicionar Caminhão");
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel addCaminhaoPanel = new JPanel();

        placaLabel = new JLabel("Placa:");
        placaField = new JTextField(10);
        anoLabel = new JLabel("Ano:");
        anoField = new JTextField(10);
        valorLabel = new JLabel("Valor:");
        valorField = new JTextField(10);
        cargaMaxLabel = new JLabel("Carga Máxima Suportada:");
        cargaMaxField = new JTextField(10);
        eixosLabel = new JLabel("Número de Eixos:");
        eixosField = new JTextField(10);

        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String placa = placaField.getText();
                int ano = Integer.parseInt(anoField.getText());
                double valor = Double.parseDouble(valorField.getText());
                int eixos = Integer.parseInt(eixosField.getText());
                double cargaMax = Double.parseDouble(cargaMaxField.getText());

                Caminhao caminhao = new Caminhao(placa,ano,valor,eixos,cargaMax);
                relacaoDeVeiculos.add(caminhao);
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                placaField.setText("");
                anoField.setText("");
                valorField.setText("");
                eixosField.setText("");
                cargaMaxField.setText("");
            }
        });
        // int portas, double quilometros, boolean arCondicionado
        addCaminhaoPanel.add(placaLabel);
        addCaminhaoPanel.add(placaField);
        addCaminhaoPanel.add(anoLabel);
        addCaminhaoPanel.add(anoField);
        addCaminhaoPanel.add(valorLabel);
        addCaminhaoPanel.add(valorField);
        addCaminhaoPanel.add(eixosLabel);
        addCaminhaoPanel.add(eixosField);
        addCaminhaoPanel.add(cargaMaxLabel);
        addCaminhaoPanel.add(cargaMaxField);
        addCaminhaoPanel.add(btnLimpar);
        addCaminhaoPanel.add(btnCadastrar);
        add(addCaminhaoPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}