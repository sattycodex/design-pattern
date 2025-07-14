package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class PythonChannel implements Channel{
    List<User> userList;

    PythonChannel(){
        this.userList=new ArrayList<>();
    }
    @Override
    public void subscribe(User user) {
        userList.add(user);
    }

    @Override
    public void unsubscribe(User user) {
        userList.remove(user);
    }

    @Override
    public void sendNotification(String msg) {
        for(var user:userList){
            user.update(msg,user.name);
        }
    }

    public void addVideo(String msg){
        sendNotification(msg);
    }
}
