package id.sukowijoyo.rahmathadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EngineDisplacementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engine_displacement)

        val boreed = findViewById<EditText>(R.id.edbore)
        val strokeed = findViewById<EditText>(R.id.edstroke)
        val cyled = findViewById<EditText>(R.id.edcyl)
        val counted = findViewById<Button>(R.id.countdisp)
        val resed = findViewById<TextView>(R.id.edcc)

        counted.setOnClickListener {
            val bv = boreed.text.toString().toInt()
            val sv = strokeed.text.toString().toInt()
            val cv = cyled.text.toString().toInt()
            val resulted = ((0.785*bv*bv*sv)*cv)/1000
            resed.setText(resulted.toString()+" cc")
        }
    }
}