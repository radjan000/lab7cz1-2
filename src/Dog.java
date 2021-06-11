import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog(String type) {
        this.type = type;
        this.toys = new ArrayList<String>();
    }

    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(name + " the " + type + " is " + age + " years old");
        strBuilder.append(" and has the following toys: ");
        strBuilder.append(toys);
        return strBuilder.toString();
    }

    public interface DogBuilder {
        void giveName(String name);

        void setAge(Integer age);

        void addToy(String toy);

        Dog getDog();
    }

    public static class ChihuahuaBuilder implements DogBuilder {
        private Dog dog;

        public ChihuahuaBuilder() {
            dog = new Dog("Chihuahua");
        }

        public void giveName(String name) {
            dog.name = name;
        }

        public void setAge(Integer age) {
            dog.age = age;
        }

        public void addToy(String toy) {
            dog.toys.add(toy);
        }

        public Dog getDog() {
            return dog;
        }
    }

    public static class HuskyBuilder implements DogBuilder {
        private Dog dog;

        public HuskyBuilder() {
            dog = new Dog("Husky");
        }

        public void giveName(String name) {
            dog.name = name;
        }

        public void setAge(Integer age) {
            dog.age = age;
        }

        public void addToy(String toy) {
            dog.toys.add(toy);
        }

        public Dog getDog() {
            return dog;
        }
    }
}

