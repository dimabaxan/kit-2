//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> intPair = new Pair<>(3, 4);
        Pair<String, String> stringPair = new Pair<>("Здравствуйте. , ", "Пользователь!");

        System.out.println(PairUtils.sumOrConcat(intPair));
    }
}

