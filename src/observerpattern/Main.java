package observerpattern;

public class Main {
    public static void main(String[] args) {
        User user1=new User("satyam");
        User user2=new User("shivam");
        User user3=new User("Ayush");
        User user4=new User("Pushpendra");
        User user5=new User("Himanshu");

        JavaChannel javaChannel=new JavaChannel();
        javaChannel.subscribe(user1);
        javaChannel.subscribe(user3);

        PythonChannel pythonChannel=new PythonChannel();
        pythonChannel.subscribe(user2);
        pythonChannel.subscribe(user4);
        pythonChannel.subscribe(user5);

        pythonChannel.addVideo("Machine learning playlist added");
        javaChannel.addVideo("Multithreading video added please watch and enjoy");

        pythonChannel.unsubscribe(user5);
        pythonChannel.addVideo("Generative AI course released....");

    }
}
