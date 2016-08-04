package io.pivotal.kotlinandroidstarter.component

import dagger.Component
import io.pivotal.kotlinandroidstarter.activity.MainActivity
import io.pivotal.kotlinandroidstarter.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}

