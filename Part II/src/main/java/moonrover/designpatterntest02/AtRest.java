/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover.designpatterntest02;

/**
 *
 * @author isabe
 */
public class AtRest implements State{
    //@Override
    public void handleRequest(Rover rover) {
    System.out.println("The rover is at rest.");
    }
}
