package Practices.Basic;
// 泛型练习
public class GenericDemo {

    public static <E> void printArray(E[] inputArray) {
        for(E element:inputArray){
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'a','b','c','d','e'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
