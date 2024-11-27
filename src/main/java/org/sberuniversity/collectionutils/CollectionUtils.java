package org.sberuniversity.collectionutils;

import java.util.*;

public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<? extends T> source, T t) {
        return source.indexOf(t);
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        return new ArrayList<>(source.subList(0, size));
    }

    public static <T> void add(List<? super T> source, T t) {
        source.add(t);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    //true если первый лист содержит все элементы второго
    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        if (c1.equals(c2)) {
            return true;
        } else {
            return false;
        }
    }

    //true если первый лист содержит хотя-бы 1 второго
    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T t : c1) {
            if (c2.contains(t)) {
                return true;
            }
        }
        return false;
    }

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static <T extends Comparable<? super T>> List<T> range(List<T> list, T min, T max) {
        List<T> rangeList = new ArrayList<>();
        for (T t : list) {
            if (t.compareTo(min) >= 0 && t.compareTo(max) <= 0) {
                rangeList.add(t);
                Collections.sort(rangeList);
            }
        }
        return rangeList;
    }

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static <T> List<T> range(List<T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> rangeList = new ArrayList<>();
        for (T t : list) {
            if (comparator.compare(t, min) >= 0 && comparator.compare(t, max) <= 0) {
                rangeList.add(t);

            }
        }
        rangeList.sort(comparator);
        return rangeList;

    }
}



