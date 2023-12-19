package com.project.tanamanherbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView

class MenuActivity : AppCompatActivity() {

    private lateinit var btnSeledri : CardView
    private lateinit var btnMengkudu : CardView
    private lateinit var btnDaunSirih : CardView
    private lateinit var btnDaunKelor : CardView
    private lateinit var btnLidahBuaya : CardView
    private lateinit var btnKencur : CardView
    private lateinit var btnKumisKucing : CardView
    private lateinit var btnDaunJarak : CardView
    private lateinit var btnSambiloto : CardView
    private lateinit var btnGinseng : CardView
    private lateinit var btnKunyit : CardView
    private lateinit var btnChamomile : CardView
    private lateinit var btnJahe : CardView
    private lateinit var btnRosemary : CardView
    private lateinit var btnDaunMint : CardView
    private lateinit var btnDaunKemangi : CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnSeledri = findViewById(R.id.cvListTanaman)
        btnMengkudu = findViewById(R.id.cvListTanaman2)
        btnDaunSirih = findViewById(R.id.cvListTanaman3)
        btnDaunKelor = findViewById(R.id.cvListTanaman4)
        btnLidahBuaya = findViewById(R.id.cvListTanaman5)
        btnKencur = findViewById(R.id.cvListTanaman6)
        btnKumisKucing = findViewById(R.id.cvListTanaman7)
        btnDaunJarak = findViewById(R.id.cvListTanaman8)
        btnSambiloto = findViewById(R.id.cvListTanaman9)
        btnGinseng = findViewById(R.id.cvListTanaman10)
        btnKunyit = findViewById(R.id.cvListTanaman11)
        btnChamomile = findViewById(R.id.cvListTanaman12)
        btnJahe = findViewById(R.id.cvListTanaman13)
        btnRosemary = findViewById(R.id.cvListTanaman14)
        btnDaunMint = findViewById(R.id.cvListTanaman15)
        btnDaunKemangi = findViewById(R.id.cvListTanaman16)

        btnSeledri.setOnClickListener {
            val move = Intent(this@MenuActivity, seledri_activity::class.java)
            startActivity(move)
        }
        btnMengkudu.setOnClickListener {
            val move = Intent(this@MenuActivity, mengkudu::class.java)
            startActivity(move)
        }
        btnDaunSirih.setOnClickListener {
            val move = Intent(this@MenuActivity, daun_sirih::class.java)
            startActivity(move)
        }
        btnDaunKelor.setOnClickListener {
            val move = Intent(this@MenuActivity, daun_kelor::class.java)
            startActivity(move)
        }
        btnLidahBuaya.setOnClickListener {
            val move = Intent(this@MenuActivity, lidah_buaya::class.java)
            startActivity(move)
        }
        btnKumisKucing.setOnClickListener {
            val move = Intent(this@MenuActivity, kumis_kucing::class.java)
            startActivity(move)
        }
        btnKencur.setOnClickListener {
            val move = Intent(this@MenuActivity, kencur::class.java)
            startActivity(move)
        }
        btnDaunJarak.setOnClickListener {
            val move = Intent(this@MenuActivity, daun_jarak::class.java)
            startActivity(move)
        }
        btnSambiloto.setOnClickListener {
            val move = Intent(this@MenuActivity, sambiloto::class.java)
            startActivity(move)
        }
        btnGinseng.setOnClickListener {
            val move = Intent(this@MenuActivity, ginseng::class.java)
            startActivity(move)
        }
        btnKunyit.setOnClickListener {
            val move = Intent(this@MenuActivity, kunyit::class.java)
            startActivity(move)
        }
        btnChamomile.setOnClickListener {
            val move = Intent(this@MenuActivity, chamomile::class.java)
            startActivity(move)
        }
        btnJahe.setOnClickListener {
            val move = Intent(this@MenuActivity, jahe::class.java)
            startActivity(move)
        }
        btnRosemary.setOnClickListener {
            val move = Intent(this@MenuActivity, rosemary::class.java)
            startActivity(move)
        }
        btnDaunMint.setOnClickListener {
            val move = Intent(this@MenuActivity, daun_mint::class.java)
            startActivity(move)
        }
        btnDaunKemangi.setOnClickListener {
            val move = Intent(this@MenuActivity, daun_kemangi::class.java)
            startActivity(move)
        }

    }
}