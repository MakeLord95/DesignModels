package Week_6.Strategy;

import java.util.List;

public class LineBreakEveryThirdItem implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i += 3) {
            result.append(list.get(i)).append("\n");
        }
        return result.toString();
    }
}
