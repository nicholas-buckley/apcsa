public class References2{
    public static void main(String[] args){
        int age1, age2, age3;

        age1 = 1;
        age2 = 2;
        age3 = 3;

        Person person1 = new Person("Rachel", age1);
        Person person2 = new Person("Elly", age2);
        Person person3 = new Person("Sarah", age3);

        System.out.println();
        System.out.println("The original three people...");
        System.out.println(person1 + ", " + person2 + ", " + person3);

        age1 = age2;
        age3 = age2;

        person1 = person2;
        person3 = person2;

        System.out.println();
        System.out.println("The changed values are...");
        System.out.println("Ages (ints):" + age1 + ", " + age2 + ", " + age3);
        System.out.println(person1 + ", " + person2 + ", " + person3);

        System.out.println("\nChanging the second age to 99");
        age2 = 99;
        person2.changeAge(age2);

        System.out.println();
        System.out.println("The changed values are...");
        System.out.println("Ages (ints):" + age1 + ", " + age2 + ", " + age3);
        System.out.println(person1 + ", " + person2 + ", " + person3);

        System.out.println("\nChanging the first age to 100");
        age1 = 100;
        person1.changeAge(age1);

        System.out.println();
        System.out.println("The changed values are...");
        System.out.println("Ages (ints):" + age1 + ", " + age2 + ", " + age3);
        System.out.println(person1 + ", " + person2 + ", " + person3);
    }
}