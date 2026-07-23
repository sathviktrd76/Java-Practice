public class GenericMethodDemo{
    public static <T> void GenericPrint(T t){
        System.out.println(t);
    }

    public static void main(String[] args){
        GenericPrint(100);
        GenericPrint("hello");
        GenericPrint(7.6);
        GenericPrint(true);
        GenericPrint(34.999234);
    }
}