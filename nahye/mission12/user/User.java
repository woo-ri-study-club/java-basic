package mission12.user;

public interface User {

    String getId();

    String getName();

    boolean hasUserById(String id);

    boolean checkPassword(String password);

}
