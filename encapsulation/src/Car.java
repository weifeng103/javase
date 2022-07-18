public class Car {
    String type;
    String color;
    long length;
    public Car(){

    }
    public Car(String type2, String color2, long length2) {
        type = type2;
        color = color2;
        length = length2;
    }
public void run(){
    Car benchi = new Car();
    benchi.color = "red";
    benchi.type = "奔驰";
    benchi.length = 4321L;

    Car baoma = new Car();
    baoma.color = "green";
    baoma.type = "宝马";
    baoma.length = 4321L;

    Car []car = new Car[]{benchi,baoma};
    for (int i = 0; i < car.length; i++) {
        System.out.println(car[i].color);

    }
}
public void run(int gasoline){
    System.out.printf("您加了%d号汽油"+"\n",gasoline);
   if (gasoline==92){
       System.out.println("92号汽油跑的很快！");
   }else if(gasoline==95){
       System.out.println("95号汽油跑的更猛！");
    }else {
       System.out.println("你加的的是柴油吧！");
   }
}
public boolean running(){
    double random=Math.random();
    if(random>=0.5){
        System.out.println("车子正常运行！");
        return true;
    }else {
        System.out.println("车子坏掉了！");
        return false;
    }
}
    public static void main(String[] args) {
        Car car=new Car();
        car.run();
        car.run(98);
        boolean flag = car.running();
        if(flag==true){
            System.out.println("接妹子去酒店！");
        }else {
            System.out.println("洗洗睡吧！");
        }
    }
}
