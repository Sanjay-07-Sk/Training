class SampleThread1 extends Thread{
    String name;
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("name" + i);
        }
    }
    SampleThread1(String name){
        this.name = name;
    }
}


public class Concurrencythread {
    public static void main(String[] args) {
        SampleThread1 s1 = new SampleThread1("Task1");
        SampleThread1 s2 = new SampleThread1("Task2");
        s1.start();
        s2.start();
    }
}