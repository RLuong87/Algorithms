package com.company;

import java.util.*;

public class OrganizingContainers {

    public static String organizingContainers(List<List<Integer>> container) {

        HashMap<Integer, Integer> buckets = new HashMap<>();

        int totalOfZeroBalls = 0, totalOfOneBalls = 0, totalOfTwoBalls = 0;
        List<Integer> countList = new ArrayList<>();

        for (List<Integer> integers : container) {

            totalOfZeroBalls += integers.get(0);

//            totalOfOneBalls += integers.get(1);
//
//            totalOfTwoBalls += integers.get(2);

//            buckets.put(0, totalOfOneBalls);
//            buckets.put(1, totalOfZeroBalls);
        }
        countList.add(totalOfZeroBalls);
        countList.add(totalOfOneBalls);
        countList.add(totalOfTwoBalls);
        System.out.println(countList);

        for (int i = 0; i < countList.size() - 1; i++) {

            if (countList.get(i) == countList.get(i + 1)) {
                return "Possible";
            }
        }
        return "Impossible";
    }

    public static void main(String[] args) {

        List<List<Integer>> containers = new ArrayList<>();

        List<Integer> container1 = new ArrayList<>() {{
            add(0);
            add(2);
            add(1);
        }};
        containers.add(0, container1);

        List<Integer> container2 = new ArrayList<>() {{
            add(1);
            add(1);
            add(1);
        }};
        containers.add(1, container2);

        List<Integer> container3 = new ArrayList<>() {{
            add(2);
            add(0);
            add(0);
        }};
        containers.add(2, container3);

        System.out.println(organizingContainers(containers));


//        System.out.println(container3);


        int totalOfZeroBalls = 0, totalOfOneBalls = 0;
        StringBuilder possible = new StringBuilder();

        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer> countList = new ArrayList<>();
        for (int i = 0; i < containers.size(); i++) {

            totalOfZeroBalls += containers.get(i).get(0);

            totalOfOneBalls += containers.get(i).get(1);

            count.put(0, totalOfOneBalls);
            count.put(1, totalOfZeroBalls);
        }
        countList.add(totalOfZeroBalls);
        countList.add(totalOfOneBalls);

        for (int i = 0; i < countList.size(); i++) {

            if (countList.get(0) <= countList.get(i)) {
//                System.out.println("Possible");
            } else {
//                System.out.println("Impossible");
            }

        }


//        System.out.println(containers);
//        System.out.println(totalOfZeroBalls);
//        System.out.println(totalOfOneBalls);


//        int total = container.get(0).get(1).stream

    }
}
