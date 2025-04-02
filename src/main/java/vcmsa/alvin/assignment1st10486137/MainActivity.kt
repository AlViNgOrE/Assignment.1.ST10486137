package vcmsa.alvin.assignment1st10486137

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.food)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val timeOfDay = findViewById<EditText>(R.id.editText1)
        val suggestions = findViewById<EditText>(R.id.Suggestion)
        val button = findViewById<EditText>(R.id.Reset)
        val meal = findViewById<EditText>(R.id.editText3)

        //button the button click action
        reset.setOnClickListner
        val breakFast = (Grits)
        val midMorningSnack = (plainYoghurt)
        val lunch = (burgerAndFries)
        val afternoonSnack = (fruitSalad)
        val dinner = (Lasagna)
        val dessert = (muffinAndCustard)


        //Button.setOnClickListner
        button.setOnClickListener { }
        val meal =
            editText1.text.toString()
        if (meal.isEmpty()) {
        }
        Toast.makeText(this, "Please Enter a Meal", Toast.LENGTH_SHORT).show()
     } else {
     val suggestion = suggestion.text.toString().
}
}    } else {
     Toast.makeText(this, "Please Enter Time Of Day", Toast.LENGTH_SHORT).show()

      if (editText1(meal.toString())
}    }else{
    Toast.makeText(this, "Please Enter a Suggestion", Toast.LENGTH_SHORT).show()

      if ()





    

