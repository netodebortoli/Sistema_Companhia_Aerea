package Modelo;

import Persistencia.FabricanteDAO;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Fabricante {

    private int id_fabricante;
    private String nome;
    private String paisOrigem;

    public Fabricante(String nome, String paisOrigem) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
    }

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

     public void salvarFabricante() throws SQLException, ClassNotFoundException {
        this.id_fabricante = FabricanteDAO.inserirFabricante(this);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
