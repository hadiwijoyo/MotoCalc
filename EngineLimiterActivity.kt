package id.sukowijoyo.rahmathadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EngineLimiterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engine_limiter)

        val slim = findViewById<EditText>(R.id.edstrokelim)
        val plim = findViewById<EditText>(R.id.edpistonspeedlim)
        val clim = findViewById<Button>(R.id.countlim)
        val reslim = findViewById<TextView>(R.id.edrpmlim)

        clim.setOnClickListener {
            val sl = slim.text.toString().toInt()
            val pl = plim.text.toString().toInt()
            val resultlim = pl*60/sl/2*1000
            reslim.setText(resultlim.toString()+" RPM")
        }
    }
}