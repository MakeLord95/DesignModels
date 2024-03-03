package Week_6.Strategy;

import java.util.List;

public class LineBreakEveryOtherItem implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i += 2) {
            result.append(list.get(i)).append("\n");
        }
        return result.toString();
    }
}