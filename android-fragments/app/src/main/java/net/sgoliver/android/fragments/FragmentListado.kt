package net.sgoliver.android.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import net.sgoliver.android.controlpers3.CorreosListener

class FragmentListado : Fragment() {

    private lateinit var lstListado : RecyclerView

    var listener : CorreosListener? = null

    private val datos =
        MutableList(5) { i -> Correo("Persona $i", "Asunto del correo $i", "Texto del correo $i") }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_listado, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        lstListado = view!!.findViewById(R.id.lstListado)

        val adaptador = AdaptadorCorreos(datos) {
            listener?.onCorreoSeleccionado(it)
        }

        lstListado.layoutManager =
            LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)

        lstListado.addItemDecoration(
            DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL)
        )

        lstListado.adapter = adaptador
    }

    fun setCorreosListener(l: CorreosListener) {
        listener = l
    }

    fun setCorreosListener(seleccion: (Correo) -> Unit) {
        listener = object:CorreosListener {
            override fun onCorreoSeleccionado(correo: Correo) {
                seleccion(correo)
            }
        }
    }
}