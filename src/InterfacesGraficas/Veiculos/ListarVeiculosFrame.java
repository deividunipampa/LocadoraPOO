package InterfacesGraficas.Veiculos;

import Fonte.RelacaoDeVeiculos;

import javax.swing.*;
import java.awt.*;

public class ListarVeiculosFrame extends JFrame{
    private RelacaoDeVeiculos relacaoDeVeiculos;

    public ListarVeiculosFrame(RelacaoDeVeiculos relacaoDeVeiculos) {
        super("Lista com as Informações de Todos os Veículos");
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        JTextArea textArea = new JTextArea(relacaoDeVeiculos.getInfo());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(500, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Veículos", JOptionPane.INFORMATION_MESSAGE);
    }
}
