class StringDemo{
    public static void main(String[] args) {
        

        String x = "Ok";
        x = "Hello";
        System.out.println(x);

        String name = "Amit".intern();
        String name2="Amit".intern();
        String name3 = new String("Amit").intern();
        System.out.println(name==name2);
        System.out.println(name==name3); // Reference compare
        System.out.println(name.equals(name3)); // Value compare case sensitive
        System.out.println("AMIT".equalsIgnoreCase("amit"));    
    }
}