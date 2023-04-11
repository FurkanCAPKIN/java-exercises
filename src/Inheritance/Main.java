package Inheritance;
class animal{
    int number_legs;
    animal (){
        number_legs=2;
        System.out.println("An animal was created");
    }
    void voice(){
        System.out.println("Animal sound");
    }
}

class cat extends animal{

    cat (){
        number_legs=4;
        System.out.println("A cat was created.");
    }
    void sleep(){
        System.out.println("mrrr");
    }

    void voice(){
        System.out.println("Miyav");
    }
}

class dog extends animal{
    double weight;

    dog (){
        number_legs=3;
        System.out.println("A dog was created.");
    }
    void sleep(){
        System.out.println("Zzz");
    }

    void voice(){
        System.out.println("hav");
    }
}
public class Main {
    public static void main(String[] args) {

        cat tekir=new cat();
        tekir.number_legs=4;
        System.out.print("Cat voice: ");
        tekir.voice();
        System.out.println("\n");
        dog karabas=new dog();
        System.out.print("Dog voice: ");
        karabas.voice();

    }
}