package id.sukowijoyo.rahmathadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enginedisp = findViewById<Button>(R.id.engine_displacement)
        enginedisp.setOnClickListener {
            val intent = Intent(this, EngineDisplacementActivity::class.java)
            startActivity(intent)
        }
        val pistonsp = findViewById<Button>(R.id.piston_speed)
        pistonsp.setOnClickListener {
            val intent = Intent(this, PistonSpeedActivity::class.java)
            startActivity(intent)
        }
        val enginelim = findViewById<Button>(R.id.engine_limiter)
        enginelim.setOnClickListener {
            val intent = Intent(this, EngineLimiterActivity::class.java)
            startActivity(intent)
        }
    }
}