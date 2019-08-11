package com.sg.template.utils.utils;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

public class PermissionUtil {
    public static final String ACCESS_CHECKIN_PROPERTIES = "android.permission.ACCESS_CHECKIN_PROPERTIES";
    public static final String ACCESS_COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION";
    public static final String ACCESS_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
    public static final String ACCESS_LOCATION_EXTRA_COMMANDS = "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS";
    public static final String ACCESS_NETWORK_STATE = "android.permission.ACCESS_NETWORK_STATE";
    public static final String ACCESS_NOTIFICATION_POLICY = "android.permission.ACCESS_NOTIFICATION_POLICY";
    public static final String ACCESS_WIFI_STATE = "android.permission.ACCESS_WIFI_STATE";
    public static final String ACCOUNT_MANAGER = "android.permission.ACCOUNT_MANAGER";
    public static final String ADD_VOICEMAIL = "com.android.voicemail.permission.ADD_VOICEMAIL";
    public static final String BATTERY_STATS = "android.permission.BATTERY_STATS";
    public static final String BIND_ACCESSIBILITY_SERVICE = "android.permission.BIND_ACCESSIBILITY_SERVICE";
    public static final String BIND_APPWIDGET = "android.permission.BIND_APPWIDGET";
    @Deprecated
    public static final String BIND_CARRIER_MESSAGING_SERVICE = "android.permission.BIND_CARRIER_MESSAGING_SERVICE";
    public static final String BIND_CARRIER_SERVICES = "android.permission.BIND_CARRIER_SERVICES";
    public static final String BIND_CHOOSER_TARGET_SERVICE = "android.permission.BIND_CHOOSER_TARGET_SERVICE";
    public static final String BIND_DEVICE_ADMIN = "android.permission.BIND_DEVICE_ADMIN";
    public static final String BIND_DREAM_SERVICE = "android.permission.BIND_DREAM_SERVICE";
    public static final String BIND_INCALL_SERVICE = "android.permission.BIND_INCALL_SERVICE";
    public static final String BIND_INPUT_METHOD = "android.permission.BIND_INPUT_METHOD";
    public static final String BIND_MIDI_DEVICE_SERVICE = "android.permission.BIND_MIDI_DEVICE_SERVICE";
    public static final String BIND_NFC_SERVICE = "android.permission.BIND_NFC_SERVICE";
    public static final String BIND_NOTIFICATION_LISTENER_SERVICE = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE";
    public static final String BIND_PRINT_SERVICE = "android.permission.BIND_PRINT_SERVICE";
    public static final String BIND_REMOTEVIEWS = "android.permission.BIND_REMOTEVIEWS";
    public static final String BIND_TELECOM_CONNECTION_SERVICE = "android.permission.BIND_TELECOM_CONNECTION_SERVICE";
    public static final String BIND_TEXT_SERVICE = "android.permission.BIND_TEXT_SERVICE";
    public static final String BIND_TV_INPUT = "android.permission.BIND_TV_INPUT";
    public static final String BIND_VOICE_INTERACTION = "android.permission.BIND_VOICE_INTERACTION";
    public static final String BIND_VPN_SERVICE = "android.permission.BIND_VPN_SERVICE";
    public static final String BIND_WALLPAPER = "android.permission.BIND_WALLPAPER";
    public static final String BLUETOOTH = "android.permission.BLUETOOTH";
    public static final String BLUETOOTH_ADMIN = "android.permission.BLUETOOTH_ADMIN";
    public static final String BLUETOOTH_PRIVILEGED = "android.permission.BLUETOOTH_PRIVILEGED";
    public static final String BODY_SENSORS = "android.permission.BODY_SENSORS";
    public static final String BROADCAST_PACKAGE_REMOVED = "android.permission.BROADCAST_PACKAGE_REMOVED";
    public static final String BROADCAST_SMS = "android.permission.BROADCAST_SMS";
    public static final String BROADCAST_STICKY = "android.permission.BROADCAST_STICKY";
    public static final String BROADCAST_WAP_PUSH = "android.permission.BROADCAST_WAP_PUSH";
    public static final String CALL_PHONE = "android.permission.CALL_PHONE";
    public static final String CALL_PRIVILEGED = "android.permission.CALL_PRIVILEGED";
    public static final String CAMERA = "android.permission.CAMERA";
    public static final String CAPTURE_AUDIO_OUTPUT = "android.permission.CAPTURE_AUDIO_OUTPUT";
    public static final String CAPTURE_SECURE_VIDEO_OUTPUT = "android.permission.CAPTURE_SECURE_VIDEO_OUTPUT";
    public static final String CAPTURE_VIDEO_OUTPUT = "android.permission.CAPTURE_VIDEO_OUTPUT";
    public static final String CHANGE_COMPONENT_ENABLED_STATE = "android.permission.CHANGE_COMPONENT_ENABLED_STATE";
    public static final String CHANGE_CONFIGURATION = "android.permission.CHANGE_CONFIGURATION";
    public static final String CHANGE_NETWORK_STATE = "android.permission.CHANGE_NETWORK_STATE";
    public static final String CHANGE_WIFI_MULTICAST_STATE = "android.permission.CHANGE_WIFI_MULTICAST_STATE";
    public static final String CHANGE_WIFI_STATE = "android.permission.CHANGE_WIFI_STATE";
    public static final String CLEAR_APP_CACHE = "android.permission.CLEAR_APP_CACHE";
    public static final String CONTROL_LOCATION_UPDATES = "android.permission.CONTROL_LOCATION_UPDATES";
    public static final String DELETE_CACHE_FILES = "android.permission.DELETE_CACHE_FILES";
    public static final String DELETE_PACKAGES = "android.permission.DELETE_PACKAGES";
    public static final String DIAGNOSTIC = "android.permission.DIAGNOSTIC";
    public static final String DISABLE_KEYGUARD = "android.permission.DISABLE_KEYGUARD";
    public static final String DUMP = "android.permission.DUMP";
    public static final String EXPAND_STATUS_BAR = "android.permission.EXPAND_STATUS_BAR";
    public static final String FACTORY_TEST = "android.permission.FACTORY_TEST";
    public static final String FLASHLIGHT = "android.permission.FLASHLIGHT";
    public static final String GET_ACCOUNTS = "android.permission.GET_ACCOUNTS";
    public static final String GET_ACCOUNTS_PRIVILEGED = "android.permission.GET_ACCOUNTS_PRIVILEGED";
    public static final String GET_PACKAGE_SIZE = "android.permission.GET_PACKAGE_SIZE";
    @Deprecated
    public static final String GET_TASKS = "android.permission.GET_TASKS";
    public static final String GLOBAL_SEARCH = "android.permission.GLOBAL_SEARCH";
    public static final String INSTALL_LOCATION_PROVIDER = "android.permission.INSTALL_LOCATION_PROVIDER";
    public static final String INSTALL_PACKAGES = "android.permission.INSTALL_PACKAGES";
    public static final String INSTALL_SHORTCUT = "com.android.launcher.permission.INSTALL_SHORTCUT";
    public static final String INTERNET = "android.permission.INTERNET";
    public static final String KILL_BACKGROUND_PROCESSES = "android.permission.KILL_BACKGROUND_PROCESSES";
    public static final String LOCATION_HARDWARE = "android.permission.LOCATION_HARDWARE";
    public static final String MANAGE_DOCUMENTS = "android.permission.MANAGE_DOCUMENTS";
    public static final String MASTER_CLEAR = "android.permission.MASTER_CLEAR";
    public static final String MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
    public static final String MODIFY_AUDIO_SETTINGS = "android.permission.MODIFY_AUDIO_SETTINGS";
    public static final String MODIFY_PHONE_STATE = "android.permission.MODIFY_PHONE_STATE";
    public static final String MOUNT_FORMAT_FILESYSTEMS = "android.permission.MOUNT_FORMAT_FILESYSTEMS";
    public static final String MOUNT_UNMOUNT_FILESYSTEMS = "android.permission.MOUNT_UNMOUNT_FILESYSTEMS";
    public static final String NFC = "android.permission.NFC";
    public static final String PACKAGE_USAGE_STATS = "android.permission.PACKAGE_USAGE_STATS";
    @Deprecated
    public static final String PERSISTENT_ACTIVITY = "android.permission.PERSISTENT_ACTIVITY";
    public static final String PROCESS_OUTGOING_CALLS = "android.permission.PROCESS_OUTGOING_CALLS";
    public static final String READ_CALENDAR = "android.permission.READ_CALENDAR";
    public static final String READ_CALL_LOG = "android.permission.READ_CALL_LOG";
    public static final String READ_CONTACTS = "android.permission.READ_CONTACTS";
    public static final String READ_EXTERNAL_STORAGE = "android.permission.READ_EXTERNAL_STORAGE";
    public static final String READ_FRAME_BUFFER = "android.permission.READ_FRAME_BUFFER";
    @Deprecated
    public static final String READ_INPUT_STATE = "android.permission.READ_INPUT_STATE";
    public static final String READ_LOGS = "android.permission.READ_LOGS";
    public static final String READ_PHONE_STATE = "android.permission.READ_PHONE_STATE";
    public static final String READ_SMS = "android.permission.READ_SMS";
    public static final String READ_SYNC_SETTINGS = "android.permission.READ_SYNC_SETTINGS";
    public static final String READ_SYNC_STATS = "android.permission.READ_SYNC_STATS";
    public static final String READ_VOICEMAIL = "com.android.voicemail.permission.READ_VOICEMAIL";
    public static final String REBOOT = "android.permission.REBOOT";
    public static final String RECEIVE_BOOT_COMPLETED = "android.permission.RECEIVE_BOOT_COMPLETED";
    public static final String RECEIVE_MMS = "android.permission.RECEIVE_MMS";
    public static final String RECEIVE_SMS = "android.permission.RECEIVE_SMS";
    public static final String RECEIVE_WAP_PUSH = "android.permission.RECEIVE_WAP_PUSH";
    public static final String RECORD_AUDIO = "android.permission.RECORD_AUDIO";
    public static final String REORDER_TASKS = "android.permission.REORDER_TASKS";
    public static final String REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
    public static final String REQUEST_INSTALL_PACKAGES = "android.permission.REQUEST_INSTALL_PACKAGES";
    @Deprecated
    public static final String RESTART_PACKAGES = "android.permission.RESTART_PACKAGES";
    public static final String SEND_RESPOND_VIA_MESSAGE = "android.permission.SEND_RESPOND_VIA_MESSAGE";
    public static final String SEND_SMS = "android.permission.SEND_SMS";
    public static final String SET_ALARM = "com.android.alarm.permission.SET_ALARM";
    public static final String SET_ALWAYS_FINISH = "android.permission.SET_ALWAYS_FINISH";
    public static final String SET_ANIMATION_SCALE = "android.permission.SET_ANIMATION_SCALE";
    public static final String SET_DEBUG_APP = "android.permission.SET_DEBUG_APP";
    @Deprecated
    public static final String SET_PREFERRED_APPLICATIONS = "android.permission.SET_PREFERRED_APPLICATIONS";
    public static final String SET_PROCESS_LIMIT = "android.permission.SET_PROCESS_LIMIT";
    public static final String SET_TIME = "android.permission.SET_TIME";
    public static final String SET_TIME_ZONE = "android.permission.SET_TIME_ZONE";
    public static final String SET_WALLPAPER = "android.permission.SET_WALLPAPER";
    public static final String SET_WALLPAPER_HINTS = "android.permission.SET_WALLPAPER_HINTS";
    public static final String SIGNAL_PERSISTENT_PROCESSES = "android.permission.SIGNAL_PERSISTENT_PROCESSES";
    public static final String STATUS_BAR = "android.permission.STATUS_BAR";
    public static final String SYSTEM_ALERT_WINDOW = "android.permission.SYSTEM_ALERT_WINDOW";
    public static final String TRANSMIT_IR = "android.permission.TRANSMIT_IR";
    public static final String UNINSTALL_SHORTCUT = "com.android.launcher.permission.UNINSTALL_SHORTCUT";
    public static final String UPDATE_DEVICE_STATS = "android.permission.UPDATE_DEVICE_STATS";
    public static final String USE_FINGERPRINT = "android.permission.USE_FINGERPRINT";
    public static final String USE_SIP = "android.permission.USE_SIP";
    public static final String VIBRATE = "android.permission.VIBRATE";
    public static final String WAKE_LOCK = "android.permission.WAKE_LOCK";
    public static final String WRITE_APN_SETTINGS = "android.permission.WRITE_APN_SETTINGS";
    public static final String WRITE_CALENDAR = "android.permission.WRITE_CALENDAR";
    public static final String WRITE_CALL_LOG = "android.permission.WRITE_CALL_LOG";
    public static final String WRITE_CONTACTS = "android.permission.WRITE_CONTACTS";
    public static final String WRITE_EXTERNAL_STORAGE = "android.permission.WRITE_EXTERNAL_STORAGE";
    public static final String WRITE_GSERVICES = "android.permission.WRITE_GSERVICES";
    public static final String WRITE_SECURE_SETTINGS = "android.permission.WRITE_SECURE_SETTINGS";
    public static final String WRITE_SETTINGS = "android.permission.WRITE_SETTINGS";
    public static final String WRITE_SYNC_SETTINGS = "android.permission.WRITE_SYNC_SETTINGS";
    public static final String WRITE_VOICEMAIL = "com.android.voicemail.permission.WRITE_VOICEMAIL";

