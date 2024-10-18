package com.example.practica1

import android.content.Intent
import android.net.Uri
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val imagen : ImageView= findViewById(R.id.imagen)
        val imagen2 : ImageView= findViewById(R.id.imageView7)
        val imagen3 : ImageView= findViewById(R.id.imageView8)
        val imagen4 : ImageView= findViewById(R.id.imageView9)

        val button1 = findViewById<Button>(R.id.button4)

        button1.setOnClickListener{
            val url = "https://es.wikipedia.org/wiki/Cristiano_Ronaldo"

            val intent = Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button6)

        button2.setOnClickListener{
            val url = "https://es.wikipedia.org/wiki/Lionel_Messi"

            val intent = Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button7)

        button3.setOnClickListener{
            val url = "https://es.wikipedia.org/wiki/Kylian_Mbappé"

            val intent = Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button8)

        button4.setOnClickListener{
            val url = "https://es.wikipedia.org/wiki/Erling_Haaland"

            val intent = Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(intent)
        }

        Glide.with(this)
            .load("https://images.ecestaticos.com/vY_1ITbiCrfX3tnDK7cSltQWXig=/0x0:2272x1515/972x547/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2F066%2Fa42%2Fe7a%2F066a42e7a126c5bf5b73fd3d4f1b6606.jpg")
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

            .into(imagen)

        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/b/b4/Lionel-Messi-Argentina-2022-FIFA-World-Cup_%28cropped%29.jpg")
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

            .into(imagen2)

        Glide.with(this)
            .load("https://assets.laliga.com/squad/2024/t186/p220160/2048x2048/p220160_t186_2024_1_002_000.jpg")
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

            .into(imagen3)

        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/ManCity20240722-031_%28cropped%29.jpg/1200px-ManCity20240722-031_%28cropped%29.jpg")
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

            .into(imagen4)

    }
}