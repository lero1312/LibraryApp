import DB.DbOperations;
import helperClasses.Address;

public class User implements DbOperations {
    private String name , pass , email , phone;
    private Address address;


    @Override
    public boolean getById() {
        return false;
    }

    @Override
    public boolean updateById() {
        return false;
    }

    @Override
    public boolean removeById() {
        return false;
    }

    @Override
    public boolean insert() {
        return false;
    }
}
