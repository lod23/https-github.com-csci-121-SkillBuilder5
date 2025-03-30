
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    // TODO - replace this line with instruction from step 1
    public static final int DEFAULT_POWER = 10; // Static field

    // instance variables
    private int power;
    private String name;
    // TODO - replace this line with instruction from step 2
    // TODO - replace this line with instruction from step 3


    // constructors

    // TODO - replace this line with instruction from step 4
    public PowerPill(String name) {
        this.name = name;
        this.power = DEFAULT_POWER;
    }

    // TODO - replace this line with instruction from step 5
    public PowerPill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // accessor methods

    // TODO - replace this line with instruction from step 6
    public int getPower(){
        return power;
    }
    public String getName(){
        return name;
    }

    // mutator methods

    // TODO - replace this line with instruction from step 7
    public void setPower(int power){
        this.power = power;
    }
    public void setName(String name){
        this.name = name;
    }


    // toString method
    // TODO - replace this line with instruction from step 8
    @Override
    public String toString(){
        return "Power " + " = " + power;
    }
}