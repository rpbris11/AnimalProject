import java.util.List;

public class Amphibian extends Vertebrate {

    public Amphibian(List<String> list){
        super(list); //calls parent constructor
    }

    public String speak(){
        //calls the speak() method from it's parent class and adds something
        String r = super.speak();
        if(hasTail){
            r += " Has a tail.";
        }
        return r;
    }
}
