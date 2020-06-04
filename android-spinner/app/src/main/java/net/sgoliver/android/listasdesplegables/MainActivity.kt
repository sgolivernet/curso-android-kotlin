package net.sgoliver.android.listasdesplegables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var cmbOpciones : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cmbOpciones = findViewById(R.id.cmbOpciones)

        //val datos = arrayOf("Elem1", "Elem2", "Elem3", "Elem4", "Elem5")
        //val adaptador =
        //        ArrayAdapter(this, android.R.layout.simple_spinner_item, datos)

        val adaptador =
            ArrayAdapter.createFromResource(this, R.array.valores_array, android.R.layout.simple_spinner_item)

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        cmbOpciones.adapter = adaptador

        cmbOpciones.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>) {
                lblSeleccion.text = "Sin selección"
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val pos = parent.getItemAtPosition(position)
                lblSeleccion.text = "Seleccionado: $pos"
            }
        }
    }
}