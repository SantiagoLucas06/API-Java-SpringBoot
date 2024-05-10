package br.ebac.animalservice.entidades;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "porte")
    private String porte;

    @Column(name = "nome_provisorio", nullable = false)
    private String nome;

    @Column(name = "idade_estimada", nullable = false)
    private Integer idadeEstimada;

    @Column(name = "raca", nullable = false)
    private String raca;

    @Column(name = "data_entrada", nullable = false)
    private Date dataEntrada;

    @Column(name = "data_adocao")
    private Date dataAdocao;

    @Column(name = "condicoes_chegada", nullable = false)
    private String condicoesChegada;

    @Column(name = "nome_recebedor", nullable = false)
    private String nomeRecebedor;

    @Column(name = "data_obito")
    private Date dataObito;


    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }
}