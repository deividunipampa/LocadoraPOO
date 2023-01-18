import Fonte.RelacaoDeClientes;
import Fonte.RelacaoDeLocacoes;
import Fonte.RelacaoDeVeiculos;
import InterfacesGraficas.PrincipalGUI;

import javax.swing.*;

public class Locadora {
    public Locadora() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RelacaoDeClientes relacaoDeClientes = new RelacaoDeClientes();
                RelacaoDeVeiculos relacaoDeVeiculos = new RelacaoDeVeiculos();
                RelacaoDeLocacoes relacaoDeLocacoes = new RelacaoDeLocacoes();

                //aqui vai criar a interface principal
                PrincipalGUI principal = new PrincipalGUI(relacaoDeClientes, relacaoDeVeiculos, relacaoDeLocacoes);
                principal.setVisible(true);
            }
        });
    }
}
