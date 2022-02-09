import java.util.List;

public class Mammal extends Vertebrate {

    public Mammal(List<String> list){
        super(list); //calls parent constructor
    }

    public String speak(){
        return super.speak(); //nothing special happening here so it just uses the parent speak() method
    }

}
