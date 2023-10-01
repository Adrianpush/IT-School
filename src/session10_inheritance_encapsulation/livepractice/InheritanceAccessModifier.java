package session10_inheritance_encapsulation.livepractice;

public class InheritanceAccessModifier {

}

class Athlete {

    protected int age;

    protected void setAge(int age){
        this.age = age;
    }
}

class Runner extends Athlete {

    public int getAge(){
        return super.age;
    }
}

class Cyclist extends Athlete {

}
