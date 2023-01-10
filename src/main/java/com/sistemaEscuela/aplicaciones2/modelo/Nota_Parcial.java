package com.sistemaEscuela.aplicaciones2.modelo;

import javax.persistence.*;


@Entity
@Table(name="Notas_Parciales")
public class Nota_Parcial {
    private Integer acumulado1;

    private Integer acumulado2;
    private Integer acumulado3;
    private Integer acumulado4;
    private Integer acumulado5;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;
//    TODO: Asociar a la materia que corresponda  al estudiante 

    public void setId(long id) {
        this.id = id;
    }

    public void setAcumulado1(Integer acumulado1) {
        this.acumulado1 = acumulado1;
    }

    public void setAcumulado2(Integer acumulado2) {
        this.acumulado2 = acumulado2;
    }

    public void setAcumulado3(Integer acumulado3) {
        this.acumulado3 = acumulado3;
    }

    public void setAcumulado4(Integer acumulado4) {
        this.acumulado4 = acumulado4;
    }

    public void setAcumulado5(Integer acumulado5) {
        this.acumulado5 = acumulado5;
    }

    public long getId() {
        return id;
    }

    public Integer getAcumulado1() {
        return acumulado1;
    }

    public Integer getAcumulado2() {
        return acumulado2;
    }

    public Integer getAcumulado3() {
        return acumulado3;
    }

    public Integer getAcumulado4() {
        return acumulado4;
    }

    public Integer getAcumulado5() {
        return acumulado5;
    }
}
