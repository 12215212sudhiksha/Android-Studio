package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
//import android.provider.ContactsContract

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val t: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(t)


        val education = findViewById<ImageButton>(R.id.imgbutton1)
        val skills = findViewById<ImageButton>(R.id.imgbutton2)
        val certifications = findViewById<ImageButton>(R.id.imgbutton3)
        val projects = findViewById<ImageButton>(R.id.imgbutton4)








        education.setOnClickListener { view ->
            Snackbar.make(view, "Education", Snackbar.LENGTH_LONG).setAction("OPEN") {
                val intent = Intent(this, Education::class.java)
                Toast.makeText(this, "Education", Toast.LENGTH_LONG).show()
                startActivity(intent)
            }.show()


        }
        skills.setOnClickListener { view ->
            Snackbar.make(view, "Skills", Snackbar.LENGTH_LONG).setAction("OPEN") {
                val intent = Intent(this, Skills::class.java)
                Toast.makeText(this, "Skills", Toast.LENGTH_LONG).show()
                startActivity(intent)

            }.show()
        }
        certifications.setOnClickListener { view ->
            Snackbar.make(view, "Certifications", Snackbar.LENGTH_LONG).setAction("OPEN") {
                val intent = Intent(this, Certifications::class.java)
                Toast.makeText(this, "Certifications", Toast.LENGTH_LONG).show()
                startActivity(intent)

            }.show()
        }
        projects.setOnClickListener { view ->
            Snackbar.make(view, "Projects", Snackbar.LENGTH_LONG).setAction("OPEN") {
                val intent = Intent(this, Projects::class.java)
                Toast.makeText(this, "Projects", Toast.LENGTH_LONG).show()
                startActivity(intent)
            }.show()

        }



    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.i1 -> {

                val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@gmail.com"))
                    putExtra(Intent.EXTRA_SUBJECT, "Subject Here")
                }
                if (emailIntent.resolveActivity(packageManager) != null) {
                    startActivity(emailIntent)
                }

                Toast.makeText(this, "Email clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.i2 -> {
                val intent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:123456789")
                }
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "No app available to handle the action", Toast.LENGTH_SHORT).show()
                }
                true
            }





            R.id.i3 -> {

                val feedbackIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf("feedback@example.com"))
                    putExtra(Intent.EXTRA_SUBJECT, "Feedback")
                }
                if (feedbackIntent.resolveActivity(packageManager) != null) {
                    startActivity(feedbackIntent)
                }

                Toast.makeText(this, "Feedback clicked", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.i4 -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/tsvsudhiksha/"))
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
