package  ru.job4j.max;

/**
 * @author Alla Borodai (boroday12@gmail.com)
 * @version $Id$
 * @since 0.1
 */

    public class Max {
    /**
     * возвратить максимальное число из "first" и "second".
     * @param "first" первый аргумент
     * @param "second" второй аргумент
     * @return максимальное число.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    /**
     * возвратить максимальное число из "temp" и "third".
     * @param "temp" максимальное число из "first" и "second".
     * @param "third" третий аргумент
     * @return максимальное число.
     */
    public int max(int temp, int third) {
        int temp = this.max(first, second);
        return temp > third ? temp : third;
    }
    /**
     * возвратить максимальное число из "first", "second", "third".
     * @param "first" первый аргумент
     * @param "second" второй аргумент
     * @param "third" третий аргумент
     * @return максимальное число.
     */
    public int max(int first, int second, int third) {
        int temp = max(temp, third);
        return temp;
    }
}