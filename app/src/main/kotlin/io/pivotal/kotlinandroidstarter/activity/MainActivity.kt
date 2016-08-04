package io.pivotal.kotlinandroidstarter.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import io.pivotal.kotlinandroidstarter.App
import io.pivotal.kotlinandroidstarter.R
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.verticalLayout
import org.jetbrains.anko.wrapContent
import javax.inject.Inject

open class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var picasso: Picasso

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.component.inject(this)

        verticalLayout {
            toolbar {
                id = R.id.toolbar
                lparams(width = matchParent, height = wrapContent)
                title = resources.getString(R.string.app_name)
            }
        }
    }
}
