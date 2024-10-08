public class Main {
    public static void main(String[] args){
        int num = 2;
        int num2 = 3;
        if(true){
            // If expression is true do this
            System.out.println("True");
        }
        else{
            // If expression is false do this
            System.out.println("False");
        }
        if(num < 0){
            // If number is less than 0
            System.out.println("Number is negative");
        }
        // This condition is only checked if the above condition is false
        else if(num > 5){
            // If number is greater than 5
            System.out.println("Number is bigger than 5");
        }
        // If all above conditions fail,
        else{
            System.out.println("Number is between 0-5");
        }
        if(num == num2){
            // If numbers are equal to each other
            System.out.println("Numbers are the same");
        }
        else{
            // If numbers are not equal to each other
            System.out.println("Numbers are not the same");
        }
        if(!true){
            // ! operator inverts the condition, making true false and false true
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        switch(num){ // condition
            // If num == 0
            case 0:
            System.out.println("Number is 0");
            break; // stop checking further cases after a match for performance reasons
            case 1:
            System.out.println("Number is 1");
            break;
            case 2:
            System.out.println("Number is 2");
            break;
            default:
            System.out.println("Number is not 0,1 or 2");
        }
        switch(num2){
            case 0:
            System.out.println("Number is 0");
            break;
            case 1:
            System.out.println("Number is 1");
            break;
            case 2:
            System.out.println("Number is 2");
            break;
            default:
            System.out.println("Number is not 0,1 or 2");
        }
    }
}
