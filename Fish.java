import java.util.List;

public class Fish extends Vertebrate {

    public Fish(List<String> list){
        super(list); //calls parent constructor
    }

    public String speak(){
        return "    Quote: Glug glug."; //doesn't want the parent speak() method so it does it's own thing
    }
}
