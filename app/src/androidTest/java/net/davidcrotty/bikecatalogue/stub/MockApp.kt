package net.davidcrotty.bikecatalogue.stub

import android.support.test.espresso.core.deps.dagger.Module
import net.davidcrotty.bikecatalogue.App
import net.davidcrotty.bikecatalogue.dagger2.DaggerDownloadComponent
import net.davidcrotty.bikecatalogue.dagger2.DownloadModule
import net.davidcrotty.bikecatalogue.network.Provider
import net.davidcrotty.bikecatalogue.service.Download
import org.mockito.Mockito
import org.mockito.Mockito.mock

/**
 * Created by David Crotty on 04/11/2017.
 *
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
class MockApp : App() {

    override val download by lazy { DaggerDownloadComponent.builder()
            .downloadModule(MockDownloadModule(Provider()))
            .build() }

    override fun onCreate() {
        super.onCreate()
    }

    @Module
    class MockDownloadModule(provider: Provider) : DownloadModule(provider) {
        override fun provideDownload(): Download {
            val download = mock(Download::class.java)
            Mockito.`when`(download.doDownload()).thenReturn("mocked")
            return download
        }
    }
}