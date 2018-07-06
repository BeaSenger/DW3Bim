/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author radames
 */
@Entity
@Table(name = "tipo_carteira")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoCarteira.findAll", query = "SELECT t FROM TipoCarteira t")
    , @NamedQuery(name = "TipoCarteira.findByIdTipoCarteira", query = "SELECT t FROM TipoCarteira t WHERE t.idTipoCarteira = :idTipoCarteira")
    , @NamedQuery(name = "TipoCarteira.findByNomeTipoCarteira", query = "SELECT t FROM TipoCarteira t WHERE t.nomeTipoCarteira = :nomeTipoCarteira")})
public class TipoCarteira implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_carteira")
    private Integer idTipoCarteira;
    @Basic(optional = false)
    @Column(name = "nome_tipo_carteira")
    private String nomeTipoCarteira;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoCarteiraIdTipoCarteira")
    private List<Aluno> alunoList;

    public TipoCarteira() {
    }

    public TipoCarteira(Integer idTipoCarteira) {
        this.idTipoCarteira = idTipoCarteira;
    }

    public TipoCarteira(Integer idTipoCarteira, String nomeTipoCarteira) {
        this.idTipoCarteira = idTipoCarteira;
        this.nomeTipoCarteira = nomeTipoCarteira;
    }

    public Integer getIdTipoCarteira() {
        return idTipoCarteira;
    }

    public void setIdTipoCarteira(Integer idTipoCarteira) {
        this.idTipoCarteira = idTipoCarteira;
    }

    public String getNomeTipoCarteira() {
        return nomeTipoCarteira;
    }

    public void setNomeTipoCarteira(String nomeTipoCarteira) {
        this.nomeTipoCarteira = nomeTipoCarteira;
    }

    @XmlTransient
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoCarteira != null ? idTipoCarteira.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCarteira)) {
            return false;
        }
        TipoCarteira other = (TipoCarteira) object;
        if ((this.idTipoCarteira == null && other.idTipoCarteira != null) || (this.idTipoCarteira != null && !this.idTipoCarteira.equals(other.idTipoCarteira))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TipoCarteira[ idTipoCarteira=" + idTipoCarteira + " ]";
    }
    
}
