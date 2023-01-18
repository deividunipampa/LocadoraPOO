package InterfacesGraficas;

import Fonte.RelacaoDeVeiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarVeiculoFrame extends JFrame {
    RelacaoDeVeiculos relacaoDeVeiculos;
    public AdicionarVeiculoFrame(RelacaoDeVeiculos relacaoDeVeiculos) {
        super("Adicionar Veículo");

        this.relacaoDeVeiculos = relacaoDeVeiculos;
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JPanel adicionarPrincipal = new JPanel();
        adicionarPrincipal.setLayout(new GridLayout(30,20));


        //criar os botões
        JButton addCarro = new JButton("Adicionar um Carro");
        JButton addCaminhao = new JButton("Adicionar um Caminhão");
        JButton addOnibus = new JButton("Adicionar um Ônibus");

        //adiciona os botoes no panel

        adicionarPrincipal.add(addCarro);
        adicionarPrincipal.add(addCaminhao);
        adicionarPrincipal.add(addOnibus);

        addCarro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            AddCarroFrame addCarroFrame = new AddCarroFrame(relacaoDeVeiculos);
            setVisible(false);
            }
        });

        setVisible(true);
        add(adicionarPrincipal, BorderLayout.CENTER);
    }
}
