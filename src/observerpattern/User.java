package observerpattern;

public class User {
    public String name;
    User(String name){
        this.name=name;
    }

    public void update(String msg,String userName){
        System.out.println(msg+" - "+userName );
    }
}
