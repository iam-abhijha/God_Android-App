package abhi.app.clan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.mrtechy.god.R

class LoginActivity : AppCompatActivity(){


    lateinit var etId: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button

    val validId = "god"
    val validPassword = arrayOf("deadshot","pundi","beast","hackzie","god")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "Log In"

        etId = findViewById(R.id.etId)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)



        btnLogin.setOnClickListener {

            val loginId = etId.text.toString()
            val loginPass = etPassword.text.toString()
            var playerName = "God clan member"
            val intent = Intent(this@LoginActivity, MainActivity::class.java)


            if (loginId == validId){
                if(loginPass == validPassword[0]){
                    playerName ="DeadShot"
                    intent.putExtra("Name", playerName)
                    startActivity(intent)
                }
                else if(loginPass == validPassword[1]){
                    playerName = "Pundi"
                    intent.putExtra("Name", playerName)
                    startActivity(intent)
                }
                else if(loginPass == validPassword[2]){
                    playerName = "Beast"
                    intent.putExtra("Name", playerName)
                    startActivity(intent)
                }
                else if(loginPass == validPassword[3]){
                    playerName = "Hackzie"
                    intent.putExtra("Name", playerName)
                    startActivity(intent)
                }
                else if(loginPass == validPassword[4]){
                    playerName = "Guest User"
                    intent.putExtra("Name", playerName)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this@LoginActivity, "Incorrect Password", Toast.LENGTH_LONG).show()
                }
            }
            else {
                Toast.makeText(this@LoginActivity, "Incorrect ID", Toast.LENGTH_LONG).show()
            }


        }


    }

    override fun onPause(){
        super.onPause()
        finish()
    }


}