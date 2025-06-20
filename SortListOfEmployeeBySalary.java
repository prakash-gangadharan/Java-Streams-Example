import java.util.*;

public class SortListOfEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee1> list = Arrays.asList(
                new Employee1("Alice", 6000),
                new Employee1("Bob", 5000),
                new Employee1("Charlie", 7000)
        );

        Comparator<Employee1> salaryComparator = Comparator.comparingDouble(Employee1::getSalary);
        Comparator<Employee1> nameComparator = Comparator.comparing(Employee1::getName);

        list.sort(salaryComparator);
        System.out.println(list);

        list.sort(nameComparator);
        System.out.println(list);

        Comparator<Employee1> cmp = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
        Comparator<Employee1> cmp1 = (e1, e2) -> e1.getName().compareTo(e2.getName());

        Collections.sort(list, cmp);
        System.out.println(list);

        Collections.sort(list, cmp1);
        System.out.println(list);
    }
}

class Employee1 {
    String name;
    Double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
