/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC07
 */
@Entity
@Table(name = "JUGADORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugadores.findAll", query = "SELECT j FROM Jugadores j")
    , @NamedQuery(name = "Jugadores.findById", query = "SELECT j FROM Jugadores j WHERE j.id = :id")
    , @NamedQuery(name = "Jugadores.findByC\u00f3digo", query = "SELECT j FROM Jugadores j WHERE j.c\u00f3digo = :c\u00f3digo")
    , @NamedQuery(name = "Jugadores.findByNombre", query = "SELECT j FROM Jugadores j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Jugadores.findByApellidos", query = "SELECT j FROM Jugadores j WHERE j.apellidos = :apellidos")
    , @NamedQuery(name = "Jugadores.findByTelefono", query = "SELECT j FROM Jugadores j WHERE j.telefono = :telefono")
    , @NamedQuery(name = "Jugadores.findByEmail", query = "SELECT j FROM Jugadores j WHERE j.email = :email")
    , @NamedQuery(name = "Jugadores.findByFechaNacimiento", query = "SELECT j FROM Jugadores j WHERE j.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Jugadores.findByPa\u00eds", query = "SELECT j FROM Jugadores j WHERE j.pa\u00eds = :pa\u00eds")
    , @NamedQuery(name = "Jugadores.findByElo", query = "SELECT j FROM Jugadores j WHERE j.elo = :elo")
    , @NamedQuery(name = "Jugadores.findByFoto", query = "SELECT j FROM Jugadores j WHERE j.foto = :foto")
    , @NamedQuery(name = "Jugadores.findByCampeon", query = "SELECT j FROM Jugadores j WHERE j.campeon = :campeon")
    , @NamedQuery(name = "Jugadores.findBySubcampeon", query = "SELECT j FROM Jugadores j WHERE j.subcampeon = :subcampeon")})
public class Jugadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "C\u00d3DIGO")
    private String código;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "PA\u00cdS")
    private String país;
    @Column(name = "ELO")
    private Short elo;
    @Column(name = "FOTO")
    private String foto;
    @Column(name = "CAMPEON")
    private Boolean campeon;
    @Column(name = "SUBCAMPEON")
    private Boolean subcampeon;
    @JoinColumn(name = "TORNEO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Torneo torneo;

    public Jugadores() {
    }

    public Jugadores(Integer id) {
        this.id = id;
    }

    public Jugadores(Integer id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public Short getElo() {
        return elo;
    }

    public void setElo(Short elo) {
        this.elo = elo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Boolean getCampeon() {
        return campeon;
    }

    public void setCampeon(Boolean campeon) {
        this.campeon = campeon;
    }

    public Boolean getSubcampeon() {
        return subcampeon;
    }

    public void setSubcampeon(Boolean subcampeon) {
        this.subcampeon = subcampeon;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugadores)) {
            return false;
        }
        Jugadores other = (Jugadores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ajedrez.Jugadores[ id=" + id + " ]";
    }
    
}
