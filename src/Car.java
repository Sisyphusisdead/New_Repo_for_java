public class Car {
    String brand;
    int year;

    Car(){
        brand = "Default";
        year = 0;
    }
    Car(String b, int y){
        brand = b;
        year = y;
    }
    Car(String b){
        brand = b;
    }
    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
