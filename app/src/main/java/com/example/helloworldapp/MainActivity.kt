package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvHello: TextView
    private lateinit var btnTampilkan: Button
    private lateinit var tvIdentitas: TextView

    private val nama = "I Kadek Bintang Adi Bimantara"
    private val nim  = "2405551049"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello      = findViewById(R.id.tvHello)
        btnTampilkan = findViewById(R.id.btnTampilkan)
        tvIdentitas  = findViewById(R.id.tvIdentitas)

        btnTampilkan.setOnClickListener {
            tvIdentitas.text = "Nama : $nama\nNIM  : $nim"
            tvIdentitas.visibility = View.VISIBLE

            btnTampilkan.text = "Sembunyikan"

            btnTampilkan.setOnClickListener {
                tvIdentitas.visibility = View.GONE
                btnTampilkan.text = "Tampilkan Identitas"

                btnTampilkan.setOnClickListener {
                    tvIdentitas.text = "Nama : $nama\nNIM  : $nim"
                    tvIdentitas.visibility = View.VISIBLE
                    btnTampilkan.text = "Sembunyikan"
                }
            }
        }
    }
}