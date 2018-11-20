import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DBWorker worker = new DBWorker();
        String query = "select * from phonebook";
        try{
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Abonent abonent = new Abonent();
                abonent.setId(resultSet.getInt(1));
                abonent.setName(resultSet.getString(2));
                abonent.setNumber(resultSet.getInt(3));

                System.out.println(abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
