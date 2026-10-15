package br.com.senai.teste.dto;

import jakarta.validation.constraints.NotNull;

public class EmprestimoRequest {

    @NotNull (message = "O ID do aluno é obrigatório")
    private Integer alunoId;

    @NotNull(message = "O ID do livro é obrigatório")
    private Integer livroId;

    public EmprestimoRequest() {
    }

    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public Integer getLivroId() {
        return livroId;
    }

    public void setLivroId(Integer livroId) {
        this.livroId = livroId;
    }

}