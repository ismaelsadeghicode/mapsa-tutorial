import com.mapsa.database.CRUD;
import com.mapsa.database.DBConnection;
import com.mapsa.database.TableGenerate;
import com.mapsa.model.Customer;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Esmaeil Sadeghi, 8/5/20 2:47 PM
 */
public class App {

    public static void main(String[] args) throws IllegalAccessException, IOException, SQLException {
//        DBConnection.getInstance().getConnection();

//        TableGenerate tableGenerate = new TableGenerate();
//        tableGenerate.createTable(new Customer());
        CRUD crud = new CRUD();
        Customer customer = new Customer();
        customer.setId(2);
        customer.setFirstName("ali");
        customer.setLastName("ahmadi2");
        crud.update(customer);


    }
}
