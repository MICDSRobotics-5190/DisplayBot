package org.firstinspires.ftc.teamcode.teleops;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.util.Log;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.R;
import org.firstinspires.ftc.teamcode.libs.AudioSample;
import org.firstinspires.ftc.teamcode.robotplus.gamepadwrapper.Controller;

import java.io.IOException;
import java.util.ResourceBundle;

/*
This code is written as an example only.
Obviously, it was not tested on your team's robot.
Teams who use and reference this code are expected to understand code they use.
If you use our code and see us at competition, come say hello!
*/
@TeleOp(name = "Audio Tester")
public class AudioTester extends OpMode {
    MediaPlayer player;
    Controller gamepad;

    @Override
    public void init() {
        this.gamepad = new Controller(gamepad1);
        this.player = MediaPlayer.create(hardwareMap.appContext, R.raw.thewordofkodak);
    }

    @Override
    public void loop() {
        if (gamepad1.a){
            if (!player.isPlaying()) {
                player.start();
            }
            else {
                player.pause();
            }
        }
    }
}