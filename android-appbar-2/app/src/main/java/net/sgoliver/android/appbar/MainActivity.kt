package net.sgoliver.android.appbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tbar = findViewById<Toolbar>(R.id.appbar)
        setSupportActionBar(tbar)

        //supportActionBar?.setDisplayShowTitleEnabled(false);

        val tbCard = findViewById<Toolbar>(R.id.tbCard)
        tbCard.title = "Mi tarjeta"
        tbCard.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_1 -> {
                    Log.i("ActionBar", "Acción 1")
                    true
                }
                R.id.action_2 -> {
                    Log.i("ActionBar", "Acción 2")
                    true
                }
                else -> {
                    true
                }
            }
        }

        tbCard.inflateMenu(R.menu.menu_tarjeta)
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