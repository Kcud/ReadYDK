package db;

import domain.YGOCard;

import javax.smartcardio.Card;
import java.sql.*;

public class ConnectYGOSQLite {
    private String driveName;
    private String dbPath;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public ConnectYGOSQLite(String dbPath) {
        this.dbPath = dbPath;
        this.driveName = "org.sqlite.JDBC";
        try {
            Class.forName(driveName);
            connection = DriverManager.getConnection("jdbc:sqlite:/"+dbPath);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public YGOCard getCardByPassword(String password){
        String sql = "select id,name from texts where id ="+password;
        YGOCard card = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            card = new YGOCard(resultSet.getString("id"),resultSet.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return card;

    }
    public boolean close(){
        try {
            if (connection != null){
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
