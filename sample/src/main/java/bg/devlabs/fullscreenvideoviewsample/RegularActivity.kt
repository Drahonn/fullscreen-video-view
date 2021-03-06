package bg.devlabs.fullscreenvideoviewsample

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_regular.*

class RegularActivity : Activity() {
    companion object {
        fun start(context: Context) {
            val starter = Intent(context, RegularActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regular)
        val videoPath = "https://clips.vorwaerts-gmbh.de/VfE_html5.mp4"
        fullscreenVideoView.videoUrl(videoPath)
    }
}
