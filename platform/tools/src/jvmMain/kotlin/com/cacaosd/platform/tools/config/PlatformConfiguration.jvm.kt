package com.cacaosd.platform.tools.config

actual class PlatformConfiguration() {
    actual fun isDebugBuild(): Boolean {
        val buildType = System.getProperty("buildType", "debug")
        return buildType == "debug"
    }
}
