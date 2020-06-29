package net.sgoliver.android.controlpers3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnFicha : Button
    private lateinit var terTablero : TresEnRaya
    private lateinit var lblCasilla : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        terTablero = findViewById(R.id.tablero)
        btnFicha = findViewById(R.id.btnFicha)
        lblCasilla = findViewById(R.id.lblCasilla)

        btnFicha.setOnClickListener {
            terTablero.alternarFichaActiva()
        }

        terTablero.setOnCasillaSeleccionadaListener { fila, columna ->
            lblCasilla.text = "Última casilla seleccionada: $fila . $columna"
        }
    }
}