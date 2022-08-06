package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaTest {
    List<Person> personList = new ArrayList<>();
    List<Integer> simpleList = Arrays.asList(15, 22, 9, 11, 33, 52, 14);

    @BeforeEach
    public void initData(){
        personList.add(new Person("张三",3000,23,"男","太原"));
        personList.add(new Person("李四",7000,34,"男","西安"));
        personList.add(new Person("二大爷",9000,32,"男","南昌"));
        personList.add(new Person("王五",5200,22,"女","太原"));
        personList.add(new Person("小黑",1500,33,"女","上海"));
        personList.add(new Person("狗子",8000,44,"女","北京"));
        personList.add(new Person("铁蛋",6200,36,"女","南京"));
    }
    // 流的遍历
    @Test
    public void foreachTest(){
        personList.stream().forEach(System.out::println);
    }
    @Test
    public void findTest(){
        Optional<Integer> first = simpleList.stream().findFirst();
        first.ifPresent(System.out::println);
        Optional<Integer> any = simpleList.stream().findAny();
        any.ifPresent(System.out::println);
    }
    // 匹配 用于条件的判断
    @Test
    public void MatchTest() {
        boolean b = personList.stream().allMatch(person -> person.getSalary() > 8000);
        System.out.println("b = " + b);
    }
    @Test
    public void countTest() {
        long count = personList.stream().count();
        OptionalDouble average = simpleList.stream().mapToInt(i -> i).average();
        average.ifPresent(System.out::println);

        OptionalInt max = new Random().ints().max();
        max.ifPresent(System.out::println);

        // 求工资最高的员工
        Optional<Person> max1 = personList.stream().
                max((person1, person2) -> person1.getSalary() - person2.getSalary());
        max1.ifPresent(System.out::println);
    }
    @Test
    public void reduceTest() {
        int reduce = IntStream.of(2, 1, 3, 4).reduce(0, (o1, o2) -> o1 + o2);
        System.out.println(reduce);
        int reduce2 = IntStream.of(2, 1, 3, 4).reduce(1, (o1, o2) -> o1 * o2);
        System.out.println(reduce2);
    }
    @Test
    public void joiningTest(){
        List<String> list = Arrays.asList("A", "B", "C");
        String string = list.stream().collect(Collectors.joining("-"));
        System.out.println("拼接后的字符串：" + string);
    }
    @Test
    public void groupingTest(){
        // partitioningBy进行是非判断分组,需要传入一个断言 groupingBy根据相同属性自动分组,传入一个函数接口
        Map<Boolean, List<Person>> salaryCollect = personList.stream().collect(Collectors.partitioningBy(p -> p.getSalary() > 5000));
        System.out.println(salaryCollect);
        Map<String, List<Person>> sexCollect = personList.stream().collect(Collectors.groupingBy(Person::getSex));
        System.out.println(sexCollect);
        Map<Boolean, List<Person>> sexCollect2 = personList.stream().collect(Collectors.partitioningBy(p -> (p.getSex()).equals("女")));
        System.out.println(sexCollect2);
    }
    @Test
    public void collectTest(){
        List<Integer> collect = simpleList.stream().collect(Collectors.toList());
        Map<String, Integer> collect1 = personList.stream().collect(Collectors.toMap(Person::getName, Person::getSalary));
        System.out.println(collect1);
    }
    @Test
    public void filterTest(){
        Stream<Person> personStream = personList.stream().filter(person -> person.getSalary() > 5000);
        personStream.forEach(System.out::println);
    }
    @Test
    public void mapTest() {
        // 映射 可以拿到单独的值
        List<Integer> collect = personList.stream().map(Person::getSalary).collect(Collectors.toList());
        System.out.println(collect);
        Stream<Person> personStream = personList.stream().map(p -> {
            p.setSalary(p.getSalary() + 1000);
            return p;
        });
        personStream.forEach(System.out::println);
    }
    @Test
    public void sortTest() {
        Stream<Person> sorted = personList.stream().sorted(Comparator.comparingInt(Person::getSalary));
        sorted.forEach(System.out::println);
    }
    @Test
    public void peekTest(){
        // 在stream中间进行调试，因为stream不支持debug
        List<Person> collect = personList.stream().filter(p -> p.getSalary() > 5000)
                .peek(System.out::println).collect(Collectors.toList());
        // 修改元素的信息，给每个员工涨工资一千
        personList.stream().peek(p -> p.setSalary(p.getSalary() + 1000))
                .forEach(System.out::println);
    }
    @Test
    public void otherTest(){
        Stream<Person> sorted = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed());
        sorted.limit(3).forEach(System.out::println);

        //  distinct去重
        IntStream skip = IntStream.of(1, 2, 34, 56, 67, 8, 9, 7,7,7).distinct().skip(2);
        skip.forEach(System.out::println);
    }
    // 找出男员工和女员工工资最多的人
    @Test
    public void findSalaryMax(){
        Map<String,Integer> map = new HashMap<>(2);
        Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(Person::getSex));
        System.out.println(collect);
        for (Map.Entry<String,List<Person>> entry : collect.entrySet()){
            String key = entry.getKey();
            Integer salary = entry.getValue().stream().mapToInt(Person::getSalary).max().orElse(0);
            map.put(key,salary);
        }
        System.out.println(map);
    }
}

