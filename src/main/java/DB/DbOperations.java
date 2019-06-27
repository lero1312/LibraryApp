package DB;

public interface DbOperations {
    // 1 for ok , 0 for fail
    public boolean getById();
    public boolean updateById();
    public boolean removeById();
    public boolean insert();
}
