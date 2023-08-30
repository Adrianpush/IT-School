package session10.livepractice;

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
