package com.sycompany.bojstep

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class LocaleChangedReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_LOCALE_CHANGED) {
            Toast.makeText(context, "언어가 변경됨!", Toast.LENGTH_SHORT).show()
        }
    }
}