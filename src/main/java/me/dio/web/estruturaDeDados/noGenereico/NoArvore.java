package me.dio.web.estruturaDeDados.noGenereico;

public class NoArvore<T extends Comparable<T>> {

    private T conteudo;
    private NoArvore<T> noEsquerdo;
    private NoArvore<T> noDireito;

    public NoArvore() {
    }

    public NoArvore(T conteudo) {
        this.conteudo = conteudo;
        this.noEsquerdo = null;
        this.noDireito = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvore<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoArvore<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoArvore<T> getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(NoArvore<T> noDireito) {
        this.noDireito = noDireito;
    }

    @Override
    public String toString() {
        return "NoArvore{" +
                "conteudo=" + conteudo +
                '}';
    }

}
