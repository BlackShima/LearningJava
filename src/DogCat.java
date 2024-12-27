public class DogCat {
    private String name;
    private int age;
    private String color;
    private String breed;

    // Constructor
    public DogCat(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Color: " + color + ", Breed: " + breed;
    }

    // Dog subclass
    public static class Dog extends DogCat {
        public Dog(String name, int age, String color, String breed) {
            super(name, age, color, breed);
        }

        public void makeSound() {
            System.out.println("Woof! Woof!");
        }

        public void fetch() {
            System.out.println("Fetching the ball...");
        }
    }

    // Cat subclass
    public static class Cat extends DogCat {
        public Cat(String name, int age, String color, String breed) {
            super(name, age, color, breed);
        }

        public void makeSound() {
            System.out.println("Meow!");
        }

        public void scratch() {
            System.out.println("Scratching the furniture...");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Brown", "Labrador");
        Cat cat = new Cat("Whiskers", 3, "Black", "Siamese");

        System.out.println("Animal Information:");
        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);

        System.out.println("\nSounds:");
        System.out.print(dog.getName() + " says: ");
        dog.makeSound();

        System.out.print(cat.getName() + " says: ");
        cat.makeSound();

        System.out.println("\nUnique Actions:");
        dog.fetch();
        cat.scratch();
    }
}
