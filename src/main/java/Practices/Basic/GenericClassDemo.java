package Practices.Basic;

public class GenericClassDemo<T> {
    private T date;

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public static void main(String[] args) {
        GenericClassDemo<Integer> class1 = new GenericClassDemo<Integer>();
        GenericClassDemo<String> class2 = new GenericClassDemo<String>();

        class1.setDate(new Integer(88));
        class2.setDate(new String("test"));

        System.out.println(class1.getDate());
        System.out.println(class2.getDate());
    }
}
