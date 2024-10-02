package app;

public class Customer {
    public static String name;
    public static String phone;

    public Customer(String name, int phone){
        this.name = name;
        this.phone = toString(phone);
    }
    public String getName(){
         return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    public static String toString(int info){
        return String.valueOf(info);
    }
}
