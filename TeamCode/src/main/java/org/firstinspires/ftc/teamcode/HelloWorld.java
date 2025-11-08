package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled// Make the programme exist in the folder but remove it from the list of the robot controller
//@Autonomous//Run in the autonomous section
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello","World");//expected semi-comma
        //telemetry.addData("Hello","XHY");//the case which put your name here
    }
    //initialization:all the things you need for "Hello:World" is included in this section

    @Override
    public void loop() {

    }
    //You could put nothing in the loop in this case
    /*
    This is the comment of several lines
    See?
     */
}
