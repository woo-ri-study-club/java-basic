package section13.member.data;

import java.util.Objects;

public class RegistData {

    private String id;
    private String name;
    private String password;
    private String key;

    public RegistData(String id, String name, String password, String key) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.key = key;
    }

    public RegistData(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public boolean hasKey() {
        return key != null && !key.isEmpty();
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
        return key;
    }
}
