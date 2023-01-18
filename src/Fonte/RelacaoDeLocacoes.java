package Fonte;
import Interfaces.ILocacoes;
import java.util.ArrayList;

public class RelacaoDeLocacoes implements ILocacoes {
    private final ArrayList<Locacao> locacoes;

    public RelacaoDeLocacoes() {

        locacoes = new ArrayList<>();
    }

    /**
     * @param l do tipo Locacao que adiciona a locacao no arraylist
     */
    @Override
    public void add(Locacao l) {
        locacoes.add(l);
    }


    /**
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return Locacao que tem o codigo informado
     */
    @Override
    public Locacao get(int codigo) {
        for(Locacao locacao : locacoes) {
            if(locacao.getCodigo() == codigo) {
                return locacao;
            }
        }
        throw new NullPointerException("Locação não encontrada");
    }


    /**
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return String com as informações da locacao
     */
    @Override
    public String getInfo(int codigo) {
        if(locacoes.size() > 0) {
            String conteudo = "";
            for(Locacao locacao : locacoes) {
                conteudo += locacao.toString() + "\n";
            }
            return conteudo;
        }
        throw new IllegalArgumentException("Não existem locações cadastradas");
    }

    /**
     * @return String com as informações de todas as locacoes
     */
    @Override
    public String getInfo() {
        if(locacoes.size() > 0) {
            String conteudo = "";
            for(Locacao locacao : locacoes) {
                conteudo += locacao.toString() + "\n";
            }
            return conteudo;
        }
        throw new NullPointerException("Não existem locações cadastradas");
    }

    /**
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return boolean se a remoção foi feita com sucesso
     */
    @Override
    public boolean remove(int codigo) {
        for(Locacao locacao : locacoes) {
            if(locacao.getCodigo() == codigo) {
                locacoes.remove(locacao);
                return true;
            }
        }
        return false;
    }


    /**
     * @param codigo do tipo int que é usado para procurar a locacao
     * @return boolean se a locacao existe
     */
    @Override
    public boolean existe(int codigo) {
        for(Locacao locacao : locacoes) {
            if(locacao.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }
}