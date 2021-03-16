package com.example.zoo;

/**
 * Животное.
 */
public class Animal {
    private final String name;
    private final String kind;
    private int age;
    private Cage cage;
    private Employee employee;

    /**
     * Конструктор, принимающий в себя всю информацию о животном.
     * Используется при покупке животного.
     * @param name Имя животного.
     * @param kind Вид животного.
     * @param age Возраст животного.
     * @param cage Клетка, в которой находится животное.
     * @param employee Сотрудник, привязанный к животному.
     */
    public Animal(String name, String kind, int age, Cage cage, Employee employee) {
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.cage = cage;
        this.employee = employee;
    }

    /**
     * Конструктор, принимающий в себя всю информацию о животном, кроме возраста.
     * Поле возраста инициализируется значением 0.
     * Используется при рождении животного в зоопарке.
     * @param name Имя животного.
     * @param kind Вид животного.
     * @param cage Клетка, в которой находится животное.
     * @param employee Сотрудник, привязанный к животному.
     */
    public Animal(String name, String kind, Cage cage, Employee employee) {
        this(name, kind, 0, cage, employee);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return  "Имя='" + name +
                ", Вид='" + kind +
                ", Возраст=" + age +
                ", Клетка=" + cage.getId() +
                ", Сотрудник=" + employee.getName();
    }
}