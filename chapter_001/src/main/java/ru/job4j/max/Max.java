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
    public int max()
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