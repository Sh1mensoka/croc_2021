package com.example.zoo;

import java.util.Arrays;

/**
 * Зоопарк.
 */
public class Zoo {
    private Animal[] animals = new Animal[] {};
    private Cage[] cages = new Cage[] {};
    private Employee[] employees = new Employee[] {};
    private String[] illRecords = new String[] {};
    private String[] cleanRecords = new String[] {};
    private String[] feedRecords = new String[] {};
    private double budget;

    public Zoo(double budget) {
        this.budget = budget;
    }

    /**
     * Покупка животного в зоопарк.
     * @param name Имя животного.
     * @param kind Вид животного.
     * @param age Возраст животного.
     * @param cage Клетка для животного.
     * @param employee Сотрудник для животного.
     * @param price Цена животного.
     */
    public void buyAnimal(String name, String kind, int age, Cage cage, Employee employee, double price) {
        animals = Arrays.copyOf(animals, animals.length + 1);
        animals[animals.length - 1] = new Animal(name, kind, age, cage, employee);
        budget -= price;
    }

    /**
     * Рождение животного в зоопарке.
     * @param name Имя животного.
     * @param kind Вид животного.
     * @param cage Клетка для животного.
     * @param employee Сотрудник для животного.
     */
    public void bornAnimal(String name, String kind, Cage cage, Employee employee) {
        animals = Arrays.copyOf(animals, animals.length + 1);
        animals[animals.length - 1] = new Animal(name, kind, cage, employee);
    }

    /**
     * Продажа животного из зоопарка.
     * @param animal Животное, которое продается.
     * @param price Цена животного.
     */
    public void sellAnimal(Animal animal, double price) {
        Animal[] newAnimals = new Animal[animals.length - 1];
        int index = 0;
        for (Animal currentAnimal: animals) {
            if (currentAnimal != animal) {
                newAnimals[index++] = currentAnimal;
            }
        }
        animals = newAnimals;
        budget += price;
    }

    /**
     * Смерть животного в зоопарке.
     * @param animal Умершее животное.
     */
    public void deadAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length - 1];
        int index = 0;
        for (Animal currentAnimal: animals) {
            if (currentAnimal != animal) {
                newAnimals[index++] = currentAnimal;
            }
        }
        animals = newAnimals;
    }

    /**
     * Добавление записи о болезни животного.
     * @param animal Заболевшее животное.
     * @param illness Болезнь животного.
     */
    public void illAnimal(Animal animal, String illness) {
        illRecords = Arrays.copyOf(illRecords, illRecords.length + 1);
        illRecords[illRecords.length - 1] = animal.toString() + ", Болезнь= " + illness;
    }

    /**
     * Добавление записи о кормлении животного.
     * @param animal Накормленное животное.
     */
    public void feedAnimal(Animal animal) {
        feedRecords = Arrays.copyOf(feedRecords, feedRecords.length + 1);
        feedRecords[feedRecords.length - 1] = animal.toString();
    }

    /**
     * Добавление записи об очистке клетки.
     * @param cage Очищенная клетка.
     */
    public void cleanCage(Cage cage) {
        cleanRecords = Arrays.copyOf(cleanRecords, cleanRecords.length + 1);
        cleanRecords[cleanRecords.length - 1] = cage.toString();
    }

    /**
     * Добавление сотрудника в зоопарк.
     * @param name Имя сотрудника.
     * @param salary Зарплата сотрудника.
     */
    public void addEmployee(String name, int salary) {
        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = new Employee(name, salary);
    }

    /**
     * Увольнение сотрудника из зоопарка.
     * @param employee Увольняемый сотрудник.
     */
    public void removeEmployee(Employee employee) {
        Employee[] newEmployees = new Employee[employees.length - 1];
        int index = 0;
        for (Employee currentEmployee : employees) {
            if (currentEmployee != employee) {
                newEmployees[index++] = currentEmployee;
            }
        }
        employees = newEmployees;
    }

    /**
     * Добавление клетки в зоопарк.
     * @param length Длина клетки.
     * @param width Ширина клетки.
     * @param height Высота клетки.
     * @param id Номер клетки.
     */
    public void addCage(int length, int width, int height, int id) {
        cages = Arrays.copyOf(cages, cages.length + 1);
        cages[cages.length - 1] = new Cage(length, width, height, id);
    }

    /**
     * Удаление клетки из зоопарка.
     * @param cage Удаляемая клетка.
     */
    public void removeCage(Cage cage) {
        Cage[] newCages = new Cage[cages.length + 1];
        int index = 0;
        for (Cage currentCage : cages) {
            if (currentCage != cage) {
                newCages[index++] = currentCage;
            }
        }
        cages = newCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public Cage[] getCages() {
        return cages;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}