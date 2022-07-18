package strategy;

public class User implements Comparable{

    public User() {
    }

    public User(String name, Integer age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    private String name;
    private Integer age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public Integer compare(Object object) {
        if (object instanceof User){
            User user = (User) object;
            return this.getAge() - user.getAge();
        }
        return null;
    }
}
