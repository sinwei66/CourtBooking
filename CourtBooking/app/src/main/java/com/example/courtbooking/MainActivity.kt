package com.example.courtbooking

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.sql.Time
import java.text.SimpleDateFormat
import java.util.*


private val View.view: Unit
    get() {}

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {

    var formate = SimpleDateFormat("dd, MMM, YYYY", Locale.US)
    //var timeFormat = SimpleDateFormat("hh:mm", Locale.US)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerC: Spinner = findViewById(R.id.spinnerCategory)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.categoryArray,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerC.adapter = adapter
        }

        val spinnerT: Spinner = findViewById(R.id.spinnerTime)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.timeArray,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinnerT.adapter = adapter
        }

        btn_date.setOnClickListener {
            val now = Calendar.getInstance();
            val datePicker = DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    val seletedDate = Calendar.getInstance()
                    seletedDate.set(Calendar.YEAR, year)
                    seletedDate.set(Calendar.MONTH, month)
                    seletedDate.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                    val date = formate.format(seletedDate.time)
                    in_date.setText(date)
                },
                now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH)
            )
            datePicker.show()
        }

        //btn_time.setOnClickListener{
            //val now = Calendar.getInstance();

            //try{
                //if(in_time.text != null)
                //{
                    //val date = timeFormat.parse(in_time.text.toString())
                    //now.time = date
                //}
            //}catch (e:Exception)
            //{
                //e.printStackTrace()
            //}
            //val timePicker = TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                //val selectedTime = Calendar.getInstance()
                //selectedTime.set(Calendar.HOUR_OF_DAY, hourOfDay)
                //selectedTime.set(Calendar.MINUTE, minute)
                //val timeA = timeFormat.format(selectedTime.time)
                //in_time.setText(timeA)
            //},
               // now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), false)
            //timePicker.show()
        //}


        /*
        val c = Calendar.getInstance()
        mYear = c.get(Calendar.YEAR)
        mMonth = c.get(Calendar.MONTH)
        mDay = c.get(Calendar.DAY_OF_MONTH)
        mHour = c.get(Calendar.HOUR_OF_DAY)
        mMinute = c.get(Calendar.MINUTE)

        txtDatePicker = findViewById(R.id.txt_date_picker) as TextView
        txtDatePicker.setOnClickListener { showDatePicker() }

        txtTimePicker = findViewById(R.id.txt_time_picker) as TextView
        txtTimePicker.setOnClickListener { showTimePicker() }
        */

    }
    /*
    private fun showDatePicker() {
        val datePickerDialog = DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth -&gt; txtDatePicker.setText(dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year) }, mYear, mMonth, mDay)
        datePickerDialog.show()
    }

    private fun showTimePicker() {
        val timePickerDialog = TimePickerDialog(this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute -&gt; txtTimePicker.setText(hourOfDay.toString() + ":" + minute) }, mHour, mMinute, false)
        timePickerDialog.show()
    }*/
}
