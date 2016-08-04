package io.pivotal.kotlinandroidstarter

import android.app.Application
import io.pivotal.kotlinandroidstarter.component.AppComponent
import io.pivotal.kotlinandroidstarter.component.DaggerAppComponent
import io.pivotal.kotlinandroidstarter.module.AppModule

open class App : Application() {

    companion object {
        @JvmStatic lateinit var component: AppComponent
    }

    open fun buildComponent() {
        component = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    override fun onCreate() {
        super.onCreate()
        buildComponent()
    }
}