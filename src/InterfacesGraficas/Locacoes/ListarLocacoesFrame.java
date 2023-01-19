package InterfacesGraficas.Locacoes;

import Fonte.RelacaoDeLocacoes;

import javax.swing.*;
import java.awt.*;

public class ListarLocacoesFrame extends JFrame {
    private RelacaoDeLocacoes relacaoDeLocacoes;

    public ListarLocacoesFrame(RelacaoDeLocacoes relacaoDeLocacoes) {
        super("Lista com as Informações de Todas as Locações");
        this.relacaoDeLocacoes = relacaoDeLocacoes;
        JTextArea textArea = new JTextArea(relacaoDeLocacoes.getInfo());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(500, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Locações", JOptionPane.INFORMATION_MESSAGE);
    }
}