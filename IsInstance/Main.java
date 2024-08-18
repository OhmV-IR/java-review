public class Main{
    public static void main(String[] args) {
        Class2 classInstance = new Class2("hello");
        if(Class2.class.isInstance(classInstance)){
            System.out.println("Class instance is a instance of the class!!!");
        }
    }
}
class Class2{
    final String word;
    Class2(String word){
        this.word = word;
    }
}