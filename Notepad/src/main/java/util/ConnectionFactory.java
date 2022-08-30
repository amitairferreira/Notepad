//Essa classe vai ser respons�vel por criar uma conex�o com o banco de dados e 
//devolver pra alguma parte do c�digo onde a gente precise fazer uma consulta
//no BD, uma inser��o no BD, apagar alguma coisa do BD

//Pra fazer essa conex�o,� preciso estipular alguns par�metros (0)

//O jdbc � uma dep�ncia que vamos usar, mas n�o vem no conjunto de dependecias
//do java. Por isso preciso dizer ao meu projeto que ele vai usar essa depend�-
//cia. Como fa�o isso? 

package util;

//6- imposts necess�rios para essa impelementa��o de conex�o com BD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {
    //1-estipular qual vai ser o drive de conex�o:
    //crio a var DRIVE, especificando que vou usar O BD mysql e jdbc � o drive.
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    //2-O caminho de conex�o at� ao meu BD,onde ele est�.
    //se inves de local, nosso BD estivesse no servidor, inv�s de localhost
    //seria um endere�o de IP. Ex: "jdbc:mysql://192.16.85.96"
    //a porta do localhost vai ser a que aparece no XAMPP
    public static final String URL = "jdbc:mysql://localhost:3306/notepad";
    //3-Digo qual � o user do meu BD, root � padr�o do sql, mas posso mudar.
    public static final String USER = "root";
    //4-Senha vaiza tamb por padr�o e tamb posso mudar l�
    public static final String PASS = "";
    
    //5-Crio os m�todos
    //estatico pq n preciso criar um objt pra chamar esse m�todo
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS); 
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conex�o com banco de dados", ex);
        }
    }
    
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar conex�o com banco de dados");
        }
    
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement) {
        try {
            if (connection != null) {
                connection.close();
            }
            
            if(statement != null) {
                statement.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar conex�o com banco de dados");
        }
    
    }
    
    public static void closeConnection(Connection connection,
            PreparedStatement statement, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            
            if(statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar conex�o com banco de dados");
        }
    
    }
         
}
