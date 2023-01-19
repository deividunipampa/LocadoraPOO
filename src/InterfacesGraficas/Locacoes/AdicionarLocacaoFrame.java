package InterfacesGraficas.Locacoes;

import javax.swing.*;
import java.awt.*;

public class AdicionarLocacaoFrame extends JFrame {
    private JTextField cpfField;
    private JTextField placaField;

    public AdicionarLocacaoFrame() {
        super("Adicionar Locação");
        JPanel addLocacao = new JPanel();
        setLayout(new BorderLayout());

        add(addLocacao);

    }
}
