package com.todays_eyebrow.commonlib

import android.content.Context
import android.widget.Toast

class TestLib {

    companion object {

        fun showToast(context: Context, string: String){
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
        }
    }


}