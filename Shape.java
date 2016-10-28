
/**
 * Write a description of class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Object.Location;

public class Shape
implements Location
{
    // instance variables - replace the example below with your own
    private int damage,hp, speed, range, cost;

    /**
     * Constructor for objects of class Shape
     */
    public Shape(int d, int h, int s, int r, int c)
    {
        // initialise instance variables
        damage = d;
        hp = h;
        speed = s;
        range = r;
        cost = c;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getDamage()
    {
        return damage;
    }
    
    public int getHp()
    {
        return hp;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int getRange()
    {
        return range;
    }
    
    public int getCost()
    {
        return cost;
    }
    
}
