package singleton;

public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            DatabaseConnection conn=DatabaseConnection.getInstance();
            System.out.println(Thread.currentThread().getName()+" : "+ conn.hashCode());
        });
        Thread t2=new Thread(()->{
            DatabaseConnection conn=DatabaseConnection.getInstance();
            System.out.println(Thread.currentThread().getName()+" : "+conn.hashCode());
        });

        t1.start();
        t2.start();
    }
}
