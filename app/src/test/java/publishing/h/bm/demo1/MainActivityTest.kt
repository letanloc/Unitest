package publishing.h.bm.demo1

import android.support.test.runner.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView

import androidx.test.espresso.matcher.ViewMatchers

import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

//@Config(constants = BuildConfig::class.java)

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    //    private lateinit var mainActivity: MainActivity
//    @Before
//    fun create() {
//        mainActivity = Robolectric.buildActivity(MainActivity::class.java).create().get()
//    }
//
//
//    /*TEST UI*/
    @Test
    fun testViewStart() {
//        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.btnCong))
                .perform()
//        assertThat(mainActivity.btnCong.getText().toString(), equalTo("Cong"));
//        assertThat(mainActivity.textView.getText().toString(), equalTo("KQ"));
    }
//
//
//    @After
//    fun destroy() {
//
//
//    }

}