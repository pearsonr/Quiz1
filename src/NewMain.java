
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    City KW = new City();
    Robot karel = new Robot(KW,4,0,Direction.EAST);
    
    new Wall(KW, 4, 2, Direction.WEST);
    new Wall(KW, 4, 2, Direction.NORTH);
    new Wall(KW, 3, 3, Direction.WEST);
    new Wall(KW, 3, 3, Direction.NORTH);
    new Wall(KW, 2, 4, Direction.WEST);
    new Wall(KW, 2, 4, Direction.NORTH);
    new Wall(KW, 2, 5, Direction.NORTH);
    new Wall(KW, 2, 5, Direction.EAST);
    new Wall(KW, 3, 6, Direction.NORTH);
    new Wall(KW, 3, 6, Direction.EAST);
    new Wall(KW, 4, 7, Direction.EAST);
    new Wall(KW, 4, 7, Direction.NORTH);
    
    new Thing(KW,4,1);
    new Thing(KW,3,2);
    new Thing(KW,2,3);
    new Thing(KW,1,4);
    
    karel.move();
    karel.pickThing();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.pickThing();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.pickThing();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.pickThing();
    karel.move();
    karel.putThing();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.putThing();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.putThing();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.putThing();
    karel.turnLeft();
    karel.move();
    
    
    
    
    
    
    
    }
}

