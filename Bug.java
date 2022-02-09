import java.util.List;

public class Bug extends Invertebrate {

    public Bug(List<String> list){
        super(list);  //calls parent constructor
    }
    //overrides parent speak() method and returns its own information
    public String speak(){
        return "I have " + legCount + " legs! " + legCount + " legs best!";
    }
}
