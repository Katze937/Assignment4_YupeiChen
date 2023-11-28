/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package moonrover.designpatterntest02;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isabe
 */
public class MoonRoverJUnitTest {
    private Rover rover;

    @Before
    public void setUp() {
        rover = new Rover();
    }

    @Test
    public void testInitialState() {
        assertTrue("Initial state should be AtRest", rover.getCurrentState() instanceof AtRest);
    }

    @Test
    public void testMoveToForward() {
        rover.moveToForward();
        assertTrue("State should be MoveForward after moving forward", rover.getCurrentState() instanceof MoveForward);
    }

    @Test
    public void testMoveToBackward() {
        rover.moveToBackward();
        assertTrue("State should be MoveBackward after moving backward", rover.getCurrentState() instanceof MoveBackward);
    }

    @Test
    public void testRestState() {
        rover.moveToForward(); // Change to a different state
        rover.rest();
        assertTrue("State should be AtRest after resting", rover.getCurrentState() instanceof AtRest);
    }
}
