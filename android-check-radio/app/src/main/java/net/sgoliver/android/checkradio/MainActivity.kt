package net.sgoliver.android.checkradio

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var chkMarcame : CheckBox
    private lateinit var grbGrupo1 : RadioGroup
    private lateinit var lblMensaje : TextView
    private lateinit var option1 : RadioButton
    private lateinit var option2 : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkMarcame = findViewById(R.id.chkMarcame)
        chkMarcame.setOnClickListener {
            if (it is CheckBox) {
                if (it.isChecked)
                    chkMarcame.text = "Checkbox marcado!"
                else
                    chkMarcame.text = "Checkbox desmarcado!"
            }
        }

        /*
        //Implementación alternativa
        chkMarcame.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                chkMarcame.text = "Checkbox marcado!"
            else
                chkMarcame.text = "Checkbox desmarcado!"
        }
        */

        lblMensaje = findViewById(R.id.lblMensaje)
        option1 = findViewById(R.id.rbOpcion1)
        option2 = findViewById(R.id.rbOpcion2)

        val handler = View.OnClickListener { view ->
            if (view is RadioButton) {
                var opcion = ""

                when (view.getId()) {
                    R.id.rbOpcion1 ->
                        opcion = "opción 1"
                    R.id.rbOpcion2 ->
                        opcion = "opción 2"
                }

                lblMensaje.text = "Opción seleccionada: $opcion"
            }
        }

        option1.setOnClickListener(handler)
        option2.setOnClickListener(handler)

        /*
        //Implementación alternativa
        grbGrupo1 = findViewById(R.id.grbGrupo1)
        grbGrupo1.setOnCheckedChangeListener { _, checkedId ->
            var opcion = ""

            when (checkedId) {
                R.id.rbOpcion1 ->
                    opcion = "opción 1"
                R.id.rbOpcion2 ->
                    opcion = "opción 2"
            }

            lblMensaje.text = "Opción seleccionada: $opcion"
        }
        */
    }
}
