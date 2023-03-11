package Modelo;

/**
 *
 * @author Admin
 */
public class Modelo {

    private int id_modelo;
    private String nome;
    private int capacidadePassageiros;
    private int capacidadeCarga;
    private int autonomia;
    private Fabricante fabricante;

    public Modelo(int id_modelo, String nome, int capacidadePassageiros, int capacidadeCarga, int autonomia, Fabricante fabricante) {
        this.id_modelo = id_modelo;
        this.nome = nome;
        this.capacidadePassageiros = capacidadePassageiros;
        this.capacidadeCarga = capacidadeCarga;
        this.autonomia = autonomia;
        this.fabricante = fabricante;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void salvarModelo() {
        System.out.println(".");
    }
}
