/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "turma_teorica_has_aluno")
@NamedQueries({
    @NamedQuery(name = "TurmaTeoricaHasAluno.findAll", query = "SELECT t FROM TurmaTeoricaHasAluno t")})
public class TurmaTeoricaHasAluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TurmaTeoricaHasAlunoPK turmaTeoricaHasAlunoPK;
    @Column(name = "data_aula")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAula;
    @Column(name = "compareceu")
    private Boolean compareceu;
    @JoinColumn(name = "aluno_cpf_aluno", referencedColumnName = "cpf_aluno", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Aluno aluno;
    @JoinColumn(name = "turma_teorica_codigo_turma", referencedColumnName = "codigo_turma", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TurmaTeorica turmaTeorica;

    public TurmaTeoricaHasAluno() {
    }

    public TurmaTeoricaHasAluno(TurmaTeoricaHasAlunoPK turmaTeoricaHasAlunoPK) {
        this.turmaTeoricaHasAlunoPK = turmaTeoricaHasAlunoPK;
    }

    public TurmaTeoricaHasAluno(int turmaTeoricaCodigoTurma, String alunoCpfAluno) {
        this.turmaTeoricaHasAlunoPK = new TurmaTeoricaHasAlunoPK(turmaTeoricaCodigoTurma, alunoCpfAluno);
    }

    public TurmaTeoricaHasAlunoPK getTurmaTeoricaHasAlunoPK() {
        return turmaTeoricaHasAlunoPK;
    }

    public void setTurmaTeoricaHasAlunoPK(TurmaTeoricaHasAlunoPK turmaTeoricaHasAlunoPK) {
        this.turmaTeoricaHasAlunoPK = turmaTeoricaHasAlunoPK;
    }

    public Date getDataAula() {
        return dataAula;
    }

    public void setDataAula(Date dataAula) {
        this.dataAula = dataAula;
    }

    public Boolean getCompareceu() {
        return compareceu;
    }

    public void setCompareceu(Boolean compareceu) {
        this.compareceu = compareceu;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public TurmaTeorica getTurmaTeorica() {
        return turmaTeorica;
    }

    public void setTurmaTeorica(TurmaTeorica turmaTeorica) {
        this.turmaTeorica = turmaTeorica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turmaTeoricaHasAlunoPK != null ? turmaTeoricaHasAlunoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurmaTeoricaHasAluno)) {
            return false;
        }
        TurmaTeoricaHasAluno other = (TurmaTeoricaHasAluno) object;
        if ((this.turmaTeoricaHasAlunoPK == null && other.turmaTeoricaHasAlunoPK != null) || (this.turmaTeoricaHasAlunoPK != null && !this.turmaTeoricaHasAlunoPK.equals(other.turmaTeoricaHasAlunoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TurmaTeoricaHasAluno[ turmaTeoricaHasAlunoPK=" + turmaTeoricaHasAlunoPK + " ]";
    }
    
}
