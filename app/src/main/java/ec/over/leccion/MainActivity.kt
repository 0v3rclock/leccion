package ec.over.leccion

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val editText = findViewById<EditText>(R.id.editTextNumber)
        val button = findViewById<Button>(R.id.verificar)
        imageButton.setOnClickListener {
            finish()
        }
        button.setOnClickListener {
         if (editText.text.toString().toInt() >= 70){
             editText.setText("aprobado")
         }else{
             editText.setText("reprobado")
         }
        }

    }
}