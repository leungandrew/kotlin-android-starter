package io.pivotal.kotlinandroidstarter

import org.assertj.core.api.Assertions
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricGradleTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(16))
class MainActivityTest {
    var subject: MainActivity? = null

    @Before
    fun setup() {
        subject = Robolectric.setupActivity(MainActivity::class.java)
    }

    @Test
    fun activity_shouldHaveTitle() {
        Assertions.assertThat(subject!!.title).isEqualTo("Kotlin Android Starter")
    }
}