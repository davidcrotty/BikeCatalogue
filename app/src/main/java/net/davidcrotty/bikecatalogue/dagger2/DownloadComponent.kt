package net.davidcrotty.bikecatalogue.dagger2

import dagger.Component
import net.davidcrotty.bikecatalogue.DownloadActivity
import javax.inject.Singleton

/**
 * Created by David Crotty on 04/11/2017.
 *
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
@Singleton
@Component(modules = arrayOf(DownloadModule::class))
interface DownloadComponent {
    fun inject(activity: DownloadActivity)
}