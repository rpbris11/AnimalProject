import java.util.List;

//parent class of Bug and OtherInvertebrate
public class Invertebrate extends Animal {

    //receives list of String values from csv. Stores them in relevant variable
    public Invertebrate(List<String> list){
        animal_name = list.get(0);
        hasHair = hasFeathers = laysEggs = producesMilk = flies = swims = hasFins = hasTail = false;
        if(list.get(1).equals("1")){
            hasHair = true;
        }
        if(list.get(2).equals("1")){
            hasFeathers = true;
        }
        if(list.get(3).equals("1")){
            laysEggs = true;
        }
        if(list.get(4).equals("1")){
            producesMilk = true;
        }
        if(list.get(5).equals("1")){
            flies = true;
        }
        if(list.get(6).equals("1")){
            swims = true;
        }
        if(list.get(7).equals("1")){
            venomous = true;
        }
        if(list.get(8).equals("1")){
            hasFins = true;
        }
        legCount = Integer.parseInt(list.get(9)); //String to int conversion
        if(list.get(10).equals("1")){
            hasTail = true;
        }
    }
    //accessor methods
    public String getName(){ return animal_name; }
    public boolean getHasHair(){ return hasHair; }
    public boolean getHasFeathers(){ return hasFeathers; }
    public boolean getLaysEggs(){ return laysEggs; }
    public boolean getProducesMilk(){ return producesMilk; }
    public boolean getFlies(){ return flies; }
    public boolean getSwims(){ return swims; }
    public boolean getVenomous(){ return venomous; }
    public boolean getHasFins(){ return hasFins; }
    public int getLegCount(){ return legCount; }
    public boolean getHasTail(){ return hasTail; }

    //overrides speak() from Animal
    public String speak(){return "";}
}
