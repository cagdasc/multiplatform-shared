package com.cacaosd.platform.tools.di

import com.cacaosd.platform.tools.activity.PlatformActivity
import com.cacaosd.platform.tools.config.PlatformConfiguration
import com.cacaosd.platform.tools.intent.IntentUtil
import org.koin.core.KoinApplication
import org.koin.dsl.module

fun KoinApplication.platformConfiguration(platformConfiguration: PlatformConfiguration): KoinApplication {
    koin.loadModules(
        modules = listOf(
            module {
                single { platformConfiguration }
                single { _root_ide_package_.com.cacaosd.platform.tools.activity.PlatformActivity() }
                single<IntentUtil> { _root_ide_package_.com.cacaosd.platform.tools.di.getIntentUtil(get()) }
            }
        )
    )
    return this
}

expect fun getIntentUtil(config: PlatformConfiguration): IntentUtil
