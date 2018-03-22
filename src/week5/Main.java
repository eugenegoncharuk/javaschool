package week5;

import week4.domain.Car;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        compareAssertion();

        List l1 = new ArrayList();
        List l2 = new ArrayList();

        Car c1 = new Car(1);
        Car c2 = new Car(2);
        Car c3 = new Car(3);

        l1.add(c1);
        l2.add(c1);

        ListComparisonHelper helper = new ListComparisonHelper();

        assert(helper.equalsFirstNObject(l1, l2, 2) == false);
        assert(helper.equalsFirstNObject(l1, l2, 1) == true);
    }

    private static void compareAssertion() {
        Car c1 = new Car(123);
        Car c2 = new Car(123);
        Car c3 = new Car(125);

        List list1 = new ArrayList();
        list1.add(c1);

        List list2 = new ArrayList();
        list2.add(c2);

        List list3 = null;

        List list4 = new ArrayList();
        list4.add(c3);

        ListComparisonHelper helper = new ListComparisonHelper();
        assert(helper.equals(list1, list3) == false);
        assert(helper.equals(list1, list2) == true);
        assert(helper.equals(list1, list4) == false);
    }

}
