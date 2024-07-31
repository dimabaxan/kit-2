public class PairUtils {
    public static <T, U> String sumOrConcat(Pair<T, U> pair) {
    T first = pair.getFirst();
    U second = pair.getSecond();

    if (first instanceof Number && second instanceof Number) {
        Number firstNum = (Number) first;
        Number secondNum = (Number) second;
        return String.valueOf(firstNum.doubleValue() + secondNum.doubleValue());
    } else if (first instanceof String && second instanceof String) {
        return (String) first + (String) second;
    } else {
        throw new IllegalArgumentException("Элементы пары должны быть как числами, так и строками");
    }
}

}
