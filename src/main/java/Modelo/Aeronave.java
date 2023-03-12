package Modelo;

import Persistencia.MyDatabaseOperations;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Aeronave {

    private int id_aeronave;
    private int cod;
    private Date dataAquisicao;
    private Date dataAposentadoriao;
    private boolean emAtividade;
    private Modelo modelo;

    public Aeronave(int cod, Date dataAquisicao, Date dataAposentadoriao, boolean emAtividade, Modelo modelo) {
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

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Date getDataAposentadoriao() {
        return dataAposentadoriao;
    }

    public void setDataAposentadoriao(Date dataAposentadoriao) {
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
        MyDatabaseOperations.inserirAeronave(this);
    }

    public boolean consultarExistenciaVoo() {
        return false;
    }

    public void aposentarAeronave(Date dataAposentadoria) {
        System.out.println();
    }

    public void excluirAeronave() {
        System.out.println();
    }
}
