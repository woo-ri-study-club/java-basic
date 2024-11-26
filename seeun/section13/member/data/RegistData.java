package section13.member.data;

import java.util.Optional;

public class RegistData {

    private final String id;
    private final String name;
    private final String password;
    private final Optional<String> key;

    public RegistData(String id, String name, String password, String key) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.key = Optional.ofNullable(key);
    }

    public RegistData(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.key = Optional.empty();
    }

    public boolean hasKey() {
        return key.isPresent();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getKey() {
        return key.get();
    }
}
