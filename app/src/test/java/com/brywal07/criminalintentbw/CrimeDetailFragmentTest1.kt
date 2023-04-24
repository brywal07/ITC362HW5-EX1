import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.brywal07.criminalintentbw.CrimeDetailFragment
import com.brywal07.criminalintentbw.R
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import java.util.*


@RunWith(AndroidJUnit4::class)
@Config(manifest=Config.NONE)
class CrimeDetailFragmentTest {

    @Test
    fun testCrimeDetailFragment() {
        val scenario = launchFragmentInContainer<CrimeDetailFragment>()
        scenario.onFragment {
            scenario.onFragment {
                onView(withId(R.id.crime_title)).perform(typeText("Test Crime Title"))
            }
        }
    }
}