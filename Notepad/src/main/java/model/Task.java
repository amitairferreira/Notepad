package model;

//Date é um tipo de dado q não é nativo, por isso preciso importar esse
//pacote pra poder utilizar uma classe que representa uma data.
import java.util.Date;

public class Task {
   //1-Criei um atributo na minha classe pra cada atributo que tenho no BD 
   private int id;
   private int idProject;
   private String name;
   private String description;
   private String notes;
   private boolean isCompleted;
   private Date deadline;
   private Date createdAt;
   private Date updatedAt;
   
   //2-Gero o construtor Alt + Insert
    public Task(int id, int idProject, String name, String description, 
            String notes, boolean isCompleted, Date deadline, Date createdAt, Date updatedAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.isCompleted = isCompleted;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    //5-crio outro constutor
    public Task() {
        this.isCompleted = false;
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

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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
    //Retorna uma string com o nome da classe e o nome do atributo e o valor que
    //está armazenado naquele atributo.
    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", "
             + "description=" + description + ", notes=" + notes + ", isCompleted=" + isCompleted + ", "
             + "deadline=" + deadline + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
   
    
}
