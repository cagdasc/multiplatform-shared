package com.cacaosd.platform.tools.activity

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.compose.ui.platform.LocalContext
import com.cacaosd.platform.tools.activity.PlatformActivity
import com.cacaosd.platform.tools.activity.PlatformContext
import com.cacaosd.platform.tools.activity.findActivity

actual typealias PlatformActivity = Activity

actual typealias PlatformContext = Context

actual inline val LocalPlatformContext get() = LocalContext

actual fun com.cacaosd.platform.tools.activity.PlatformContext.findActivity(): com.cacaosd.platform.tools.activity.PlatformActivity? {
    return when (this) {
        is Activity -> this
        is ContextWrapper -> baseContext.findActivity()
        else -> null
    }
}
