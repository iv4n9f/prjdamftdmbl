package com.firehearth.prjdamftdmbl

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.firehearth.prjdamftdmbl.R

class MainRegisterActivity : AppCompatActivity() {

    private lateinit var genderSpinner: Spinner
    private lateinit var genderIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_register)
    }

    override fun onStart() {
        super.onStart()
        genderSpinner = findViewById(R.id.MainRegisterDisplayGenderSpinner)
        genderIcon = findViewById(R.id.MainRegisterDisplayGenderIcon)
        addListerners()
    }

    private fun addListerners() {
        genderSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                updateGenderIcon(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
    }

    private fun updateGenderIcon(position: Int) {
        when (position) {
            0 -> genderIcon.setImageResource(R.drawable.ic_gender_male)
            1 -> genderIcon.setImageResource(R.drawable.ic_gender_female)
            else -> {
            }
        }
    }
}
