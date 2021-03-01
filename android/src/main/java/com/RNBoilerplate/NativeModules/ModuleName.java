package com.RNBoilerplate.NativeModules;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import java.util.HashMap;
import java.util.Map;

public class ModuleName extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME = "RNNetworkStateListener";
    private static final String EVENT_NAME = "eventName";
    private final Context context;

    //==============================================================================================
    public ModuleName(ReactApplicationContext reactContext) {
        super(reactContext);
        context = reactContext;
    }

    //==============================================================================================
    @RequiresApi(api = Build.VERSION_CODES.N)
    @ReactMethod
    public void method1() {
        Log.d("method1", "CALLLED");

    }

    //==============================================================================================
    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();

        constants.put(EVENT_NAME, EVENT_NAME);

        return constants;
    }

    //==============================================================================================
    public void createEventData(boolean isConnected) {
        WritableMap params = Arguments.createMap();
        params.putBoolean("isConnected", isConnected);
        sendEventToJS((ReactContext) context, EVENT_NAME, params);
    }

    //==============================================================================================
    private void sendEventToJS(ReactContext reactContext, String eventName, @Nullable WritableMap params) {
        reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit(eventName, params);
    }

    //==============================================================================================
    @NonNull
    @Override
    public String getName() {
        return MODULE_NAME;
    }
}
