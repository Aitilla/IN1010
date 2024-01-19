

public class bilBruk3 {
    public static void main(String[] args) {
        bil3 newCar = new bil3("EK91902");
        person newPerson = new person("helene", newCar);
        newPerson.personName();
        newPerson.call();

    }
}
