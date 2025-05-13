package com.cacaosd.platform.tools.di

import com.cacaosd.platform.tools.config.PlatformConfiguration
import com.cacaosd.platform.tools.intent.IntentUtil
import com.cacaosd.platform.tools.intent.JvmIntentUtil

actual fun getIntentUtil(config: PlatformConfiguration): IntentUtil {
    return JvmIntentUtil()
}
