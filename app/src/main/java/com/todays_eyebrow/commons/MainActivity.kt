package com.todays_eyebrow.commons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.todays_eyebrow.commonlib.TestLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestLib.showToast(this, "첫 발걸음")

    }
}