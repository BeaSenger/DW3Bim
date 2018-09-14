/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author radames
 */
@Entity
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a")
    , @NamedQuery(name = "Aluno.findByCpfAluno", query = "SELECT a FROM Aluno a WHERE a.cpfAluno = :cpfAluno")
    , @NamedQuery(name = "Aluno.findByNomeAluno", query = "SELECT a FROM Aluno a WHERE a.nomeAluno = :nomeAluno")
    , @NamedQuery(name = "Aluno.findByDataNascimento", query = "SELECT a FROM Aluno a WHERE a.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "Aluno.findByRgAluno", query = "SELECT a FROM Aluno a WHERE a.rgAluno = :rgAluno")
    , @NamedQuery(name = "Aluno.findByRgEmissorAluno", query = "SELECT a FROM Aluno a WHERE a.rgEmissorAluno = :rgEmissorAluno")
    , @NamedQuery(name = "Aluno.findByEnderecoAluno", query = "SELECT a FROM Aluno a WHERE a.enderecoAluno = :enderecoAluno")
    , @NamedQuery(name = "Aluno.findByCidadeAluno", query = "SELECT a FROM Aluno a WHERE a.cidadeAluno = :cidadeAluno")
    , @NamedQuery(name = "Aluno.findByBairroAluno", query = "SELECT a FROM Aluno a WHERE a.bairroAluno = :bairroAluno")
    , @NamedQuery(name = "Aluno.findByCepTipoCarteira", query = "SELECT a FROM Aluno a WHERE a.cepTipoCarteira = :cepTipoCarteira")
    , @NamedQuery(name = "Aluno.findByTelefoneAluno", query = "SELECT a FROM Aluno a WHERE a.telefoneAluno = :telefoneAluno")
    , @NamedQuery(name = "Aluno.findByCelularAluno", query = "SELECT a FROM Aluno a WHERE a.celularAluno = :celularAluno")})
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf_aluno")
    private String cpfAluno;
    @Basic(optional = false)
    @Column(name = "nome_aluno")
    private String nomeAluno;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    @Column(name = "rg_aluno")
    private String rgAluno;
    @Column(name = "rg_emissor_aluno")
    private String rgEmissorAluno;
    @Column(name = "endereco_aluno")
    private String enderecoAluno;
    @Column(name = "cidade_aluno")
    private String cidadeAluno;
    @Column(name = "bairro_aluno")
    private String bairroAluno;
    @Column(name = "cep_tipo_carteira")
    private String cepTipoCarteira;
    @Column(name = "telefone_aluno")
    private String telefoneAluno;
    @Column(name = "celular_aluno")
    private String celularAluno;
    @JoinColumn(name = "tipo_carteira_id_tipo_carteira", referencedColumnName = "id_tipo_carteira")
    @ManyToOne(optional = false)
    private TipoCarteira tipoCarteiraIdTipoCarteira;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
    private List<AulaPratica> aulaPraticaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
    private List<TurmaTeoricaHasAluno> turmaTeoricaHasAlunoList;

    public Aluno() {
    }

    public Aluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public Aluno(String cpfAluno, String nomeAluno) {
        this.cpfAluno = cpfAluno;
        this.nomeAluno = nomeAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRgAluno() {
        return rgAluno;
    }

    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    public String getRgEmissorAluno() {
        return rgEmissorAluno;
    }

    public void setRgEmissorAluno(String rgEmissorAluno) {
        this.rgEmissorAluno = rgEmissorAluno;
    }

    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public String getCidadeAluno() {
        return cidadeAluno;
    }

    public void setCidadeAluno(String cidadeAluno) {
        this.cidadeAluno = cidadeAluno;
    }

    public String getBairroAluno() {
        return bairroAluno;
    }

    public void setBairroAluno(String bairroAluno) {
        this.bairroAluno = bairroAluno;
    }

    public String getCepTipoCarteira() {
        return cepTipoCarteira;
    }

    public void setCepTipoCarteira(String cepTipoCarteira) {
        this.cepTipoCarteira = cepTipoCarteira;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public String getCelularAluno() {
        return celularAluno;
    }

    public void setCelularAluno(String celularAluno) {
        this.celularAluno = celularAluno;
    }

    public TipoCarteira getTipoCarteiraIdTipoCarteira() {
        return tipoCarteiraIdTipoCarteira;
    }

    public void setTipoCarteiraIdTipoCarteira(TipoCarteira tipoCarteiraIdTipoCarteira) {
        this.tipoCarteiraIdTipoCarteira = tipoCarteiraIdTipoCarteira;
    }

    @XmlTransient
    public List<AulaPratica> getAulaPraticaList() {
        return aulaPraticaList;
    }

    public void setAulaPraticaList(List<AulaPratica> aulaPraticaList) {
        this.aulaPraticaList = aulaPraticaList;
    }

    @XmlTransient
    public List<TurmaTeoricaHasAluno> getTurmaTeoricaHasAlunoList() {
        return turmaTeoricaHasAlunoList;
    }

    public void setTurmaTeoricaHasAlunoList(List<TurmaTeoricaHasAluno> turmaTeoricaHasAlunoList) {
        this.turmaTeoricaHasAlunoList = turmaTeoricaHasAlunoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpfAluno != null ? cpfAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.cpfAluno == null && other.cpfAluno != null) || (this.cpfAluno != null && !this.cpfAluno.equals(other.cpfAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Aluno[ cpfAluno=" + cpfAluno + " ]";
    }

}
