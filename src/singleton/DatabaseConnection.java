package singleton;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection=null;

    private DatabaseConnection(){}

    public synchronized static DatabaseConnection getInstance(){
        if(databaseConnection==null){
            databaseConnection=new DatabaseConnection();
        }
        return databaseConnection;
    }

}
