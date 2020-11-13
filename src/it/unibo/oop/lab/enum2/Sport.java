/**
 * 
 */
package it.unibo.oop.lab.enum2;
import static it.unibo.oop.lab.enum2.Place.*;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(5,"vasket", INDOOR ),
	VOLLEY(6,"volley", INDOOR ),
	TENNIS(2,"tennis", INDOOR ),
	BIKE(1,"bike", OUTDOOR),
	F1(1,"formula 1", OUTDOOR),
	MOTOGP(1, "moto GP", OUTDOOR),
	SOCCER(11,"soccer",OUTDOOR);
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int player;
	private final String name;
	private final Place place;
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport(int player, String name, Place place) {
		this.player = player;
		this.name = name;
		this.place = place;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport() {
		return this.player==1;
	}
	
	public boolean isIndoorSport() {
		return this.place==INDOOR;
	}
	
	public Place getPlace() {
		return this.place;
	}

	public String toString() {
		return "Sport [player=" + player + ", name=" + name + ", place=" + place + "]";
	}	
}
