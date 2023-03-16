package Modelo;

import Persistencia.MyDatabaseOperations;

/**
 *
 * @author Admin
 */
public class Aeronave {

    private int id_aeronave;
    private int cod;
    private String dataAquisicao;
    private String dataAposentadoriao;
    private boolean emAtividade;
    private Modelo modelo;

    public Aeronave(int cod, String dataAquisicao, String dataAposentadoriao, boolean emAtividade, Modelo modelo) {
        this.cod = cod;
        this.dataAquisicao = dataAquisicao;
        this.dataAposentadoriao = dataAposentadoriao;
        this.emAtividade = emAtividade;
        this.modelo = modelo;
    }

    public int getId_aeronave() {
        return id_aeronave;
    }

    public void setId_aeronave(int id_aeronave) {
        this.id_aeronave = id_aeronave;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getDataAposentadoriao() {
        return dataAposentadoriao;
    }

    public void setDataAposentadoriao(String dataAposentadoriao) {
        this.dataAposentadoriao = dataAposentadoriao;
    }

    public boolean isEmAtividade() {
        return emAtividade;
    }

    public void setEmAtividade(boolean emAtividade) {
        this.emAtividade = emAtividade;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void salvarAeronave() {
        this.id_aeronave = MyDatabaseOperations.inserirAeronave(this);
    }

    public boolean consultarExistenciaVoo() {
        return false;
    }

    public void aposentarAeronave(String dataAposentadoria) {
        System.out.println();
    }

    public void excluirAeronave() {
        System.out.println();
    }
}
