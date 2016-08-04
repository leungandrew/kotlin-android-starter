package io.pivotal.kotlinandroidstarter.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import io.pivotal.kotlinandroidstarter.App
import javax.inject.Inject

open class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var picasso: Picasso

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.component.inject(this)
    }
}
