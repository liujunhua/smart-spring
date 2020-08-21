package smart.srping.ioc;

/**
 * @author liujunhua
 * @description: User
 * @date 2020/8/1311:08
 */
public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}

