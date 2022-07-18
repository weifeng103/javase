public class ValuePropagation {
    public static String changeValue(String value){
        value = "hello";
        return value;
    }

    public static void main(String[] args) {
        String value = "ÄãºÃ£¡";
        changeValue(value);
        System.out.println(changeValue(value));

    }
}
