public class Main {
    public static void main(String[] args){
       String[] users = {"Ohm", "Idra", "Justin", "Lagcatalyst"};
       // int i = 0 runs the first time through the loop, i < 4 is the condition to keep running the loop and i++ gets run every time the loop runs
       for(int i = 0; i < 4; i++){
        System.out.println(i);
       }
       System.out.println("Authorized users:");
       for(int i = 0; i < users.length; i++){
        System.out.println(users[i]);
       }
       int i = 0;
       while(i < 4){ // So long as the condition is true, this will run infinitely
        System.out.println(i);
        i++;
       }
       do{ // Condition is executed once then stops because the condition is false
        System.out.println("Do loop ran");
       }
       while(false); // Will continue to run infinitely so long as the condition is true
    }
}
