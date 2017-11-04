package net.davidcrotty.bikecatalogue

import android.app.Application
import net.davidcrotty.bikecatalogue.dagger2.DaggerDownloadComponent
import net.davidcrotty.bikecatalogue.dagger2.DownloadModule
import net.davidcrotty.bikecatalogue.network.Provider

/**
 * Created by David Crotty on 04/11/2017.
 *
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
open class App : Application() {

    open val download by lazy { DaggerDownloadComponent.builder()
            .downloadModule(DownloadModule(Provider()))
            .build() }

    override fun onCreate() {
        super.onCreate()
    }
}