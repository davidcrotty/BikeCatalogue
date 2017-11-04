package net.davidcrotty.bikecatalogue.dagger2

import dagger.Module
import dagger.Provides
import net.davidcrotty.bikecatalogue.network.Provider
import net.davidcrotty.bikecatalogue.service.Download
import javax.inject.Singleton

/**
 * Created by David Crotty on 04/11/2017.
 *
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
@Module
open class DownloadModule(val provider: Provider) {
    @Provides @Singleton open fun provideDownload() = Download(provider)
}