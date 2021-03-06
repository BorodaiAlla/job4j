package ru.job4j.converter;

/**
 * Конвсувертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в доллары.
     * @param "value" рубли.
     * @return Доллары
     */
    public int rubleToDolar(int value) {
        return value / 60;
    }
    /**
     * Конвертируем рубли в евро.
     * @param "value" рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param "value" доллары.
     * @return Рубли.
     */
    public int dolarToRuble(int value) {
        return value * 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param "value" евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        return value * 70;
    }
}