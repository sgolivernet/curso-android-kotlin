package net.sgoliver.android.controlpers1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.EditText

class ExtendedEditText : EditText {

    val p1 = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLACK
        style = Paint.Style.FILL
    }

    val p2 = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 30f
    }

    val escala = resources.displayMetrics.density;

    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
    constructor(ctx: Context, attrs: AttributeSet, defStyleAttr: Int) : super(ctx, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas) {
        //Llamamos al método de la clase base (EditText)
        super.onDraw(canvas)

        //Dibujamos el fondo negro del contador
        canvas.drawRect(width - 30*escala,
            5 * escala,
            width - 5*escala,
            25*escala, p1)

        //Dibujamos el número de caracteres sobre el contador
        canvas.drawText("" + text.toString().length,
            width - 28*escala,
            17*escala, p2)
    }
}