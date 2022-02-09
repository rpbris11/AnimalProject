import java.util.List;

public class OtherInvertebrate extends Invertebrate {

    public OtherInvertebrate(List<String> list){
        super(list); //calls parent constructor
    }

    //overrides parent speak() method and does its own thing
    public String speak(){
        String r = "    Quote: Legs??? I have no need!";
        if(legCount > 0){
            r += " Oh wait, I have " + legCount + "!";
        }
        return r;
    }
}
