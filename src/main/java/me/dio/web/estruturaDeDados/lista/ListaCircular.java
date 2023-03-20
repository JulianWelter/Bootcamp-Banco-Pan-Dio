package me.dio.web.estruturaDeDados.lista;

import me.dio.web.estruturaDeDados.noGenereico.No;
import me.dio.web.estruturaDeDados.noGenereico.NoDuplo;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return tamanhoLista == 0;
    }

    private No<T> getNo(int index) {
        checkEmptyList();

        if (index == 0) {
            return cauda;
        }
        No<T> aux = cauda;
        for (int i = 0; (i < index); i++) {
            aux = aux.getRefNo();
        }
        return aux;
    }

    public void remove(int index) {
        checkEmptyList();
        No<T> aux = cauda;
        if (index == 0) {
            this.cabeca.setRefNo(this.cauda.getRefNo());
            this.cauda = this.cauda.getRefNo();
        } else if (index == tamanhoLista - 1) {
            while (aux.getRefNo() != cauda) {
                aux = aux.getRefNo();
            }
            aux.setRefNo(cauda);
        } else {
            for (int i = 0; i < index - 1; i++) {
                aux = aux.getRefNo();
            }
            aux.setRefNo(aux.getRefNo().getRefNo());
        }
        tamanhoLista--;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (isEmpty()){
            cauda = novoNo;
            cabeca = novoNo;
            cabeca.setRefNo(cauda);
        } else {
            novoNo.setRefNo(cauda);
            cabeca.setRefNo(novoNo);
            cauda = novoNo;
        }
        tamanhoLista++;
    }

    private void checkEmptyList() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        No<T> aux = cauda;

        for (int i=0 ;i< tamanhoLista;i++){
            retorno.append("conteudo: ").append(aux.getDado());
            if (i != tamanhoLista - 1){
                retorno.append(" -> ");
            }
            aux = aux.getRefNo();
        }

        return retorno.toString();
    }

}
