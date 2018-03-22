package week5;

import java.util.List;

public class ListComparisonHelper {

    public boolean equalsFirstNObject(List list1, List list2, int i) {
        if (!valid(list1, list2, i)) {
            return false;
        }
        for (int index = 0; index < i; index++) {
            Object o1 = list1.get(index);
            Object o2 = list2.get(index);
            if (o1.equals(o2)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean equals(List list1, List list2) {
        if (valid(list1, list2)) return false;

        int index = 0;
        for (Object objectFromList1 : list1) {
            Object objectFronmList2 = list2.get(index);
            if (objectFromList1.equals(objectFronmList2)) {
                index++;
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean valid(List list1, List list2) {
        if (list1 == null || list2 == null) {
            return true;
        }
        if (list1.size() != list2.size()) {
            return true;
        }
        return false;
    }

    private boolean valid(List list1, List list2, int i) {
        if (i < 0) {
            return false;
        }
        if (list1 == null || list2 == null) {
            return false;
        }
        if (list1.size() >= i && list2.size() >= i) {
            return true;
        }

        return false;
    }
}
