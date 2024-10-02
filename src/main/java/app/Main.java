package app;

public class Main {

    public static void main(String[] args) {
//        Customer customer = getCustomer(getData());
        Customer customer = new Customer("Alex", 5555);
        String output = "Customer: " + customer.getName() + ", phone " + customer.getPhone();
        getOutput(output);
    }

//    public static String[] getData() {
//        return new String[]{
//            Customer.name =  "фвімсвмс",
//            Customer.phone = 555
//        };
//    }

//    public static  Customer getCustomer(String[] data) {
//        return new Customer(data[0], data[1]);
//    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
