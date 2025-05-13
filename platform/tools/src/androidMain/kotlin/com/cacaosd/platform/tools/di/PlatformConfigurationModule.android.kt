package com.cacaosd.platform.tools.di

import com.cacaosd.platform.tools.config.PlatformConfiguration
import com.cacaosd.platform.tools.intent.AndroidIntentUtil
import com.cacaosd.platform.tools.intent.IntentUtil

actual fun getIntentUtil(config: PlatformConfiguration): IntentUtil {
    return _root_ide_package_.com.cacaosd.platform.tools.intent.AndroidIntentUtil(config.context)
}
