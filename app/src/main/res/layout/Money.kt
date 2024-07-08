package layout

import android.media.Image
import android.media.TimedText
import java.time.temporal.TemporalAmount
import java.util.Date

data class Money(
    var image: String,
    var text: String,
    var date: String,
    var amount: String
)
