package net.sgoliver.android.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetalleActivity : AppCompatActivity() {
    companion object {
        val EXTRA_TEXTO : String = "net.sgoliver.android.fragments.EXTRA_TEXTO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val detalle = supportFragmentManager.findFragmentById(R.id.frgDetalle) as FragmentDetalle

        detalle.mostrarDetalle(intent.getStringExtra(EXTRA_TEXTO))
    }
}