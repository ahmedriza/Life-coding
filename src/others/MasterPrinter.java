package others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasterPrinter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        MasterPrinter.printList(list);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("");

    }

    public static void printList(List<?> list) {
        System.out.println("");
        for (Object o : list)
            System.out.print(o.toString()+" ");
    }

    public static void printArrayChars(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void printMap(HashMap<Object, Object> map) {
        for (Map.Entry<Object, Object> e : map.entrySet()) {
            System.out.println("key: "+e.getKey()+" "+"value: "+e.getValue());
        }
    }

    public static void printAdjacencyListGraph(List<Integer>[] graph) {
        int i=0;
        for(List<Integer> l:graph){
            System.out.print(i +"->");
            for(int j:l){
                System.out.print(j+" ");
            }
            System.out.println();
            i++;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println("");
        }
        System.out.println("-----------------");
    }
}
