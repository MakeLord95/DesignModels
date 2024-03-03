package Week_6.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> dataList = new ArrayList<>();
        dataList.add("One");
        dataList.add("Two");
        dataList.add("Three");
        dataList.add("Four");
        dataList.add("Five");

        ListConverter strategy1 = new LineBreakEveryItem();
        System.out.printf("\nStrategy 1:%n%s%n", strategy1.listToString(dataList));

        ListConverter strategy2 = new LineBreakEveryOtherItem();
        System.out.printf("Strategy 2:%n%s%n", strategy2.listToString(dataList));

        ListConverter strategy3 = new LineBreakEveryThirdItem();
        System.out.printf("Strategy 3:%n%s%n", strategy3.listToString(dataList));
    }
}
