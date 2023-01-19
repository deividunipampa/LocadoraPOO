package Fonte;

import Interfaces.*;

import java.util.ArrayList;

public class RelacaoDeVeiculos implements IVeiculos {
    private final ArrayList<Veiculo> listaDeVeiculos;

    public RelacaoDeVeiculos() {
        listaDeVeiculos = new ArrayList<>();
    }

    @Override
    public void add(Veiculo v) {
        listaDeVeiculos.add(v);
    }

    /**
     * Captura o veiculo com a placa informada por parâmetro.
     * @param placa Placa do veiculo a ser capturado.
     * @return Fonte.Veiculo com a placa informada ou null em caso da placa não ser encontrada.
     */
    @Override
    public Veiculo get(String placa) {
        for(Veiculo veiculo : listaDeVeiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        throw new NullPointerException("Veiculo não encontrado!");
    }

    /**
     * Captura uma String com as informaçoes do veiculo com a placa informada por parâmetro.
     * @param placa Placa do veiculo a ser capturado.
     * @return String com as informaçoes do veiculo com a placa informada por parâmetro
     * ou null em caso da placa não ser encontrada.
     */
    @Override
public String getInfo(String placa) {
    try {
        return get(placa).toString();
    } catch (NullPointerException e) {
        return e.getMessage();
    }
}

    /**
     * Captura uma String com as informaçoes de todos os veiculos.
     * @return String com as informaçoes de todos os veiculos
     * ou null caso não exista nenhum veiculo.
     */
    @Override
    public String getInfo() {
        if (listaDeVeiculos.size() > 0) {
            String dados = "";
            for (int i = 0; i < listaDeVeiculos.size(); i++) {
                dados += listaDeVeiculos.get(i).toString() + "\n";
            }
            return dados;
        }
        throw new NullPointerException("Nenhum veículo cadastrado!");
    }

    @Override
    public String toString() {
        String dados = "";

        for (int i = 0; i < listaDeVeiculos.size(); i++){
            dados += listaDeVeiculos.get(i).toString() + "/n";
        }
        return dados;
    }

    /**
     * @return String com a placa, o ano e o valor da diaria de todos os veiculos
     * ou null caso não exista nenhum veiculo.
     */
    @Override
    public String getResumoInfo() {
        if(listaDeVeiculos.size() > 0) {
            String conteudo = "";
            for(Veiculo veiculo : listaDeVeiculos) {
                conteudo += veiculo.toStringResumo() + "\n";
            }
            return conteudo;
        }
        throw new NullPointerException("Nenhum veiculo cadastrado!");
    }

    /**
     * Remove o veiculo com placa igual a informada por parâmetro.
     * @param placa Placa do veiculo a ser capturado.
     * @return True se o veiculo com a placa informada por parâmetro for removido ou
     * false caso não exista nenhum veiculo com a placa informada.
     */
    @Override
    public boolean remove(String placa) {
        try {
            listaDeVeiculos.remove(get(placa));
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    /**
     * Verifica se existe um veiculo com a placa informada por parâmetro.
     * @param placa Placa do veiculo a ser verificada.
     * @return True se um veiculo com a placa informada for encontrado ou
     * false caso não exista nenhum veiculo com a placa informada.
     */
    @Override
    public boolean existe (String placa){
        try {
            get(placa);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }
}