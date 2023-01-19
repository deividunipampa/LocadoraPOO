package InterfacesGraficas.Veiculos;

import Fonte.Carro;
import Fonte.Onibus;
import Fonte.RelacaoDeVeiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddOnibusFrame extends JFrame {
    private JLabel placaLabel, anoLabel, valorLabel, passageirosLabel;
    private JTextField placaField, anoField, valorField, passageirosField;
    private JButton btnCadastrar, btnLimpar;
    private JRadioButton wifiRadioButton, arCondicionadoRadioButtom;

    RelacaoDeVeiculos relacaoDeVeiculos;
    public AddOnibusFrame(RelacaoDeVeiculos relacaoDeVeiculos){
        super("Adicionar Ônibus");
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel addOnibusPanel = new JPanel();
        placaLabel = new JLabel("Placa:");
        placaField = new JTextField(10);
        anoLabel = new JLabel("Ano:");
        anoField = new JTextField(10);
        valorLabel = new JLabel("Valor:");
        valorField = new JTextField(10);
        passageirosLabel = new JLabel("Capacidade de Passageiros:");
        passageirosField = new JTextField(10);

        wifiRadioButton = new JRadioButton("Wifi:");
        wifiRadioButton.setSelected(false);

        arCondicionadoRadioButtom = new JRadioButton("Ar condicionado:");
        arCondicionadoRadioButtom.setSelected(false);

        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String placa = placaField.getText();
                int ano = Integer.parseInt(anoField.getText());
                double valor = Double.parseDouble(valorField.getText());
                int passageiros = Integer.parseInt(passageirosField.getText());
                boolean wifi = wifiRadioButton.isSelected();
                boolean arCondicionado = arCondicionadoRadioButtom.isSelected();
                Onibus onibus = new Onibus(placa, ano, valor, passageiros, wifi, arCondicionado);
                relacaoDeVeiculos.add(onibus);
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
        // int portas, double quilometros, boolean arCondicionado
        addOnibusPanel.add(placaLabel);
        addOnibusPanel.add(placaField);
        addOnibusPanel.add(anoLabel);
        addOnibusPanel.add(anoField);
        addOnibusPanel.add(valorLabel);
        addOnibusPanel.add(valorField);
        addOnibusPanel.add(passageirosLabel);
        addOnibusPanel.add(passageirosField);
        addOnibusPanel.add(wifiRadioButton);
        addOnibusPanel.add(arCondicionadoRadioButtom);
        addOnibusPanel.add(btnLimpar);
        addOnibusPanel.add(btnCadastrar);
        add(addOnibusPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}