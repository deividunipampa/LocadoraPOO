package Fonte;

import Interfaces.IClientes;

import java.util.ArrayList;

public class RelacaoDeClientes implements IClientes {
    private final  ArrayList<Cliente> lista;
    public RelacaoDeClientes() {
        this.lista = new ArrayList<>();
    }



    @Override
    public void add(Cliente c) {
        lista.add(c);
    }



    @Override
    public Cliente get(String cpf){
        for (Cliente cliente : lista) {
            if (cpf.equals(cliente.getCpf())) return cliente;
        }
        throw new IllegalArgumentException("Cliente não encontrado!");
    }

    @Override
    public String getInfo(String cpf){
        try {
            return get(cpf).toString();
        } catch (NullPointerException e) {
            return e.getMessage();
        }
    }

    @Override
    public String getInfo(){
        if (lista.size() > 0) {
            String dados = "";
            for (int i = 0; i < lista.size(); i++) {
                dados += lista.get(i).toString() + "\n";
            }
            return dados;
        }
        throw new NullPointerException("Nenhum cliente cadastrado!");
    }

    /**
     * Captura uma String com o CPF e o nome de todos os clientes.
     * @return String com o CPF e o nome de todos os clientes
     * ou null caso não exista nenhum cliente.
     */
    public String getResumoInfo(){
        if(lista.size()>=0){
            String conteudo = "";
            for(Cliente cliente : lista){
                conteudo += cliente.getResumo()+ "\n";
            }
            return conteudo;
        }
        throw new NullPointerException("Nenhum cliente cadastrado!");
    }

    public boolean remove(String  cpf) {
        try {
            lista.remove(get(cpf));
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    public boolean existe(String cpf) {
        for (int i = 0; i < lista.size(); i++){
            if (cpf.equals(lista.get(i).getCpf())){
                return true;
            }
        }
        return false;
    }
}