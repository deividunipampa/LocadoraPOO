/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesGraficas;

import Fonte.*;
import InterfacesGraficas.Clientes.AdicionarClienteFrame;
import InterfacesGraficas.Clientes.BuscarClienteFrame;
import InterfacesGraficas.Clientes.ListarClientesFrame;
import InterfacesGraficas.Clientes.RemoverClienteFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Ualquer
 */
public class PrincipalGUI extends JFrame {
    RelacaoDeClientes relacaoDeClientes;
    RelacaoDeVeiculos relacaoDeVeiculos;
    RelacaoDeLocacoes relacaoDeLocacoes;
    String cpf;

    JButton buscarCPFCliente;
    public PrincipalGUI( RelacaoDeClientes relacaoDeClientes, RelacaoDeVeiculos relacaoDeVeiculos, RelacaoDeLocacoes relacaoDeLocacoes) {
        this.relacaoDeClientes = relacaoDeClientes;
        this.relacaoDeVeiculos = relacaoDeVeiculos;
        this.relacaoDeLocacoes = relacaoDeLocacoes;

        // Cria um menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Cria os menus "Arquivo, Locações, Clientes, e Veículos"
        JMenu arquivoMenu = new JMenu("Arquivo");
        JMenu locacoesMenu = new JMenu("Locações");
        JMenu clientesMenu = new JMenu("Clientes");
        JMenu veiculosMenu = new JMenu("Veículos");
        menuBar.add(arquivoMenu);
        menuBar.add(locacoesMenu);
        menuBar.add(clientesMenu);
        menuBar.add(veiculosMenu);

        // Cria as opções "Salvar" no menu "Arquivo"
        JMenuItem salvarOption = new JMenuItem("Salvar");
        
        arquivoMenu.add(salvarOption);

        // Cria as opções "Adicionar", "Listar" e "Buscar" no menu "Locações"
        JMenuItem adicionarLocacaoOption = new JMenuItem("Adicionar");
        JMenuItem buscarLocacaoOption = new JMenuItem("Buscar");
        JMenuItem listarLocacaoOption = new JMenuItem("Exibir todos");
        
        locacoesMenu.add(adicionarLocacaoOption);
        locacoesMenu.add(buscarLocacaoOption);
        locacoesMenu.add(listarLocacaoOption);
        
        //Cria as opões de "Adicionar", "Listar" e "Buscar" no menu "Clientes"
        JMenuItem adicionarClienteOption = new JMenuItem("Adicionar");
        JMenuItem buscarClienteOption = new JMenuItem("Buscar");
        JMenuItem removerClienteOption = new JMenuItem("Remover");
        JMenuItem listarClientesOption = new JMenuItem("Exibir todos");
        
        clientesMenu.add(adicionarClienteOption);
        clientesMenu.add(buscarClienteOption);
        clientesMenu.add(listarClientesOption);
        clientesMenu.add(removerClienteOption);
        

        //Cria as Opções de "Adicionar, listar, e buscar" no menu "Veículos"

        JMenuItem adicionarVeiculoOption = new JMenuItem("Adicionar");
        JMenuItem buscarVeiculoOption = new JMenuItem("Buscar");
        JMenuItem listarVeiculosOption = new JMenuItem("Exibir Todos");

        veiculosMenu.add(adicionarVeiculoOption);
        veiculosMenu.add(buscarVeiculoOption);
        veiculosMenu.add(listarVeiculosOption);
        
        // Adiciona ação ao clicar nas opções de menu
        salvarOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou em Salvar");
            }
        });
        
        adicionarLocacaoOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou em Adicionar Locacao");
            }
        });
        buscarLocacaoOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou em Buscar Locação");
            }
        });
        listarLocacaoOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou em Listar todas locações");
            }
        });
        adicionarClienteOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdicionarClienteFrame panelCliente = null;
                try {
                    panelCliente = new AdicionarClienteFrame(relacaoDeClientes);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("Clicou em Adicionar Cliente");
            }
        });

        //Ao clicar no botao listar clientes, ele recebe o resumo dos clientes, com o CPF e nome
        listarClientesOption.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                try {
                    ListarClientesFrame listarClientesFrame = new ListarClientesFrame(relacaoDeClientes);
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro: Nenhum Cliente cadastrado!","Erro", JOptionPane.ERROR_MESSAGE);
                };

            }
        });
        removerClienteOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RemoverClienteFrame removerClienteFrame = new RemoverClienteFrame(relacaoDeClientes);
            }
        });


        buscarClienteOption.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                try{
                    BuscarClienteFrame buscarClienteFrame = new BuscarClienteFrame(relacaoDeClientes);
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro: Cliente não encontrado!","Erro", JOptionPane.ERROR_MESSAGE);
                };

            }
        });

        adicionarVeiculoOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    AdicionarVeiculoFrame adicionarVeiculoFrame = new AdicionarVeiculoFrame(relacaoDeVeiculos);
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null,"Erro: Não foi possivel cadastrar!","Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });



        
        
        setTitle("Locadora Dequer");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}