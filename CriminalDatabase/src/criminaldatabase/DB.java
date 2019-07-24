//For Link With MySQL


package criminaldatabase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Praveen
 */

public class DB {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String host = OnlineData.dbhost;
            String port = OnlineData.dbport;
            String dbname = OnlineData.dbname;
            String url="jdbc:mysql://"+host+":"+port+"/"+dbname+"?allowPublicKeyRetrieval=true&useSSL=false";
            String user=OnlineData.dbuser;
            String password=OnlineData.dbpass;
            con=DriverManager.getConnection(url, user, password);
        } catch(Exception e){
            System.out.println(e);
        }
        return con;
        
    }
}
