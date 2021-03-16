package com.example.zoo;

/**
 * Сотрудник.
 */
public class Employee {
    private final String name;
    private int salary;

    /**
     * Конструктор, принимающий в себя всю информацию о сотруднике.
     * @param name Имя сотрудника.
     * @param salary Зарплата сотрудника.
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
