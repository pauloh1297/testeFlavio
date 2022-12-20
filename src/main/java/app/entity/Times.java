
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela TIMES
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TIMES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Times")
public class Times implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "Arsenal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String arsenal;


    /**
    * @generated
    */
    @Column(name = "machesterCity", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String machesterCity;


    /**
    * @generated
    */
    @Column(name = "machesterUnited", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String machesterUnited;


    /**
    * @generated
    */
    @Column(name = "Flamengo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String flamengo;


    /**
    * @generated
    */
    @Column(name = "Chelsea", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String chelsea;


    /**
    * @generated
    */
    @Column(name = "Psg", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String psg;


    /**
    * @generated
    */
    @Column(name = "realMadrid", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String realMadrid;


    /**
    * Construtor
    * @generated
    */
    public Times(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Times setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém arsenal
    * return arsenal
    * @generated
    */
    public java.lang.String getArsenal() {
        return this.arsenal;
    }

    /**
    * Define arsenal
    * @param arsenal arsenal
    * @generated
    */
    public Times setArsenal(java.lang.String arsenal) {
        this.arsenal = arsenal;
        return this;
    }
    /**
    * Obtém machesterCity
    * return machesterCity
    * @generated
    */
    public java.lang.String getMachesterCity() {
        return this.machesterCity;
    }

    /**
    * Define machesterCity
    * @param machesterCity machesterCity
    * @generated
    */
    public Times setMachesterCity(java.lang.String machesterCity) {
        this.machesterCity = machesterCity;
        return this;
    }
    /**
    * Obtém machesterUnited
    * return machesterUnited
    * @generated
    */
    public java.lang.String getMachesterUnited() {
        return this.machesterUnited;
    }

    /**
    * Define machesterUnited
    * @param machesterUnited machesterUnited
    * @generated
    */
    public Times setMachesterUnited(java.lang.String machesterUnited) {
        this.machesterUnited = machesterUnited;
        return this;
    }
    /**
    * Obtém flamengo
    * return flamengo
    * @generated
    */
    public java.lang.String getFlamengo() {
        return this.flamengo;
    }

    /**
    * Define flamengo
    * @param flamengo flamengo
    * @generated
    */
    public Times setFlamengo(java.lang.String flamengo) {
        this.flamengo = flamengo;
        return this;
    }
    /**
    * Obtém chelsea
    * return chelsea
    * @generated
    */
    public java.lang.String getChelsea() {
        return this.chelsea;
    }

    /**
    * Define chelsea
    * @param chelsea chelsea
    * @generated
    */
    public Times setChelsea(java.lang.String chelsea) {
        this.chelsea = chelsea;
        return this;
    }
    /**
    * Obtém psg
    * return psg
    * @generated
    */
    public java.lang.String getPsg() {
        return this.psg;
    }

    /**
    * Define psg
    * @param psg psg
    * @generated
    */
    public Times setPsg(java.lang.String psg) {
        this.psg = psg;
        return this;
    }
    /**
    * Obtém realMadrid
    * return realMadrid
    * @generated
    */
    public java.lang.String getRealMadrid() {
        return this.realMadrid;
    }

    /**
    * Define realMadrid
    * @param realMadrid realMadrid
    * @generated
    */
    public Times setRealMadrid(java.lang.String realMadrid) {
        this.realMadrid = realMadrid;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Times object = (Times)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}