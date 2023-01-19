package InterfacesGraficas.Locacoes;

import Fonte.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarLocacaoFrame extends JFrame {
    private JTextField cpfField, placaField, dataInicialField, dataFinalField;
    private JLabel cpfLabel, placaLabel, dataInicialLabel, dataFinalLabel;
    private RelacaoDeLocacoes relacaoDeLocacoes;
    private RelacaoDeClientes relacaoDeClientes;
    private RelacaoDeVeiculos relacaoDeVeiculos;
    private JRadioButton seguroJRadioButton;
    private JButton salvarButton;
    private JPanel addLocacao;

    public AdicionarLocacaoFrame(RelacaoDeLocacoes relacaoDeLocacoes, RelacaoDeVeiculos relacaoDeVeiculos, RelacaoDeClientes relacaoDeClientes) {
        super("Adicionar Locação");
        this.relacaoDeLocacoes = relacaoDeLocacoes;
        this.relacaoDeClientes = relacaoDeClientes;
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        setSize(1200, 800);
        setLocationRelativeTo(null);
        addLocacao = new JPanel();

        cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField(10);
        placaLabel = new JLabel("Placa:");
        placaField = new JTextField(10);
        dataInicialLabel = new JLabel("Data Inicial:");
        dataInicialField = new JTextField(10);
        dataFinalLabel = new JLabel("Data Final:");
        dataFinalField = new JTextField(10);

        seguroJRadioButton = new JRadioButton("Seguro");
        seguroJRadioButton.setSelected(false);

        salvarButton = new JButton("Salvar");

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfField.getText();
                String placa = placaField.getText();

                try{
                    Cliente cliente;
                    cliente = relacaoDeClientes.get(cpf);
                    try{
                        Veiculo veiculo;
                        veiculo = relacaoDeVeiculos.get(placa);
                        boolean seguro = seguroJRadioButton.isSelected();
                        String dataInicial = dataInicialField.getText();
                        String dataFinal = dataFinalField.getText();

                        Locacao locacao = new Locacao(cliente, veiculo, seguro, dataInicial, dataFinal);
                        JOptionPane.showMessageDialog(null,"Locação cadastrada!","Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    }catch  (IllegalArgumentException g1) {
                        JOptionPane.showMessageDialog(null,"Veículo não encontrado!","Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch  (IllegalArgumentException g) {
                    JOptionPane.showMessageDialog(null,"Cliente não encontrado!","Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        addLocacao.add(cpfLabel);
        addLocacao.add(cpfField);
        addLocacao.add(placaLabel);
        addLocacao.add(placaField);
        addLocacao.add(dataInicialLabel);
        addLocacao.add(dataInicialField);
        addLocacao.add(dataFinalLabel);
        addLocacao.add(dataFinalField);
        addLocacao.add(seguroJRadioButton);
        addLocacao.add(salvarButton);
        add(addLocacao,BorderLayout.CENTER);
        setVisible(true);
    }
}
