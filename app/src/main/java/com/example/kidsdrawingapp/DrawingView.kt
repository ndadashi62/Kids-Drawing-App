package com.example.kidsdrawingapp

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes

class DrawingView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private var mDrawpath: CustomPath? = null
    private var mCanvasBitmap: Bitmap? = null
    private var mDrawPaint: Paint? = null
    private var mConvasPaint: Paint?= null
    private var mBrushSize:Float=0.toFloat()
    private var color=Color.BLACK
    private var canvas:Canvas?=null

    init {
        setUpDrawing()
    }
    private fun setUpDrawing(){
        mDrawPaint=Paint()
        mDrawpath=CustomPath(color,mBrushSize)
        mDrawPaint!!.color=color
        mDrawPaint!!.style=Paint.Style.STROKE
        mDrawPaint!!.strokeCap=Paint.Cap.ROUND
        mConvasPaint= Paint(Paint.DITHER_FLAG)
        mBrushSize=20.toFloat()
    }



    internal inner class CustomPath(var color: Int, var brushThickness: Float) : Path() {

    }
}
