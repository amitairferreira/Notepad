//Essa classe vai ser responsável por criar uma conexão com o banco de dados e 
//devolver pra alguma parte do código onde a gente precise fazer uma consulta
//no BD, uma inserção no BD, apagar alguma coisa do BD

//Pra fazer essa conexão,é preciso estipular alguns parâmetros (0)

//O jdbc é uma depência que vamos usar, mas não vem no conjunto de dependecias
//do java. Por isso preciso dizer ao meu projeto que ele vai usar essa dependê-
//cia. Como faço isso? 

package util;

//6- imposts necessários para essa impelementação de conexão com BD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {
    //1-estipular qual vai ser o drive de conexão:
    //crio a var DRIVE, especificando que vou usar O BD mysql e jdbc é o drive.
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    //2-O caminho de conexão até ao meu BD,onde ele está.
    //se inves de local, nosso BD estivesse no servidor, invés de localhost
    //seria um endereço de IP. Ex: "jdbc:mysql://192.16.85.96"
    //a porta do localhost vai ser a que aparece no XAMPP
    public static final String URL = "jdbc:mysql://localhost:3306/notepad";
    //3-Digo qual é o user do meu BD, root é padrão do sql, mas posso mudar.
    public static final String USER = "root";
    //4-Senha vaiza tamb por padrão e tamb posso mudar lá
    public static final String PASS = "";
    
    //5-Crio os métodos
    //estatico pq n preciso criar um objt pra chamar esse método
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS); 
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conexão com banco de dados", ex);
        }
    }
    
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar conexão com banco de dados");
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
            throw new RuntimeException("Erro ao fechar conexão com banco de dados");
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
            throw new RuntimeException("Erro ao fechar conexão com banco de dados");
        }
    
    }
         
}
