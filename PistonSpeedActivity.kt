package id.sukowijoyo.rahmathadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PistonSpeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piston_speed)

        val strokeps = findViewById<EditText>(R.id.edstrokeps)
        val rpmps = findViewById<EditText>(R.id.edrpm)
        val cps = findViewById<Button>(R.id.countps)
        val resps = findViewById<TextView>(R.id.edpistonspeed)

        cps.setOnClickListener {
            val sps = strokeps.text.toString().toInt()
            val rps = rpmps.text.toString().toInt()
            val resultps = 2*sps*rps/60/1000
            resps.setText(resultps.toString()+" m/s")
        }
    }
}