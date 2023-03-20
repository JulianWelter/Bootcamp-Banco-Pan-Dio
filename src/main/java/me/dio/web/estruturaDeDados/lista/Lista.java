package me.dio.web.estruturaDeDados.lista;

import me.dio.web.estruturaDeDados.noGenereico.No;

public class Lista<T> {

    private No<T> refNoEntrada;
    private int size = 0;

    public int size() {
        return size;
    }

    public Lista() {
        refNoEntrada = null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null;
    }

    public boolean isNotEmpty() {
        return refNoEntrada != null;
    }

    public void enqueue(No<T> novoNo) {
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public void enqueue(T dado) {
        size++;
        No<T> novoNo = new No<T>(dado);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public No<T> dequeue() {
        if (isEmpty()) return null;
//        No<T> ultimo = refNoEntrada;
//        while (isNotEmpty() && ultimo.getRefNo() != null) {
//            No<T> penultimo = ultimo;
//            ultimo = ultimo.getRefNo();
//            if (ultimo.getRefNo() == null) {
//                penultimo.setRefNo(null);
//                return ultimo;
//            }
//        }
//        if (ultimo.getRefNo() == null) {
//            refNoEntrada = null;
//        }
//        if(size > 0) size--;
//        return ultimo;
        No<T> ultimo = refNoEntrada;
        while (ultimo.getRefNo() != null) {
            No<T> penultimo = ultimo;
            ultimo = ultimo.getRefNo();
            size--;
            if (ultimo.getRefNo() == null) {
                penultimo.setRefNo(null);
                return ultimo;
            }
        }
        size--;
        refNoEntrada = null;
        return ultimo;
    }

    public No<T> first() {
        No<T> ultimo = refNoEntrada;
        while (isNotEmpty() && ultimo.getRefNo() != null) {
            ultimo = ultimo.getRefNo();
        }
        return ultimo;
    }

}
