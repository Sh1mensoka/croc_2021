import com.example.zoo.*;

/**
 * Сценарий работы зоопарка.
 */
public class Scenario {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(20000);
        zoo.addEmployee("Иван", 15000);
        zoo.addEmployee("Алексей", 27000);
        zoo.addEmployee("Марина", 19000);
        zoo.addCage(12, 20, 5, 1);
        zoo.addCage(5, 5, 5, 24);
        zoo.bornAnimal("Арсений", "Лев", zoo.getCages()[1], zoo.getEmployees()[0]);
        zoo.buyAnimal("Николай", "Жираф", 12, zoo.getCages()[0], zoo.getEmployees()[2], 12000);
        zoo.feedAnimal(zoo.getAnimals()[0]);
        zoo.cleanCage(zoo.getCages()[1]);
        zoo.illAnimal(zoo.getAnimals()[1], "Ветрянка");
        zoo.deadAnimal(zoo.getAnimals()[0]);
        zoo.sellAnimal(zoo.getAnimals()[0], 5000);
    }
}
