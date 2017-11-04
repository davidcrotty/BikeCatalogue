package net.davidcrotty.bikecatalogue.service

import net.davidcrotty.bikecatalogue.network.Provider

/**
 * Created by David Crotty on 04/11/2017.
 *
 * Copyright © 2017 David Crotty - All Rights Reserved
 */
open class Download(private val provider: Provider) : Downloadable {

    override fun doDownload(): String {
        return provider.fetchImage()
    }
}