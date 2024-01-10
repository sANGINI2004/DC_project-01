package com.example.dc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alpha1 = findViewById<TextView>(R.id.alpha1).text
        val alpha2 = findViewById<TextView>(R.id.alpha2).text
        val alpha3 = findViewById<TextView>(R.id.alpha3).text
        val alpha4 = findViewById<TextView>(R.id.alpha4).text
        val alpha5 = findViewById<TextView>(R.id.alpha5).text

        val beta1 = findViewById<TextView>(R.id.beta1).text
        val beta2 = findViewById<TextView>(R.id.beta2).text
        val beta3 = findViewById<TextView>(R.id.beta3).text
        val beta4 = findViewById<TextView>(R.id.beta4).text
        val beta5 = findViewById<TextView>(R.id.beta5).text

        val gamma1 = findViewById<TextView>(R.id.gamma1).text
        val gamma2 = findViewById<TextView>(R.id.gamma2).text
        val gamma3 = findViewById<TextView>(R.id.gamma3).text
        val gamma4 = findViewById<TextView>(R.id.gamma4).text
        val gamma5 = findViewById<TextView>(R.id.gamma5).text

        val intent = Intent(this,graphActivity::class.java)
        intent.putExtra("alpha1",alpha1)
        intent.putExtra("alpha2",alpha2)
        intent.putExtra("alpha3",alpha3)
        intent.putExtra("alpha4",alpha4)
        intent.putExtra("alpha5",alpha5)

        intent.putExtra("beta1",beta1)
        intent.putExtra("beta2",beta2)
        intent.putExtra("beta3",beta3)
        intent.putExtra("beta4",beta4)
        intent.putExtra("beta5",beta5)

        intent.putExtra("gamma1",gamma1)
        intent.putExtra("gamma2",gamma2)
        intent.putExtra("gamma3",gamma3)
        intent.putExtra("gamma4",gamma4)
        intent.putExtra("gamma5",gamma5)


    }
}