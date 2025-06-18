import java.util.HashSet;
import java.util.Set;

public class ObjectEquality {
    public static void main(String[] args) {
        Emp e1 = new Emp("1", "Name");
        Emp e2 = new Emp("1", "Name");
        Set<Emp> ss = new HashSet<Emp>();

        System.out.println(e1.equals(e2)); //false
        System.out.println(e1 == e2); // false
        ss.add(e2);
        ss.add(e1);
        System.out.println(ss.size()); //2
    }
}

class Emp {
    String id;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emp(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

}
