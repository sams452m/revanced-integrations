package app.revanced.integrations.patches.utils;

import static app.revanced.integrations.utils.ReVancedHelper.setBuildVersion;

import app.revanced.integrations.settings.SettingsEnum;
import app.revanced.integrations.sponsorblock.PlayerController;

public class FirstRun {

    public static void initializationSB() {
        if (SettingsEnum.SB_FIRSTRUN.getBoolean()) return;

        // set dummy video-id to initialize Sponsorblock: TeamVanced's Sponsorblock tutorial (https://www.youtube.com/watch?v=sE2IzSn-hHU)
        PlayerController.setCurrentVideoId("sE2IzSn-hHU");
        SettingsEnum.SB_FIRSTRUN.saveValue(true);
    }

    public static void initializationRVX() {
        setBuildVersion();
    }

}