
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
* Classe que representa a tabela CAMISAS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CAMISAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Camisas")
public class Camisas implements Serializable {
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
    @Column(name = "nomeTime", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeTime;


    /**
    * @generated
    */
    @Column(name = "tamanho", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tamanho;


    /**
    * @generated
    */
    @Column(name = "marca", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String marca;


    /**
    * @generated
    */
    @Column(name = "preco", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double preco;


    /**
    * @generated
    */
    @Column(name = "material", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String material;


    /**
    * @generated
    */
    @Column(name = "teste01", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String teste01;


    /**
    * @generated
    */
    @Column(name = "teste02", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String teste02;


    /**
    * @generated
    */
    @Column(name = "teste03", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String teste03;


    /**
    * @generated
    */
    @Column(name = "teste04", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String teste04;


    /**
    * @generated
    */
    @Column(name = "teste05", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String teste05;


    /**
    * Construtor
    * @generated
    */
    public Camisas(){
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
    public Camisas setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nomeTime
    * return nomeTime
    * @generated
    */
    public java.lang.String getNomeTime() {
        return this.nomeTime;
    }

    /**
    * Define nomeTime
    * @param nomeTime nomeTime
    * @generated
    */
    public Camisas setNomeTime(java.lang.String nomeTime) {
        this.nomeTime = nomeTime;
        return this;
    }
    /**
    * Obtém tamanho
    * return tamanho
    * @generated
    */
    public java.lang.String getTamanho() {
        return this.tamanho;
    }

    /**
    * Define tamanho
    * @param tamanho tamanho
    * @generated
    */
    public Camisas setTamanho(java.lang.String tamanho) {
        this.tamanho = tamanho;
        return this;
    }
    /**
    * Obtém marca
    * return marca
    * @generated
    */
    public java.lang.String getMarca() {
        return this.marca;
    }

    /**
    * Define marca
    * @param marca marca
    * @generated
    */
    public Camisas setMarca(java.lang.String marca) {
        this.marca = marca;
        return this;
    }
    /**
    * Obtém preco
    * return preco
    * @generated
    */
    public java.lang.Double getPreco() {
        return this.preco;
    }

    /**
    * Define preco
    * @param preco preco
    * @generated
    */
    public Camisas setPreco(java.lang.Double preco) {
        this.preco = preco;
        return this;
    }
    /**
    * Obtém material
    * return material
    * @generated
    */
    public java.lang.String getMaterial() {
        return this.material;
    }

    /**
    * Define material
    * @param material material
    * @generated
    */
    public Camisas setMaterial(java.lang.String material) {
        this.material = material;
        return this;
    }
    /**
    * Obtém teste01
    * return teste01
    * @generated
    */
    public java.lang.String getTeste01() {
        return this.teste01;
    }

    /**
    * Define teste01
    * @param teste01 teste01
    * @generated
    */
    public Camisas setTeste01(java.lang.String teste01) {
        this.teste01 = teste01;
        return this;
    }
    /**
    * Obtém teste02
    * return teste02
    * @generated
    */
    public java.lang.String getTeste02() {
        return this.teste02;
    }

    /**
    * Define teste02
    * @param teste02 teste02
    * @generated
    */
    public Camisas setTeste02(java.lang.String teste02) {
        this.teste02 = teste02;
        return this;
    }
    /**
    * Obtém teste03
    * return teste03
    * @generated
    */
    public java.lang.String getTeste03() {
        return this.teste03;
    }

    /**
    * Define teste03
    * @param teste03 teste03
    * @generated
    */
    public Camisas setTeste03(java.lang.String teste03) {
        this.teste03 = teste03;
        return this;
    }
    /**
    * Obtém teste04
    * return teste04
    * @generated
    */
    public java.lang.String getTeste04() {
        return this.teste04;
    }

    /**
    * Define teste04
    * @param teste04 teste04
    * @generated
    */
    public Camisas setTeste04(java.lang.String teste04) {
        this.teste04 = teste04;
        return this;
    }
    /**
    * Obtém teste05
    * return teste05
    * @generated
    */
    public java.lang.String getTeste05() {
        return this.teste05;
    }

    /**
    * Define teste05
    * @param teste05 teste05
    * @generated
    */
    public Camisas setTeste05(java.lang.String teste05) {
        this.teste05 = teste05;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Camisas object = (Camisas)obj;
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