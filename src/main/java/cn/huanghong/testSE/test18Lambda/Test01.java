package cn.huanghong.testSE.test18Lambda;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-29 15:11
 */
public class Test01 {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

// 以前的循环方式
//        for (String player : players) {
//            System.out.println(player + "; ");
//        }

// 使用 lambda 表达式以及函数操作(functional operation)
//        players.forEach((player) -> System.out.print(player + "; "));
//        players.forEach((player) -> System.out.println(player+";"));

// 在 Java 8 中使用双冒号操作符(double colon operator)
//        players.forEach(System.out::println);
        players.forEach(System.out::print);
    }
}
