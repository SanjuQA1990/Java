package EX_07_11_24_Inheritance.Example2;

public class SonClass extends FatherClass {
    int num = 10;
    void print(){
        System.out.println("SonClass");
        printFather();
    }

}
