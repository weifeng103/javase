import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Hello Hello World";
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.indexOf("Hello"));
        //截取字符串 第一个下标包含 第二个不包含
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i, i + 1)+" ");
        }
        System.out.println(str.replaceAll("H","h"));
        StringMethod str1 = new StringMethod();
        System.out.println(str1.wordCount("abc abc def", "abc"));
        str1.wordCountEach("avahgcGJHGHJK");


    }
    public int wordCount(String article, String word) {
        for (int i = 0; i < article.length(); i++) {
            String a=article.substring(i, i + 1)+(" ");
        }
        //1、文章打散成数组
        String[] words = article.split(" ");
        int res=0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)){
                res++;
            }
        }
        return res;
    }
    public void wordCountEach(String word){
        int []count = new int[57];
        for (int i = 0; i < word.length(); i++){
            char temp = word.charAt(i);
            if ((temp >= 65 && temp<=90) || (temp >=97 && temp <= 122)){
                 int index = temp - 65;
                count[index]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0){
                System.out.println("字母" + (char)(i + 65) + "出现的次数：" + count[i]);
            }
        }
    }

}
