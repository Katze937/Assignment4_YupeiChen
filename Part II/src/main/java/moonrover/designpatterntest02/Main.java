/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package moonrover.designpatterntest02;

/**
 *
 * @author isabe
 */
public class Main {

    public static void main(String[] args) {
        Rover rover = new Rover();

        rover.applyState(); // At rest
        rover.moveToForward();
        rover.applyState(); // Moving forward
        rover.moveToBackward();
        rover.applyState(); // Moving backward
        rover.rest();
        rover.applyState(); // At rest again
    }
}
