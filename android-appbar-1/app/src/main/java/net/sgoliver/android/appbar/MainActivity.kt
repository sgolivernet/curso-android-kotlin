package net.sgoliver.android.appbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_opciones -> {
            Log.i("ActionBar", "Opciones!")
            true
        }
        R.id.action_nuevo -> {
            Log.i("ActionBar", "Nuevo!")
            true
        }
        R.id.action_buscar -> {
            Log.i("ActionBar", "Buscar!")
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}