package com.sycompany.bojstep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.MimeTypeMap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val longStr = getString(R.string.long_str)
        val fileExtension = MimeTypeMap.getFileExtensionFromUrl(longStr)

        val result = longStr.substring(longStr.lastIndexOf("."))

        Log.d("확장자명", "file ext : $result")
    }
}