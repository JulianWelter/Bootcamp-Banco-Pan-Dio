package me.dio.web.fila;

import me.dio.web.noGenereico.No;

public class Fila<T> {

    private No<T> refNoEntrada;

    public Fila() {
        refNoEntrada = null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null;
    }

    public void enqueue(No<T> novoNo) {
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public void enqueue(T dado) {
        No<T> novoNo = new No<T>(dado);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public No<T> dequeue(){
        No<T> ultimo = refNoEntrada;
        while (!isEmpty() && ultimo.getRefNo() != null) {
            No<T> penultimo = ultimo;
            ultimo = ultimo.getRefNo();
            if(ultimo.getRefNo() == null){
                penultimo.setRefNo(null);
                return ultimo;
            }
        }
        if (ultimo.getRefNo() == null)
            refNoEntrada= null;
        return ultimo;
    }

    public No<T> first(){
        No<T> ultimo = refNoEntrada;
        while (!isEmpty() && ultimo.getRefNo() != null) {
            ultimo = ultimo.getRefNo();
        }
        return ultimo;
    }

}
