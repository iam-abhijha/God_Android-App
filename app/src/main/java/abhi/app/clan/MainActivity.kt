package abhi.app.clan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mrtechy.god.R
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (intent != null){
          title = intent.getStringExtra("Name")
        }
        else {
            title = "God clan member"
        }


    }


    fun exitButton(view: View) {
        this@MainActivity.finish()
        exitProcess(0)
    }

    fun comingSoon(view: View){
        val intent = Intent(this@MainActivity, ComingSoon::class.java)
        startActivity(intent)

    }

}