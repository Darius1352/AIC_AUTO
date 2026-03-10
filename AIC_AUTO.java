package org.firstinspires.ftc.teamcode.robo13u;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@Autonomous(name = "AIC_AUTO")
public class AIC_AUTO extends LinearOpMode {

    private DcMotorEx leftFront;
    private DcMotorEx leftRear;
    private DcMotorEx rightFront;
    private DcMotorEx rightRear;
    private DcMotorEx intakeMotor;
    //private DcMotorEx intakeMotor2;


    @Override
    public void runOpMode() {
        leftFront = hardwareMap.get(DcMotorEx.class, "leftFront");
        leftRear = hardwareMap.get(DcMotorEx.class, "leftRear");
        rightFront = hardwareMap.get(DcMotorEx.class, "rightFront");
        rightRear = hardwareMap.get(DcMotorEx.class, "rightRear");

        intakeMotor = hardwareMap.get(DcMotorEx.class, "intakeMotor");
        //intakeMotor2 = hardwareMap.get(DcMotorEx.class, "intakeMotor2");

        //leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        //leftRear.setDirection(DcMotorSimple.Direction.REVERSE);
        //rightFront.setDirection(DcMotorSimple.Direction.FORWARD);
        //rightRear.setDirection(DcMotorSimple.Direction.FORWARD);

        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        telemetry.addLine("Waiting for Init...");
        telemetry.update();

        waitForStart();

        if(opModeIsActive()) {

            telemetry.addLine("Started");
            telemetry.update();

            sleep(12000);

            leftFront.setPower(0.25);

            sleep(1000);

            outtake();

            sleep(15000);

            leftFront.setPower(0.5);
            leftRear.setPower(-0.5);
            rightFront.setPower(-0.5);
            rightRear.setPower(0.5);

            sleep(800);

            leftFront.setPower(0);
            leftRear.setPower(0);
            rightFront.setPower(0);
            rightRear.setPower(0);

            telemetry.addLine("Finished");
            telemetry.update();
        }

    }

    private void outtake(){

        intakeMotor.setPower(-0.5);
        //intakeMotor2.setPower(-0.5);
    }

}
