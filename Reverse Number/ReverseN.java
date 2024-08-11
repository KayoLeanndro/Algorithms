import java.text.ParseException;

public class ReverseN{
    public static void main(String[] args) {
        System.out.println(reverseWithoutOverFlow(-502));
        System.out.println(reverseWithOverFlow(1234567891));
    }

    //Resolução sem a tratação de overFlow
    public static int reverseWithoutOverFlow(int x){
        
        int reverseNumber = 0;
        boolean xIsNegative = x < 0;

        String str = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(str).reverse();
        
        try{
            reverseNumber = Integer.parseInt(sb.toString());
        }catch(NumberFormatException e){
            return 0;
        }
        
        return xIsNegative ? -reverseNumber : reverseNumber;

    }

    //Resolução com a tratação de overFlow
    public static int reverseWithOverFlow(int x){
        int reverseNumber = 0;
        boolean xIsNegative = x < 0;

        int number = Math.abs(x); //100

        while(number != 0){
            int digit = number % 10; //10
            number /= 10; 

            //Verifica se contém overflow
            if(reverseNumber > (Integer.MAX_VALUE - digit) / 10){
                return 0; //Oveflow
            }

            reverseNumber = reverseNumber * 10 + digit;

        }
        return xIsNegative ? -reverseNumber : reverseNumber;
    }
}