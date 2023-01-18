package InterfacesGraficas.Clientes;

import Fonte.RelacaoDeClientes;

import javax.swing.*;
import java.awt.*;

public class ListarClientesFrame extends JFrame{
    private RelacaoDeClientes relacaoDeClientes;
    public ListarClientesFrame(RelacaoDeClientes relacaoDeClientes){
        super("Lista com as Informações de Todos os Clientes");
        this.relacaoDeClientes = relacaoDeClientes;
        JTextArea textArea = new JTextArea(relacaoDeClientes.getResumoInfo());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(500, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de clientes", JOptionPane.INFORMATION_MESSAGE);

    }
}
