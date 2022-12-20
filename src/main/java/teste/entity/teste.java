
package teste.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela TESTE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("teste.entity.teste")
public class teste implements Serializable {
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
    @Column(name = "testenome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String testenome;


    /**
    * Construtor
    * @generated
    */
    public teste(){
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
    public teste setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém testenome
    * return testenome
    * @generated
    */
    public java.lang.String getTestenome() {
        return this.testenome;
    }

    /**
    * Define testenome
    * @param testenome testenome
    * @generated
    */
    public teste setTestenome(java.lang.String testenome) {
        this.testenome = testenome;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
teste object = (teste)obj;
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