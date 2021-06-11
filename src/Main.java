public class Main {
    public static void main(String[] args) {
        Dog.DogBuilder builder = new Dog.ChihuahuaBuilder();
        builder.giveName("Reksio");
        builder.setAge(5);
        builder.addToy("bone");
        builder.addToy("ball");
        Dog dog = builder.getDog();
        System.out.println(dog);
        Dog.DogBuilder builder2 = new Dog.HuskyBuilder();
        builder2.giveName("Luna");
        builder2.setAge(8);
        builder2.addToy("selfie stick");
        builder2.addToy("rubber duck");
        Dog dog2 = builder2.getDog();
        System.out.println(dog2);
    }
}
