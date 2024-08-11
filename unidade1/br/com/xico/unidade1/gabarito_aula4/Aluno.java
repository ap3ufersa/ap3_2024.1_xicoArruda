package br.com.xico.unidade1.gabarito_aula4;

import java.time.LocalDate;

/**
 * Codigo Secreto = 541651651
 * Representa um aluno com as informações: nome completo, 3 notas, data de
 * nascimento, data de cadastro.
 * 
 * @author Xico
 * @since 09/08/2024
 * 
 */

public class Aluno {

    long matricula = -1;
    String nomeCompleto = "SemNome";
    // As notas seriam do aluno ou da disciplina?
    double nota1 = -1;
    double nota2 = -1;
    double nota3 = -1;
    boolean aprovadoMedia = false;
    String nomeDaMae = "SemNomeDaMae";
    LocalDate dataNascimento = null;
    LocalDate dataCadastro = LocalDate.now();

    public String getNomeMaisculo() {
        return nomeCompleto.toUpperCase();
    }

    public String getNomeMinusculo() {
        return nomeCompleto.toLowerCase();
    }

    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprovadoMedia() {
        if (getMedia() >= 7.0)
            return true;
        return false;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public boolean isAprovadoMedia() {
        return aprovadoMedia;
    }

    public void setAprovadoMedia(boolean aprovadoMedia) {
        this.aprovadoMedia = aprovadoMedia;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nomeCompleto=" + nomeCompleto + ", nota1=" + nota1 + ", nota2="
                + nota2 + ", nota3=" + nota3 + ", aprovadoMedia=" + aprovadoMedia + ", nomeDaMae=" + nomeDaMae
                + ", dataNascimento=" + dataNascimento + ", dataCadastro=" + dataCadastro + "]";
    }

}
