package model;

//Date é um tipo de dado q não é nativo, por isso preciso importar esse
//pacote pra poder utilizar uma classe que representa uma data.
import java.util.Date;


public class Project {
    //1-Criei um atributo na minha classe pra cada atributo que tenho no BD
    private int id;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    
    //2-Gero o construtor Alt + Insert
    public Project(int id, String name, String description, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Project(){
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
    
    //3-Gero os métodos acessores (getter e setter) com Alt + Insert
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    //4-Gero mais um método, o toString() com Alt + Insert
    @Override
    public String toString() {
        return this.name;
    }
    
        
}
