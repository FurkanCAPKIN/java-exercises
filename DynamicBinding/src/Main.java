public class Main {
    public static void main(String[] args) {

        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());

    }
    public static void m(Object object){
        System.out.println(object.toString());
    }
}

class Person extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}
class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class GraduateStudent extends Student {

}

