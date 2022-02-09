import java.util.List;

public class Reptile extends Vertebrate {

    public Reptile(List<String> list){
        super(list); //calls parent constructor
    }

    public String speak(){
        return super.speak() + " Scaly legs."; //calls parent method and adds extra info
    }
}
