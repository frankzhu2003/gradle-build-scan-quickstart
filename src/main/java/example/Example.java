package example;

public class Example {

    public static String join(String... args) {
        return String.join(" ", args);
    }

    // Lombok-annotated example
    @lombok.Builder
    @lombok.Getter
    public static class Person {
        private final String name;
        private final int age;
    }

    public static Person createPerson(String name, int age) {
        return Person.builder().name(name).age(age).build();
    }

}
