package io.pivotal.kotlinandroidstarter.module

import com.nhaarman.mockito_kotlin.mock
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Module
class TestAppModule {

    @Provides
    fun providesMockPicasso(): Picasso {
        return mock()
    }

}

