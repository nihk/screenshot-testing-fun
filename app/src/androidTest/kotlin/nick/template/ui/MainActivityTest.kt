package nick.template.ui

import androidx.test.core.app.launchActivity
import com.karumi.shot.ScreenshotTest
import org.junit.Test

class MainActivityTest : ScreenshotTest {
    @Test
    fun launch() {
        launchActivity<MainActivity>()
    }
}