    public static boolean isHavePermission(Context context, String permission) {
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static void requestPermissions(Fragment fragment, String permission, int request_code) {
        fragment.requestPermissions(new String[]{permission}, request_code);
    }

    public static void requestPermissions(Activity activity, String permission, int request_code) {
        ActivityCompat.requestPermissions(activity, new String[]{permission}, request_code);
    }

    public static void checkOrRequest(Fragment fragment, String permission, int request_code) {
        if (!isHavePermission(fragment.getContext(), permission)) {
            requestPermissions(fragment, permission, request_code);
        }
    }

    public static void checkOrRequest(Activity activity, String permission, int request_code) {
        if (!isHavePermission(activity, permission)) {
            requestPermissions(activity, permission, request_code);
        }
    }

   /* private boolean checkAndRequestPermissions(String[] app_permissions,Context mContext) {
        List<String> permissionNeeded = new ArrayList<>();

        for (String permission : app_permissions) {
            if (!PermissionUtil.isHavePermission(mContext, permission)) {
                permissionNeeded.add(permission);
            }
        }
        if (permissionNeeded)

        if (!permissionNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(this, permissionNeeded.toArray(new String[permissionNeeded.size()]), REQUEST_ALL_PERMISSIONS);
            return false;
        }

        return true;
    }
*/
}
