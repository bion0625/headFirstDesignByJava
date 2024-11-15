package ch06;

import ch06.hottub.Hottub;
import ch06.hottub.HottubOffCommand;
import ch06.hottub.HottubOnCommand;
import ch06.light.Light;
import ch06.light.LightOffCommand;
import ch06.light.LightOnCommand;
import ch06.stereo.Stereo;
import ch06.stereo.StereoOff;
import ch06.stereo.StereoOnWithCDCommand;
import ch06.tv.TV;
import ch06.tv.TVOnCommand;
import ch06.tv.TvOffCommand;

public class RemoteLoader {
    public static void main(String[] args) {
//        RemoteControl remoteControl = new RemoteControl();
//
//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//        CeillingFan ceillingFan = new CeillingFan("Living Room");
//        GarageDoor garageDoor = new GarageDoor("Garage");
//        Stereo stereo = new Stereo("Living Room");
//
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//
//        CeillingFanOnCommand ceillingFanOn = new CeillingFanOnCommand(ceillingFan);
//        CeillingFanOffCommand ceillingFanOff = new CeillingFanOffCommand(ceillingFan);
//
//        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
//        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
//
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOff stereoOff = new StereoOff(stereo);
//
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, ceillingFanOn, ceillingFanOff);
//        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
//
////        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
////        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
////        remoteControl.setCommand(2, ceillingFan::on, ceillingFan::off);
////        remoteControl.setCommand(3, () -> {
////            stereo.on();
////            stereo.setCD();
////            stereo.setVolume(11
////            );}, stereo::off);
//
//        System.out.println(remoteControl);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);

//        RemoteControl remoteControl = new RemoteControl();
//
//        Light livingRoomLight = new Light("Living Room");
//
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//        System.out.println(remoteControl);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

//        RemoteControl remoteControl = new RemoteControl();
//
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//
//        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
//        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
//        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOff stereoOffWithCD = new StereoOff(stereo);
        TvOffCommand tvOff = new TvOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOnWithCD, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOffWithCD, tvOff, hottubOff};

        MacroCommand macroOn = new MacroCommand(partyOn);
        MacroCommand macroOff = new MacroCommand(partyOff);

        remoteControl.setCommand(0, macroOn, macroOff);

        System.out.println(remoteControl);
        System.out.println("---------- 매크로 ON ----------");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---------- 매크로 OFF ----------");
        remoteControl.offButtonWasPushed(0);
        System.out.println("---------- 매크로 UNDO ----------");
        remoteControl.undoButtonWasPushed();
    }
}
