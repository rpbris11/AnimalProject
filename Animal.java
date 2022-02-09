
//the parent of all the other classes here (barring RBAnimalProject)


public abstract class Animal {
    //these values are all taken from the csv file
    protected String animal_name;
    protected boolean hasHair;
    protected boolean hasFeathers;
    protected boolean laysEggs;
    protected boolean producesMilk;
    protected boolean flies;
    protected boolean swims;
    protected boolean venomous;
    protected boolean hasFins;
    protected int legCount;
    protected boolean hasTail;

    //based upon the provided values for each animal, this method returns a string containing all the data
    //that is true for the given animal

    /**
     *
     * @return String
     */
    public String toString() {
        //returns string containing all data from the object
        String r = "";
        if(hasHair){
            r+= "It has hair. \n";
        }
        if(hasFeathers){
            r+= "It has feathers. \n";
        }
        if(laysEggs){
            r+= "It lays eggs. \n";
        }
        if(producesMilk){
            r+= "It produces milk. \n";
        }
        if(flies){
            r+= "It flies. \n";
        }
        if(swims){
            r+= "It swims. \n";
        }
        if(venomous){
            r+= "It is venomous. \n";
        }
        if(hasFins){
            r+= "It has fins. \n";
        }
        if(hasTail){
            r+= "It has a tail. \n";
        }
        return r;
    }
    //overloaded method that allows the user to decide what the animal says in it's quote

    /**
     *
     * @param str
     * @return String
     */
    public String speak(String str) {
        //returns "the animal says str"
        return str;
    }
    //abstract method that is defined by the subclasses based upon each one's unique features
    public abstract String speak();

    //a series of get methods that allow other classes to access the animal's data
    public String getName() {
        return animal_name;
    }
    public boolean getHasHair() {
        return hasHair;
    }
    public boolean getHasFeathers() {
        return hasFeathers;
    }
    public boolean getLaysEggs() {
        return laysEggs;
    }
    public boolean getProducesMilk() {
        return producesMilk;
    }
    public boolean getFlies() {
        return flies;
    }
    public boolean getSwims() {
        return swims;
    }
    public boolean getVenomous() {
        return venomous;
    }
    public boolean getHasFins() {
        return hasFins;
    }
    public int getLegCount() {
        return legCount;
    }
    public boolean getHasTail() {
        return hasTail;
    }
}

