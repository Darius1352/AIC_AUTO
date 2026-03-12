package org.firstinspires.ftc.teamcode.robo13u;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class motorTest extends LinearOpMode {

    @Override
    public void runOpMode() {
        DcMotorEx leftFront = hardwareMap.get(DcMotorEx.class, "leftFront");
        DcMotorEx leftRear = hardwareMap.get(DcMotorEx.class, "leftRear");
        DcMotorEx rightFront = hardwareMap.get(DcMotorEx.class, "rightFront");
        DcMotorEx rightRear = hardwareMap.get(DcMotorEx.class, "rightRear");

        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        leftRear.setDirection(DcMotorSimple.Direction.REVERSE);
        rightFront.setDirection(DcMotorSimple.Direction.FORWARD);
        rightRear.setDirection(DcMotorSimple.Direction.FORWARD);

        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.square) {
                leftFront.setPower(0.7);
                telemetry.addData("Running Motor: ", "leftFront");
            } else {
                leftFront.setPower(0);
            }

            if (gamepad1.cross) {
                leftRear.setPower(0.7);
                telemetry.addData("Running Motor: ", "leftRear");
            } else {
                leftRear.setPower(0);
            }

            if (gamepad1.triangle) {
                rightFront.setPower(0.7);
                telemetry.addData("Running Motor: ", "rightFront");
            } else {
                rightFront.setPower(0);
            }

            if (gamepad1.circle) {
                rightRear.setPower(0.7);
                telemetry.addData("Running Motor: ", "rightRear");
            } else {
                rightRear.setPower(0);
            }
            telemetry.update();
        }
    }
}