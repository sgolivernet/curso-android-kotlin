package net.sgoliver.android.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentDetalle : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_detalle, container, false)
    }

    fun mostrarDetalle(texto: String) {
        val txtDetalle = view!!.findViewById(R.id.txtDetalle) as TextView

        txtDetalle.text = texto
    }
}