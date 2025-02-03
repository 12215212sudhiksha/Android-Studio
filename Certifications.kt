package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Certifications : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_certifications)
        //certifications
        val certification1 = findViewById<ImageButton>(R.id.imgbutton1)
        val certification2 = findViewById<ImageButton>(R.id.imgbutton2)
        val certification3 = findViewById<ImageButton>(R.id.imgbutton3)


        certification1.setOnClickListener {
            val popup = PopupMenu(this, certification1)
            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.share -> {
                        Toast.makeText(this, "Share clicked", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            popup.show()
        }








        certification1.setOnClickListener {
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data =
                            Uri.parse("https://www.geeksforgeeks.org/certificate/0cbd6891729a15f0d842ba4ea810492c")
                        startActivity(intent)
                    }
                    certification2.setOnClickListener {
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data =
                            Uri.parse("https://www.coursera.org/account/accomplishments/verify/57KT97KJD6SE")
                        startActivity(intent)


                    }
                    certification3.setOnClickListener {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data =
                            Uri.parse("https://www.coursera.org/account/accomplishments/verify/FLY5PSV9KXY4")
                        startActivity(intent)
                    }


                }
            }





