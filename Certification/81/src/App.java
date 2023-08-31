public class App {

    int x;
    int y;
    public void doStuff(int x, int y){
        x = x;
        y = this.y;
    }

    public void display(){
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("81!");

        App app1 = new App();
        app1.x = 100;
        app1.y = 200;

        App app2 = new App();
        app2.doStuff(app1.x, app1.y);

        app1.display();
        app2.display();
    }
}
