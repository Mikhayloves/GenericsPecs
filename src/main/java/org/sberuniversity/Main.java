package org.sberuniversity;

import org.sberuniversity.collectionutils.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> source1 = new ArrayList<>(List.of(2, 23, 70, 420, 33, 55));
        List<Double> source2 = new ArrayList<>(List.of(2.2, 23.23, 70.4, 420.0, 33.2, 55.0));
        List<Integer> example1 = CollectionUtils.newArrayList();
        List<Double> example2 = CollectionUtils.newArrayList();

        System.out.println("Добавление массива: ");
        CollectionUtils.addAll(source1, example1);
        CollectionUtils.addAll(source2, example2);
        System.out.println("Вывод = " + example1);
        System.out.println("Вывод = " + example2);
        System.out.println("=====================================");
        System.out.println("Создание нового массива = " + example2);
        System.out.println("=====================================");
        System.out.println("Индекс числа 23 в масcиве - " + CollectionUtils.indexOf(source1, 23));
        System.out.println("=====================================");
        System.out.println("Создание нового масcива с размером 3 " + CollectionUtils.limit(example1, 3));
        System.out.println("=====================================");
        System.out.println("Добавление числа 555");
        CollectionUtils.add(example1, 555);
        System.out.println(example1);
        System.out.println("=====================================");
        List<Integer> removearrays = new ArrayList<>(List.of(23, 420));
        System.out.printf("Удаляем элементы из масcива %s", removearrays);
        CollectionUtils.removeAll(source1, removearrays);
        System.out.println();
        System.out.println(source1);
        System.out.println("=====================================");
        List<Double> example3 = new ArrayList<>(List.of(2.2, 23.23, 70.4, 420.0, 33.2, 55.0));
        System.out.print("Содержит ли список source2 элементы списка example3");
        System.out.println();
        System.out.println(CollectionUtils.containsAll(source2, example3));
        System.out.println("=====================================");
        List<Integer> example4 = new ArrayList<>(List.of(2, 32, 10, 430, 3, 5));
        System.out.println(CollectionUtils.containsAny(source1, example4));
        System.out.println("=====================================");
        System.out.println("Ранжирование с помощью Comparable");
        System.out.println(CollectionUtils.range(Arrays.asList(8, 1, 3, 5, 6, 4), 3, 6));
        System.out.println("=====================================");
        System.out.println("Ранжирование с помощью Comparator");
        System.out.println(CollectionUtils.range(Arrays.asList(8, 1, 3, 5, 6, 4), 3, 7, Integer::compareTo));
    }
}