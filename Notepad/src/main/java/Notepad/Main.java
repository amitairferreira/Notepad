
package Notepad;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;


public class Main {

    public static void main(String[] args) {
        
        
        //ProjectController projectController = new ProjectController();
        //testando save do project 
         Date data = new Date();
         
         //Project project = new Project();
         //project.setName("Para testar tarefas");
         //project.setDescription("testando");
         //project.setCreatedAt(data);
         //project.setUpdatedAt(data);
         //projectController.save(project);
        
         //testando update do project
         //Project project = new Project();
         //project.setId(1);
         //project.setName("Novo nome do projeto");
         //project.setDescription("description");
         //project.setUpdatedAt(data);
         //projectController.update(project);
        
         //testanto getAll do project
        //List<Project> projects = projectController.getAll();
        //System.out.println("Total de projetos = " + projects.size());
        
        //testando delete do project
        //projectController.removeById(1);
        
        //testando save da task
           TaskController taskController = new TaskController();
           Task task = new Task();
           task.setIdProject(2);
           task.setName("Criar telas de aplicação");
           task.setDescription("Devem ser criadas telas de cadastro");
           task.setNotes("Sem notas");
           task.setIsCompleted(false);
           task.setDeadline(new Date());
           task.setCreatedAt(data);
           task.setUpdatedAt(data);
           taskController.save(task);
        
    }
    
}
