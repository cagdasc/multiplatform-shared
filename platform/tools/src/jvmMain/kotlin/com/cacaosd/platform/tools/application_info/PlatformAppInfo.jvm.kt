package com.cacaosd.platform.tools.application_info

import com.cacaosd.platform.tools.config.PlatformConfiguration

actual data class PlatformAppInfo(val appName: String)

actual fun PlatformConfiguration.findApplicationInfo(
    packageName: String,
    onError: (Throwable) -> Unit
): PlatformAppInfo? {
    return null
}
