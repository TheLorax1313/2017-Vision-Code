package org.usfirst.frc.team957.robot;

import edu.wpi.first.wpilibj.Joystick;

public class POVChooser {

	double POVFinal = -1;
	double driveX;
	double driveY;
	Joystick Joy1 = new Joystick(1); //flight stick 1
	Joystick controller1 = new Joystick(0); //controller
	
	public void POVController(){
		double POV = controller1.getPOV();
		POVFinal = POV;
        if(POV == 45 || POV == 225){
        	POVFinal = POV + 45;
        
        }
        if(POV == 135 || POV == 315){
        	POVFinal = POV - 45;
        }
	}
	public void POVJoystick(){
		double POV = Joy1.getPOV();
		POVFinal = POV;
        if(POV == 45 || POV == 225){
        	POVFinal = POV + 45;
        
        }
        if(POV == 135 || POV == 315){
        	POVFinal = POV - 45;
        }
	}
	public void POVProcessor(double POV, double speed){ 
        //left
        if(POV == 90){
        	driveX = speed; 
        }	
        //right
        if(POV == 270){
        	driveX = -speed; 
        }    	
	}
	public double POVFinal() {
		return POVFinal;
	}
	public double driveX() {
		return driveX;
	}
	public double driveY() {
		return driveY;
	}
}

