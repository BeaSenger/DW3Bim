/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Asus
 */
@Embeddable
public class TurmaTeoricaHasAlunoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "turma_teorica_codigo_turma")
    private int turmaTeoricaCodigoTurma;
    @Basic(optional = false)
    @Column(name = "aluno_cpf_aluno")
    private String alunoCpfAluno;

    public TurmaTeoricaHasAlunoPK() {
    }

    public TurmaTeoricaHasAlunoPK(int turmaTeoricaCodigoTurma, String alunoCpfAluno) {
        this.turmaTeoricaCodigoTurma = turmaTeoricaCodigoTurma;
        this.alunoCpfAluno = alunoCpfAluno;
    }

    public int getTurmaTeoricaCodigoTurma() {
        return turmaTeoricaCodigoTurma;
    }

    public void setTurmaTeoricaCodigoTurma(int turmaTeoricaCodigoTurma) {
        this.turmaTeoricaCodigoTurma = turmaTeoricaCodigoTurma;
    }

    public String getAlunoCpfAluno() {
        return alunoCpfAluno;
    }

    public void setAlunoCpfAluno(String alunoCpfAluno) {
        this.alunoCpfAluno = alunoCpfAluno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) turmaTeoricaCodigoTurma;
        hash += (alunoCpfAluno != null ? alunoCpfAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurmaTeoricaHasAlunoPK)) {
            return false;
        }
        TurmaTeoricaHasAlunoPK other = (TurmaTeoricaHasAlunoPK) object;
        if (this.turmaTeoricaCodigoTurma != other.turmaTeoricaCodigoTurma) {
            return false;
        }
        if ((this.alunoCpfAluno == null && other.alunoCpfAluno != null) || (this.alunoCpfAluno != null && !this.alunoCpfAluno.equals(other.alunoCpfAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TurmaTeoricaHasAlunoPK[ turmaTeoricaCodigoTurma=" + turmaTeoricaCodigoTurma + ", alunoCpfAluno=" + alunoCpfAluno + " ]";
    }
    
}
