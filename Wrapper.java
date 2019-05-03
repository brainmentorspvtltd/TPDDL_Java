import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Locale;
// import java.lang.*;
class Wrapper{
    public static void main(String[] args) {
        double salary = 9000;
        Locale locale = new Locale("hi", "IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
       String sal =  nf.format(salary);
       System.out.println("Sal is "+sal);
        BigDecimal bd;
        byte r1 = (byte)130;
        System.out.println("Byte is "+r1);
        BigInteger bi = new BigInteger("10000000000000000");
        BigInteger bi2 = new BigInteger("20000000000000000");
        BigInteger b3 = bi.add(bi2);
        System.out.println("Big Add is " +b3);
        LinkedList list = new LinkedList();
        int x = 100;  
        String t = String.valueOf(x);  
        // valueOf take Primitive and give String
        int z  = 100;
        short g = (short) x;  // TypeCasting
        System.out.println(x==z); // Value Compare
        Integer y = 200;
        System.out.println(Integer.toBinaryString(130));
        System.out.println(Integer.toHexString(130));
        String b = y.toString();
        Integer y2 = 200;
        System.out.println(y==y2); // Reference compare
        System.out.println(y.intValue()==y2.intValue());
        //xxxValue() methods
        short r = y.shortValue();
        System.out.println(y.shortValue()==y2.shortValue());
        float t1 = 90.20F;
        Float bb = 90.20F;
        byte m1 = 90;
        Byte m2 = 90;

    }
}