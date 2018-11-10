package com.team980.quickstart;

/**
 * Robot-wide parameters are stored here.
 */
@SuppressWarnings("WeakerAccess")
public final class Parameters {

    // DRIVE SYSTEM
    public static final int LEFT_DRIVE_CONTROLLER_CAN_ID = 0;
    public static final int RIGHT_DRIVE_CONTROLLER_CAN_ID = 1;

    // ENCODERS
    public static final int LEFT_DRIVE_ENCODER_CHANNEL_A = 1;
    public static final int LEFT_DRIVE_ENCODER_CHANNEL_B = 2;
    public static final boolean INVERT_LEFT_DRIVE_ENCODER = false;

    public static final int RIGHT_DRIVE_ENCODER_CHANNEL_A = 3;
    public static final int RIGHT_DRIVE_ENCODER_CHANNEL_B = 4;
    public static final boolean INVERT_RIGHT_DRIVE_ENCODER = false;

    // IMU
    public static final int IMU_CAN_ID = 2;

    // PNEUMATICS
    public static final int PCM_CAN_ID = 3;
    public static final int SHIFTER_SOLENOID_PCM_CHANNEL = 0;

    // JOYSTICKS
    public static final int DRIVE_STICK_ID = 0;
    public static final int DRIVE_WHEEL_ID = 1;
    public static final int XBOX_CONTROLLER_ID = 2;
}
