package com.numerosAleatorios;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NumeroAleatorioBean {

    private int maximo;
    private int numeroAleatorio;
    private List<Integer>  listaNumerosGerados = new ArrayList<>();

    public String geraNumeroAleatorio() {
        this.setNumeroAleatorio((int) (Math.random() * this.getMaximo()));
        listaNumerosGerados.add(numeroAleatorio);
        return "resposta";
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public List<Integer> getListaNumerosGerados() {
        return listaNumerosGerados;
    }

    public void setListaNumerosGerados(List<Integer> listaNumerosGerados) {
        this.listaNumerosGerados = listaNumerosGerados;
    }

}
