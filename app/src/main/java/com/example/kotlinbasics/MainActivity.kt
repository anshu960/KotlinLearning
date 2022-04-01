package com.example.kotlinbasics

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tvSelected : TextView? = null
    private var tvAge : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn :Button = findViewById(R.id.btn_date)
        tvSelected = findViewById(R.id.tvSelectedDate)
        tvAge = findViewById(R.id.tvAgeInMinutes)
        btn.setOnClickListener {
            clickDatePicker()
        }
    }
    private fun clickDatePicker(){
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
       val dpdp = DatePickerDialog(this, { _, year, month, dayOfMonth ->
           Toast.makeText(
               this, "Year was $year, month was ${month + 1}," +
                       " day of month was $dayOfMonth", Toast.LENGTH_SHORT
           ).show()
           val selectedDate = "$dayOfMonth/${month + 1}/$year"
           tvSelected?.text = selectedDate
           val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

           val theDate = sdf.parse(selectedDate)
           theDate?.let {
               val selectedDateInMinute = theDate.time / 60000
               val current = sdf.parse(sdf.format(System.currentTimeMillis()))
               val currentDateInMinutes = current.time / 60000
               val differenceInMinutes = currentDateInMinutes - selectedDateInMinute
               tvAge?.text = differenceInMinutes.toString()
           }

       },
            year,month,day)
        dpdp.datePicker.maxDate = System.currentTimeMillis() - 8640000
        dpdp.show()

    }
}