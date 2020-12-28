package com.adjust.examples

import io.flutter.embedding.android.FlutterActivity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.util.Base64
import android.util.Log
import com.adjust.sdk.flutter.AdjustSdk
import java.security.MessageDigest
import android.net.Uri
import java.security.NoSuchAlgorithmException
import android.Manifest
import android.annotation.TargetApi
import android.os.Bundle
import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.EventChannel.EventSink
import io.flutter.plugin.common.EventChannel.StreamHandler


class MainActivity : FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // GeneratedPluginRegistrant.registerWith(this); Used only for pre flutter 1.12 Android projects
//        val intent: Intent = getIntent()
//        val data: Uri? = intent.getData()
//        AdjustSdk.appWillOpenUrl(data, this)
    }

    // Or make the cakll in onNewIntent.
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        val data = intent.data
        // TODO: How to navigate within a Flutter app with Navive code?

        AdjustSdk.appWillOpenUrl(data, this)
    }


}
