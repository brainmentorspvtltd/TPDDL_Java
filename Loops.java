class Loops{
    public static void main(String[] args) {
        String [] fruits= {"Orange","Apple","Mango"};
        // for(int i = 0; i<fruits.length;i++){
        //     System.out.println(fruits[i]);
        // }
        // Enhance for loop (Java 1.5)
        int a = 10;
        if(a==10){  // if(true)

        }
        else if(a>10){
            
        }
        switch(a){
            default:

            case 1:
            case 2:
        }
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        outer:
        for(int i = 1;i<=3; i++){
            xyz:
            for(int j = 1; j<=3; j++){
                if(i==j){
                    continue outer;
                    // break outer;
                }
                else{
                    System.out.println("I is "+i+" and J is "+j);
                }
            }
        }
    }
}