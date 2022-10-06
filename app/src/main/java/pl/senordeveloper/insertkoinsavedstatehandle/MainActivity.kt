package pl.senordeveloper.insertkoinsavedstatehandle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.senordeveloper.insertkoinsavedstatehandle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activityMainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)
    }
}