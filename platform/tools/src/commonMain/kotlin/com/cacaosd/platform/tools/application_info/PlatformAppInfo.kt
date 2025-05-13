package com.cacaosd.platform.tools.application_info

import com.cacaosd.platform.tools.config.PlatformConfiguration

expect class PlatformAppInfo

expect fun PlatformConfiguration.findApplicationInfo(
    packageName: String,
    onError: (Throwable) -> Unit
): PlatformAppInfo?
