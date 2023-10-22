package solutions.doto.duckdb_ndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import solutions.doto.duckdb_ndk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = "hello"
    }

    /**
     * A native method that is implemented by the 'duckdb_ndk' native library,
     * which is packaged with this application.
     */
    // external fun stringFromJNI(): String

    // companion object {
    //     // Used to load the 'duckdb_ndk' library on application startup.
    //     init {
    //         System.loadLibrary("duckdb_ndk")
    //     }
    // }
}