package com.cacaosd.platform.tools.config

import android.content.Context
import com.cacaosd.platform.tools.BuildConfig

actual class PlatformConfiguration(val context: Context) {
    actual fun isDebugBuild(): Boolean {
        return BuildConfig.DEBUG
    }
}
