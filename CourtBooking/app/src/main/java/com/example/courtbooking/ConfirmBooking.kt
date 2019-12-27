package com.example.courtbooking

import android.os.Bundle
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

@Suppress("UNREACHABLE_CODE")
class ConfirmBooking : AppCompatActivity() {

    val spinnerC: Spinner = findViewById(R.id.spinnerCategory)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.confirmbooking)

    }
}