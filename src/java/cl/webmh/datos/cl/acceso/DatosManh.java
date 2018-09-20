
package cl.webmh.datos.cl.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatosManh {
    
    private String userMh="manh";
    private String passMh="manh";
    private String hostMh="10.10.10.206";//test
    private String portMh="1433";
    private String dbMh="ILS";
    private String classNameMh="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String urlMh="jdbc:sqlserver://"+hostMh+";databaseName="+dbMh;        
    private Connection conMh;
    
        public DatosManh(){
        try{
            Class.forName(classNameMh);
  
            conMh=DriverManager.getConnection(urlMh, userMh, passMh);

        }
        catch(ClassNotFoundException e){
            System.err.println("Error "+e);
        }
        catch(SQLException e){
            System.err.println("Error "+e);
        }
        }
        public Connection getDatosMh(){
            return conMh;
        }
        
        public Connection getConectar(){
                Connection conMh2;
                String classNameMh2="com.microsoft.sqlserver.jdbc.SQLServerDriver";
                String userMh2="manh";
                String passMh2="manh";
                String hostMh2="10.10.10.206";//test
                String urlMh2="jdbc:sqlserver://"+hostMh+";databaseName="+dbMh;  
                
                try
                {
                    Class.forName(classNameMh2);
                    
                    conMh=DriverManager.getConnection(urlMh2, userMh2, passMh2);

                    return conMh;
                }
                catch(ClassNotFoundException e){
                    System.err.println("Error "+e);
                    
                    return null;
                }
                catch(SQLException e){
                 System.err.println("Error "+e);
                     return null;
                }
        }
        
        public static void main(String[] args) {
            DatosManh con= new DatosManh();
    }
    }

