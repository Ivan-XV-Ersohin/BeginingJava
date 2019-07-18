package hello;

public class Hello{
    private String userName;
    private String greetingWord;
    public Hello(String userName) {
        this.userName = userName;
    }

    public void print() {
        System.out.println(userName);
    } 
    public void askName(){
        System.out.println("Как Вас зовут?");
        System.in.read(userName);
    }
    public void greeting(){
        this.setGreetingWord();
        System.out.println(greetingWord + userName);
    }
    private void setGreetingWord(){
        switch (System.)
    }
}
