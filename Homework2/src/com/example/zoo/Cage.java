package com.example.zoo;

/**
 * Клетка.
 */
public class Cage {
    private final int length;
    private final int width;
    private final int height;
    private final int id;

    /**
     * Конструктор, принимающий в себя всю информацию о клетке.
     * @param length Длина клетки.
     * @param width Ширина клетки.
     * @param height Высота клетки.
     * @param id Номер клетки.
     */
    public Cage(int length, int width, int height, int id) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "Номер клетки=" + id;
    }
}