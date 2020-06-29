package net.sgoliver.android.controlpers2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ActionMenuView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.control_login.*

class MainActivity : AppCompatActivity() {

    private lateinit var ctlLogin : ControlLogin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ctlLogin = findViewById(R.id.ctlLogin)

        ctlLogin.setOnLoginListener { usuario, password ->
            if(usuario == "demo" && password == "demo")
                lblMensaje.text = "Login correcto!"
            else
                lblMensaje.text = "Vuelve a intentarlo"
        }
    }
}