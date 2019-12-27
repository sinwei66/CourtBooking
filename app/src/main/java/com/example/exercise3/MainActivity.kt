package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate:Button = findViewById(R.id.buttonCalculate)
        val btnReset:Button = findViewById(R.id.buttonReset)
        btnCalculate.setOnClickListener{calculatePremium()}
        btnReset.setOnClickListener{reset()}
    }

    private fun calculatePremium()
    {
        val age:Spinner = findViewById(R.id.spinnerAge)
        val genderM:RadioButton = findViewById(R.id.radioButtonMale)
        val genderF:RadioButton = findViewById(R.id.radioButtonFemale)
        val smoker:CheckBox = findViewById(R.id.checkBoxSmoker)

        if(age.selectedItem.equals("Less than 17"))
        {
            textViewPremium.text = "Insurance Premium: RM 60"
        }
        else if(age.selectedItem.equals("17 to 25"))
        {
            if(genderM.isChecked)
            {
                if(smoker.isChecked)
                {
                    textViewPremium.text = "Insurance Premium: RM 220"
                }
                else
                    textViewPremium.text = "Insurance Premium: RM 120"
            }
            else if(genderF.isChecked && smoker.isChecked)
            {
                textViewPremium.text = "Insurance Premium: RM 170"
            }
            else
                textViewPremium.text = "Insurance Premium: RM 70"
        }

        else if(age.selectedItem.equals("26 to 30"))
        {
            if(genderM.isChecked)
            {
                if(smoker.isChecked)
                {
                    textViewPremium.text = "Insurance Premium: RM 340"
                }
                else
                    textViewPremium.text = "Insurance Premium: RM 190"
            }
            else if(genderF.isChecked && smoker.isChecked)
            {
                textViewPremium.text = "Insurance Premium: RM 240"
            }
            else
                textViewPremium.text = "Insurance Premium: RM 90"
        }

        else if(age.selectedItem.equals("31 to 40"))
        {
            if(genderM.isChecked)
            {
                if(smoker.isChecked)
                {
                    textViewPremium.text = "Insurance Premium: RM 470"
                }
                else
                    textViewPremium.text = "Insurance Premium: RM 270"
            }
            else if(genderF.isChecked && smoker.isChecked)
            {
                textViewPremium.text = "Insurance Premium: RM 320"
            }
            else
                textViewPremium.text = "Insurance Premium: RM 120"
        }

        else if(age.selectedItem.equals("41 to 55"))
        {
            if(genderM.isChecked)
            {
                if(smoker.isChecked)
                {
                    textViewPremium.text = "Insurance Premium: RM 600"
                }
                else
                    textViewPremium.text = "Insurance Premium: RM 350"
            }
            else if(genderF.isChecked && smoker.isChecked)
            {
                textViewPremium.text = "Insurance Premium: RM 400"
            }
            else
                textViewPremium.text = "Insurance Premium: RM 150"
        }

        else{
            if(genderM.isChecked)
            {
                if(smoker.isChecked)
                {
                    textViewPremium.text = "Insurance Premium: RM 650"
                }
                else
                    textViewPremium.text = "Insurance Premium: RM 350"
            }
            else if(genderF.isChecked && smoker.isChecked)
            {
                textViewPremium.text = "Insurance Premium: RM 450"
            }
            else
                textViewPremium.text = "Insurance Premium: RM 150"
        }
    }

    private fun reset()
    {
        val age:Spinner = findViewById(R.id.spinnerAge)
        val gender:RadioGroup = findViewById(R.id.radioGroupGender)
        val smoker:CheckBox = findViewById(R.id.checkBoxSmoker)

        age.setSelection(0)
        gender.clearCheck()
        smoker.setChecked(false)
        textViewPremium.setText(R.string.insurance_premium)

    }
}

