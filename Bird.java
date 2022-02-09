import java.util.List;

public class Bird extends Vertebrate {

    public Bird(List<String> list){
        super(list); //calls parent constructor
    }

    //overrides Vertebrate speak() method.
    public String speak(){
        return super.speak() + " But have wings."; //calls the speak() method from it's parent class and adds something
    }
}
