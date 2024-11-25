package mission12.user;

public interface User {
    public String name = "";
    public String id = "";
    public String password = "";


    public String getId();

    public String getName();

    public boolean hasUserById(String id);


    public boolean checkPassword(String password);
}
