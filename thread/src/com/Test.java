package com;

/**
 * @author 64383
 */
public class Test {

        public static void main(String[] args) {
            Thread t1 = new Thread(() -> {
                int count = 10;
                Thread t2 = new Thread(() -> {
                    while (true){
                        ThreadUtils.sleep(300);
                        System.out.println("���Ǹ��ػ��̣߳�");
                    }
                });
                t2.setDaemon(true);
                t2.start();

                while (count >= 0){
                    ThreadUtils.sleep(200);
                    System.out.println("�����û��̣߳�");
                    count--;
                }
                System.out.println("�û��߳̽���-------------------");
            });
            t1.setDaemon (true);
            t1.start();
        }

    }


