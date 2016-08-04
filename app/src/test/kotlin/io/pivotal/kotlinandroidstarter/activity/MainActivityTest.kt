package io.pivotal.kotlinandroidstarter.activity

import com.squareup.picasso.Picasso
import io.pivotal.kotlinandroidstarter.App
import io.pivotal.kotlinandroidstarter.BuildConfig
import io.pivotal.kotlinandroidstarter.component.TestAppComponent
import org.assertj.core.api.Assertions
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

@RunWith(RobolectricGradleTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(19))
class MainActivityTest {
    var subject: MainActivity? = null

    @Inject
    lateinit var mockPicasso: Picasso

    @Before
    fun setup() {
        subject = Robolectric.setupActivity(MainActivity::class.java)
        (App.component as TestAppComponent).inject(this)
    }

    @Test
    fun activity_shouldHaveTitle() {
        Assertions.assertThat(subject!!.title).isEqualTo("Kotlin Android Starter")
        // Test something with the mockPicasso
    }
}