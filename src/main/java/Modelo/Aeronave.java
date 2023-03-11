package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Aeronave {

    private int cod;
    private LocalDate dataAquisicao;
    private LocalDate dataAposentadoriao;
    private boolean emAtividade;
    private Modelo modelo;

    public Aeronave(int cod, LocalDate dataAquisicao, LocalDate dataAposentadoriao, boolean emAtividade, Modelo modelo) {
        this.cod = cod;
        this.dataAquisicao = dataAquisicao;
        this.dataAposentadoriao = dataAposentadoriao;
        this.emAtividade = emAtividade;
        this.modelo = modelo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public LocalDate getDataAposentadoriao() {
        return dataAposentadoriao;
    }

    public void setDataAposentadoriao(LocalDate dataAposentadoriao) {
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
        System.out.println("Faz algo");
    }

    public boolean consultarExistenciaVoo() {
        return false;
    }

    public void aposentarAeronave(LocalDate dataAposentadoria) {
        System.out.println("Alguma coisa");
    }

    public void excluirAeronave() {
        System.out.println(".");
    }
}
