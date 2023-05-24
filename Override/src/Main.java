class GrandFather{

    GrandFather(){
        System.out.println("GrandFather's parameterless constructors");
    }

    GrandFather(int age){
        System.out.println("GrandFather's parametre constructors");
    }

    public String thoughtsAboutSmoking(){
        return "Smoking is healthy for us";
    }
}

class Father extends GrandFather{

    Father(){
        System.out.println("Father's parameterless constructors");
    }

    Father(int age){
        System.out.println("Father's parametre constructors");
    }

    @Override
    public String thoughtsAboutSmoking(){
        return "Smoking is not healthy for us";
    }
}

class Child extends Father{

    Child(){
        System.out.println("Child's parameterless constructors");
    }

    Child(int age){
        System.out.println("Child's parametre constructors");
    }

    @Override
    public String thoughtsAboutSmoking(){
        return "smoking is very harmful";
    }
}

public class Main {
    public static void main(String[] args) {

        Child child = new Child();

    }
}