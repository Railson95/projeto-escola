package br.com.martins.railson.avaliacao;

public class Avaliacao {
    private float nota1;
    private float nota2;
    private float notaProvaFinal;
    private int frequencia;

    public Avaliacao(float nota1, float nota2, float notaProvaFinal, int frequencia) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaProvaFinal = notaProvaFinal;
        this.frequencia = frequencia;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

   public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaProvaFinal() {
        return notaProvaFinal;
    }

    public void setNotaProvaFinal(float notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public void lancarAvaliacao(){

    }

    public void calcularAprovacao(){

    }
}










