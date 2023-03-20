package me.dio.web.estruturaDeDados.lista;

import me.dio.web.estruturaDeDados.noGenereico.NoDuplo;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> aux = primeiroNo;
        for (int i = 0; (i < index) && (aux.getNoEsquerdo() != null); i++) {
            aux = aux.getNoEsquerdo();
        }
        return aux;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoDireito(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoEsquerdo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T conteudo) {
        NoDuplo<T> aux = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoEsquerdo(aux);
        if (novoNo.getNoEsquerdo() != null) {
            novoNo.setNoDireito(aux.getNoDireito());
            novoNo.getNoEsquerdo().setNoDireito(novoNo);
        } else {
            novoNo.setNoDireito(ultimoNo);
            this.ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoDireito().setNoEsquerdo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (tamanhoLista > 0) {
            NoDuplo<T> aux = getNo(index);
            aux.getNoDireito().setNoEsquerdo(aux.getNoEsquerdo());
            aux.getNoEsquerdo().setNoDireito(aux.getNoDireito());
            tamanhoLista--;
        }
    }

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    private int size() {
        return tamanhoLista;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        NoDuplo<T> aux = primeiroNo;

        for (int i=0 ;i< tamanhoLista;i++){
            retorno.append("conteudo: ").append(aux.getConteudo());
            if (i != tamanhoLista - 1){
                retorno.append(" -> ");
            }
            aux = aux.getNoEsquerdo();
        }

        return retorno.toString();
    }
}
