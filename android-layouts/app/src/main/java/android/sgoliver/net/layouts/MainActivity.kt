package android.sgoliver.net.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Modificar aquí el nombre del layout con el que ejecutar la aplicación
        setContentView(R.layout.activity_main_framelayout)
    }
}
