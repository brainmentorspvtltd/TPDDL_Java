class StringBufferDemo{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //StringBuffer sb = new StringBuffer();
       // StringBuffer sb2 = new StringBuffer(100);
        System.out.println(sb.capacity()+"  "+sb.length());
        sb.append("Hello");
        sb.append("Ok"); 
        //sb.ensureCapacity(2000);
        System.out.println(sb.capacity()+"  "+sb.length());
        sb.append("hfgsdjkghjkfhgkkghkhgkjkghhkfdgkh");
        System.out.println(sb.capacity()+"  "+sb.length());
        sb.append("hf");
        System.out.println(sb.capacity()+"  "+sb.length());
    }
}