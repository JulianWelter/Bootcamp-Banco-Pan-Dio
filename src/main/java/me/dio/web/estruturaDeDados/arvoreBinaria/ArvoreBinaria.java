package me.dio.web.estruturaDeDados.arvoreBinaria;

import me.dio.web.estruturaDeDados.noGenereico.NoArvore;

public class ArvoreBinaria<T extends Comparable<T>> {

    private NoArvore<T> raiz;

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        NoArvore<T> novoNo = new NoArvore<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoArvore<T> inserir(NoArvore<T> atual, NoArvore<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsquerdo(inserir(atual.getNoEsquerdo(), novoNo));
        } else {
            atual.setNoDireito(inserir(atual.getNoDireito(), novoNo));
        }
        return atual;
    }

    public void exibirInOrden() {
        NoArvore<T> no = raiz;
        exibirInOrden(raiz);
    }

    private void exibirInOrden(NoArvore<T> no) {
        if (no != null) {
            exibirInOrden(no.getNoEsquerdo());
            System.out.println(no.getConteudo());
            exibirInOrden(no.getNoDireito());
        }
    }

    public void exibirPreOrden() {
        NoArvore<T> no = raiz;
        exibirPreOrden(raiz);
    }

    private void exibirPreOrden(NoArvore<T> no) {
        if (no != null) {
            System.out.println(no.getConteudo());
            exibirPreOrden(no.getNoEsquerdo());
            exibirPreOrden(no.getNoDireito());
        }
    }

    public void exibirPosOrden() {
        NoArvore<T> no = raiz;
        exibirPosOrden(raiz);
    }

    private void exibirPosOrden(NoArvore<T> no) {
        if (no != null) {
            exibirPosOrden(no.getNoEsquerdo());
            exibirPosOrden(no.getNoDireito());
            System.out.println(no.getConteudo());
        }
    }

}
