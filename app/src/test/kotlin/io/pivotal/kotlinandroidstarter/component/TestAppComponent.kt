package io.pivotal.kotlinandroidstarter.component

import dagger.Component
import io.pivotal.kotlinandroidstarter.activity.MainActivityTest
import io.pivotal.kotlinandroidstarter.module.TestAppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(TestAppModule::class))
interface TestAppComponent: AppComponent {
    fun inject(mainActivityTest: MainActivityTest)
}


