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
    benchi.type = "����";
    benchi.length = 4321L;

    Car baoma = new Car();
    baoma.color = "green";
    baoma.type = "����";
    baoma.length = 4321L;

    Car []car = new Car[]{benchi,baoma};
    for (int i = 0; i < car.length; i++) {
        System.out.println(car[i].color);

    }
}
public void run(int gasoline){
    System.out.printf("������%d������"+"\n",gasoline);
   if (gasoline==92){
       System.out.println("92�������ܵĺܿ죡");
   }else if(gasoline==95){
       System.out.println("95�������ܵĸ��ͣ�");
    }else {
       System.out.println("��ӵĵ��ǲ��Ͱɣ�");
   }
}
public boolean running(){
    double random=Math.random();
    if(random>=0.5){
        System.out.println("�����������У�");
        return true;
    }else {
        System.out.println("���ӻ����ˣ�");
        return false;
    }
}
    public static void main(String[] args) {
        Car car=new Car();
        car.run();
        car.run(98);
        boolean flag = car.running();
        if(flag==true){
            System.out.println("������ȥ�Ƶ꣡");
        }else {
            System.out.println("ϴϴ˯�ɣ�");
        }
    }
}
