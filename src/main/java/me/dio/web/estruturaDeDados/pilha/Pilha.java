package me.dio.web.estruturaDeDados.pilha;

import me.dio.web.estruturaDeDados.noGenereico.No;

public class Pilha<T> {

    private No<T> referenciaEntradaPilha;

    public No<T> top(){
        return  referenciaEntradaPilha;
    }

    public No<T> pop() {
        if(!isEmpty()) {
            No<T> noPopped = referenciaEntradaPilha;
            referenciaEntradaPilha = referenciaEntradaPilha.getRefNo();
            return noPopped;
        }
        return null;
    }

    public void push(No<T> novoNo) {
        No<T> aux = referenciaEntradaPilha;
        referenciaEntradaPilha = novoNo;
        referenciaEntradaPilha.setRefNo(aux);
    }

    public Pilha() {
        referenciaEntradaPilha = null;
    }

    public boolean isEmpty(){
        return referenciaEntradaPilha == null;
    }

}
