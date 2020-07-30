package net.sgoliver.android.appbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var cmbToolbar : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tbar = findViewById<Toolbar>(R.id.appbar)
        setSupportActionBar(tbar)

        /*
        // Código para filtros en el app bar

        supportActionBar?.setDisplayShowTitleEnabled(false);

        cmbToolbar = findViewById(R.id.cmbToolbar)

        val datos = arrayOf("Opción 1", "Opción 2", "Opción 3")
        val adaptador =
            ArrayAdapter(this, R.layout.appbar_filter_title, datos)

        adaptador.setDropDownViewResource(
            R.layout.appbar_filter_list)

        cmbToolbar.adapter = adaptador

        cmbToolbar.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>) {
                //... Acciones al no existir ningún elemento seleccionado
            }
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                //... Acciones al seleccionar una opción de la lista
                Log.i("Appbar 3", "Seleccionada opción " + position);
            }
        }
        */

        // Código para Tabs
        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        viewPager.adapter = MiFragmentPagerAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.appbartabs)
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
        tabLayout.setupWithViewPager(viewPager)
    }
}