/**
  *Calculator.
  */

package ru.job4j.calculator;

/**
 * Class Клас для вычисления арифметических операциц +-*:.
 * @autor Alla Borodai(boroday12@gmail.com)
 * @version $Id$
 * @since 24.01.2019
 */

    public class Calculator {
    private double result;

    /**
     * Сложение
     * @param "first" первый аргумент
     * @param "second" второй аргумент
     * @return результат
     */

    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Вычитание
     * @param "first" первый аргумент
     * @param "second" второй аргумент
     * @return результат
     */

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Деление
     * @param "first" первый аргумент
     * @param "second" второй аргумент
     * @return результат
     */

    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Умножение
     * @param "first" первый аргумент
     * @param "second" второй аргумент
     * @return результат
     */

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return result;
    }
}