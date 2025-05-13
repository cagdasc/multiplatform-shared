package com.cacaosd.platform.tools.activity

import androidx.compose.runtime.staticCompositionLocalOf

actual class PlatformActivity

actual abstract class PlatformContext private constructor() {
    companion object {
        @JvmField
        val INSTANCE = object : PlatformContext() {}
    }
}

actual val LocalPlatformContext = staticCompositionLocalOf { PlatformContext.INSTANCE }

actual fun PlatformContext.findActivity(): PlatformActivity? {
    return _root_ide_package_.com.cacaosd.platform.tools.activity.PlatformActivity()
}
