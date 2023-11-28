/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover.designpatterntest02;

/**
 *
 * @author isabe
 */
public class Rover {
    private State currentState;

    public Rover() {
        currentState = new AtRest(); // Initial state
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void applyState() {
        currentState.handleRequest(this);
    }

    // Methods to transition to specific states
    public void moveToForward() {
        setState(new MoveForward());
    }

    public void moveToBackward() {
        setState(new MoveBackward());
    }

    public void rest() {
        setState(new AtRest());
    }
    
    public State getCurrentState() {
        return currentState;
    }
}
