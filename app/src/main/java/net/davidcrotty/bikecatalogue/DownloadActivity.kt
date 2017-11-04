package net.davidcrotty.bikecatalogue

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_download.*
import net.davidcrotty.bikecatalogue.service.Download
import javax.inject.Inject

class DownloadActivity : AppCompatActivity() {

    @Inject lateinit var download: Download

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_download)
        getApp().download.inject(this)

        download_button.setOnClickListener {
            download.doDownload()
        }
    }
}
