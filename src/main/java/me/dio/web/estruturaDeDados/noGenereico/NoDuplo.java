package me.dio.web.estruturaDeDados.noGenereico;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noEsquerdo;
    private NoDuplo<T> noDireito;

    public NoDuplo(T conteudo) {
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

    public NoDuplo<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoDuplo<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoDuplo<T> getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(NoDuplo<T> noDireito) {
        this.noDireito = noDireito;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
