package com.example.dc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

class graphActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graph)

        val lineGraphView = findViewById<GraphView>(R.id.graph)

        val alpha1 = intent.getStringExtra("alpha1")
        val alpha2 = intent.getStringExtra("alpha2")
        val alpha3 = intent.getStringExtra("alpha3")
        val alpha4 = intent.getStringExtra("alpha4")
        val alpha5 = intent.getStringExtra("alpha5")


        // Series 1
        val series1: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 0.0),
                DataPoint(0.5, alpha1!!.toDouble()),
                DataPoint(1.0, alpha2!!.toDouble()),
                DataPoint(1.5, alpha3!!.toDouble()),
                DataPoint(2.0, alpha4!!.toDouble()),
                DataPoint(2.5, alpha5!!.toDouble())
            )
        )

        // Series 2
        val series2: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 0.0),
                DataPoint(0.5, 3.0),
                DataPoint(1.0, 4.0),
                DataPoint(1.5, 9.0),
                DataPoint(2.0, 6.0),
                DataPoint(2.5, 3.0)
            )
        )

        val series3: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 0.0),
                DataPoint(0.5, 3.0),
                DataPoint(1.0, 4.0),
                DataPoint(1.5, 9.0),
                DataPoint(2.0, 6.0),
                DataPoint(2.5, 3.0)
            )
        )

        // Customize series properties if needed
        series1.setColor(Color.BLACK)
        series1.title = "Series 1"

        series2.setColor(Color.BLUE)
        series2.title = "Series 2"

        series3.setColor(Color.RED)
        series3.title = "Series 3"

        // Add series to the graph
        lineGraphView.addSeries(series1)
        lineGraphView.addSeries(series2)
        lineGraphView.addSeries(series3)

        // Customize graph properties
        lineGraphView.title = "Demo Graph"
        lineGraphView.viewport.isScrollable = true
        lineGraphView.viewport.isScalable = true
    }
}