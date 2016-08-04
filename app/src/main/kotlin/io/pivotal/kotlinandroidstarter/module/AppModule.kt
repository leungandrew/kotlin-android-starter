package io.pivotal.kotlinandroidstarter.module

import android.content.Context
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
@Singleton
open class AppModule {

    var context: Context? = null

    constructor(context: Context) {
        this.context = context
    }

    @Provides
    fun providesPicasso(): Picasso {
        return Picasso.with(context)
    }
}

