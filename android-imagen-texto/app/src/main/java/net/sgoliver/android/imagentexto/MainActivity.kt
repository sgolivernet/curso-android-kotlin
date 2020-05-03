package net.sgoliver.android.imagentexto

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.Html
import android.text.Spannable
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.TextView.BufferType

class MainActivity : AppCompatActivity() {

    private lateinit var imgLogo : ImageView
    private lateinit var lblEtiqueta : TextView
    private lateinit var txtBasico : EditText
    private lateinit var btnSetText : Button
    private lateinit var btnNegrita : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Establecer propiedades de la imagen por código:
        //imgLogo = findViewById(R.id.imgLogo)
        //imgLogo.setImageResource(R.drawable.logoandroid)

        //Estalecer propiedades de la etiqueta de texto por código:
        //lblEtiqueta = findViewById(R.id.lblEtiqueta)
        //val texto = lblEtiqueta.text.toString()
        //lblEtiqueta.text = "$texto (modificado)"
        //lblEtiqueta.setBackgroundColor(Color.RED)

        //Establecer propiedades del cuadro de texto por código:
        txtBasico = findViewById(R.id.txtBasico)
        //val mitexto = txtBasico.text.toString()
        //txtBasico.setText("Otro texto")

        //Convertir a HTML el contenido del control
        //val aux2 = Html.toHtml(txtBasico.text, Html.TO_HTML_PARAGRAPH_LINES_INDIVIDUAL)

        //Convertir HTML a Spannable
        //txtBasico.setText(
        //    Html.fromHtml("<p>Esto es un <b>simulacro</b>.</p>", Html.FROM_HTML_MODE_LEGACY),
        //    BufferType.SPANNABLE);

        //Eventos de botones

        btnSetText = findViewById(R.id.btnSetText)
        btnSetText.setOnClickListener {
            //Creamos un nuevo objeto de tipo Editable
            //Y marcamos cono fuente negrita la palabra "simulacro" (caracteres del 11-19)
            val str = Editable.Factory.getInstance().newEditable("Esto es un simulacro.")
            str.setSpan(StyleSpan(Typeface.BOLD), 11, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            txtBasico.text = str
        }

        btnNegrita = findViewById(R.id.btnNegrita)
        btnNegrita.setOnClickListener {
            val texto = txtBasico.text;

            val ini = txtBasico.selectionStart;
            val fin = txtBasico.selectionEnd;

            texto.setSpan(
                StyleSpan(Typeface.BOLD),
                ini, fin,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
    }
}
