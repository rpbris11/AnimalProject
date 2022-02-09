
import java.io.*;
import java.util.*;

/* Java project that reads data from a CSV file, stores them in an ArrayList of Animal objects,
and, based upon user input, can print out information regarding each entry either to the console or
to the designated output file.

COSC 310, 9/25/2021 - Ryan Brisbane
 */
public class RBAnimalProject {

    //this method
    private List<String> getLines(String line){
        List<String> values = new ArrayList<String>();
        try(Scanner rowReader = new Scanner(line)){
            rowReader.useDelimiter(",");
            while(rowReader.hasNext()){
                values.add(rowReader.next());
            }
        }
        return values;
    }

    /**
     * @param args
     */
    public static void main(String[] args){
        RBAnimalProject test = new RBAnimalProject();
        //This list of lists takes each row from the csv file, turns it into a list of strings,
        //and is stored within the bigger list.
        List<List<String>> inputFile = new ArrayList<>();
        //This try/catch block reads the data from the provided csv file and stores it in an ArrayList
        try{
            Scanner read = new Scanner(new File("zoo_animals.csv"));
            while(read.hasNextLine()){
                inputFile.add(test.getLines(read.nextLine()));
            }
        }catch(IOException e){
            System.err.println(e);
        }
        inputFile.remove(0); //removes the column headers of the csv files
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        //loops through all the rows of the csv file and creates the appropriate object based upon the class_type
        for(List<String> l: inputFile){
            switch(l.get(11)){
                case "1":
                    zoo.add(new Mammal(l));
                    break;
                case "2":
                    zoo.add(new Bird(l));
                    break;
                case "3":
                    zoo.add(new Reptile(l));
                    break;
                case "4":
                    zoo.add(new Fish(l));
                    break;
                case "5":
                    zoo.add(new Amphibian(l));
                    break;
                case "6":
                    zoo.add(new Bug(l));
                    break;
                case "7":
                    zoo.add(new OtherInvertebrate(l));
            }
        }

        HashMap<String, Animal> map = new HashMap<>();
        for(Animal a: zoo){
            map.put(a.getName(), a);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Welcome!\n");
        String input;
        //here begins the user input section now that the objects are created and stored
        do{
            System.out.print("What action would you like to perform? (To see a list of commands enter ?): ");
            input = in.nextLine();
            boolean animalExists = map.containsKey(input);
            //based on input, a series of commands
            if(input.equalsIgnoreCase("all")){
                //writes all the animals and associated information to the designated output file
                try{
                    FileWriter output = new FileWriter("animal_farm.txt");
                    for(Animal a: zoo){
                        output.write("The " + a.getName() + " is type " + a.getClass().getSimpleName() + "\n");
                        output.write(a.toString() + a.speak() + "\n\n");
                        }
                    output.close();
                }catch(IOException e){
                    System.err.println(e);
                }
                System.out.println("File successfully edited.");
            }
            //presents the list of commands to the user
            else if(input.equals("?")){
                System.out.println("all - write all animals to an output text file");
                System.out.println("who - prints the program name and program creator name");
                System.out.println("<animal name> - prints information about an animal");
                System.out.println("? - see this list of commands");
                System.out.println("exit - terminates the program\n");
            }
            //presents the project name and creator (hello!) to the user
            else if(input.equalsIgnoreCase("who")){
                System.out.println("RBAnimalProject - written by Ryan Brisbane\n");
            }
            //runs through every animal in the ArrayList, checking if the name matches
            //if it does, the associated information for that animal is shown. if not, an error message shows
            else if(animalExists) {
                for (Animal a : zoo) {
                    if (input.equalsIgnoreCase(a.getName())) {
                        System.out.println("The " + input + " is type " + a.getClass().getSimpleName() + "...");
                        System.out.print(a.toString());
                        System.out.println(a.speak() + "\n");
                    }
                }
            }else if(!input.equals("all") && !input.equals("?") && input.equals("who") && !input.equals("exit") && !animalExists)
                System.out.println("Error: Command or Animal not found. Try again.");
            //exit condition
        }while(!input.equals("exit"));
        System.out.println("Thank you and have a nice day!");
    }
}
