package HomeWorkOne;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private double growth;
    private double weight;

    private double money;

    public Person(String name, int age, double growth, double weight) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }

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

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static class PensionFound {
        private String name = "Government Found";
        private boolean found = true;
        private String date = "12.09.2018";
        private int customer = 1000;

        public void Info() {
            System.out.println("Name of Found: " + name);
            System.out.println("Date of registration :" + date);
            if (found) {
                System.out.println(customer + " Thousand Person");
            } else System.out.println(customer + " Person ");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isFound() {
            return found;
        }

        public void setFound(boolean found) {
            this.found = found;
        }

        public String getDate() {
            return date;
        }

        public int getCustomer() {
            return customer;
        }

        public void setCustomer(int customer) {
            this.customer = customer;
        }
    }

    public static void main(String[] args) {
        PensionFound found = new PensionFound();
        found.Info();
        Scanner admin = new Scanner(System.in);
        System.out.println();
        System.out.print("Type your Name: ");
        String name = admin.nextLine();

        System.out.print("Type your age: ");
        int age = admin.nextInt();

        System.out.print("Type your Growth: ");
        double height = admin.nextDouble();

        System.out.print("Type your weight: ");
        double weight = admin.nextDouble();

        admin.close();

        Person person1 = new Person("John Snow", 35, 175, 80);
        Person person2 = new Person("Tyrion Lanister", 30, 100, 50);
        Person person3 = new Person("Aria Stark", 19, 155, 63);
        Person person4 = new Person("Sansa Stark", 23, 170, 60);

        admin.close();

        person1.list();
        System.out.println();
        person2.list();
        System.out.println();
        person3.list();
        System.out.println();
        person4.list();
    }

    public void getPersonInfo() {
        System.out.println("Your name " + name);
        System.out.println("Your age " + age);
        System.out.println("Your growth " + growth);
        System.out.println("Your weight " + weight);
    }

    public void goToWork() {
        System.out.print("What you have to do: ");
        if (age < 18 || age > 70) {
            System.out.println("Resting at home");
        } else {
            System.out.println("Go to work");
        }
    }

    public void list() {
        getPersonInfo();
        goToWork();
    }

    public double getMoney() {
        return money;
    }
}