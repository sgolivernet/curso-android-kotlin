package net.sgoliver.android.botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    private lateinit var lblMensaje : TextView
    private lateinit var btnBotonSimple : Button
    private lateinit var btnToggle : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lblMensaje = findViewById(R.id.lblMensaje)

        btnBotonSimple = findViewById(R.id.btnBotonSimple)
        btnBotonSimple.setOnClickListener {
            lblMensaje.text = "Botón simple pulsado!"
        }

        btnToggle = findViewById(R.id.btnToggle)
        btnToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                lblMensaje.text = "Botón Toggle: On"
            } else {
                lblMensaje.text = "Botón Toggle: Off"
            }
        }
    }
}
