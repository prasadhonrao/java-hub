public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("51!");

        Vehicle v = new Car();
        System.out.println(v);
    }
}

class Vehicle {
    int x;
    Vehicle() { this(10); }
    Vehicle(int x) { this.x = x;}
}

class Car extends Vehicle {
    int y;
    Car() { 
        // this(20); 
        super(); 
    }
    Car(int y) { 
        this.y = y; 
    }

    public String toString() {
        return super.x + ":" + this.y;
    }
}