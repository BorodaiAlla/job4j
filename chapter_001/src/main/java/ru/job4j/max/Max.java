package  ru.job4j.max;

/**
 * @author Alla Borodai (boroday12@gmail.com)
 * @version $Id$
 * @since 0.1
 */

    public class Max {
    /**
     * возвратить максимальное число из "first" и "second" .
     * @param "first" первый аргумент
     * @param "second" второй аргумент
     * @return максимальное число.
     */
        public int max(int first, int second) {
            return first > second ? first : second;
        }
}