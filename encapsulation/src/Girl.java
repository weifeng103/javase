public class Girl {
    private int age;
    private String name;
    public void setAge(int age) {
         this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setAge(20);
        System.out.println(girl.age);
    }
}
