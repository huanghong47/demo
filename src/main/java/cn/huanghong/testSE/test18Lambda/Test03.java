package cn.huanghong.testSE.test18Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-29 17:44
 */
public class Test03 {
    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};
//        Arrays.sort(players, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                System.out.println(o1);
//                System.out.println(o2);
//                return o1.compareTo(o2);
//            }
//        });
//        for (String player : players) {
//            System.out.println(player);
//        }

        Arrays.sort(players,(String o1,String o2) -> o1.compareTo(o2));
        List<String>playerslist = Arrays.asList(players);
        playerslist.forEach((player) -> System.out.println(player));
    }
}
