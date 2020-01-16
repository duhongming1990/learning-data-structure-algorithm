import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/3/6 21:32
 */
public class HashCode {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person person1 = new Person("dhm",10);
        Person person2 = new Person("dhm",10);
        set.add(person1);
        set.add(person2);
        System.out.println(set.size());

    }
}

class Person{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
