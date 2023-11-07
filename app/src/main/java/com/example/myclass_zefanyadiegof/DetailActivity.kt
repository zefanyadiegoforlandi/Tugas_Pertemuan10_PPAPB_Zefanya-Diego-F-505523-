package com.example.myclass_zefanyadiegof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myclass_zefanyadiegof.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mahasiswaNama = intent.getStringExtra("mahasiswa_nama").toString()
        val mahasiswaIpk = intent.getDoubleExtra("mahasiswa_ipk", 0.0)
        val mahasiswaTanggallahir = intent.getStringExtra("mahasiswa_tanggallahir").toString()
        val mahasiswaNomor = intent.getStringExtra("mahasiswa_nomor").toString()
        val mahasiswaAboutMe = intent.getStringExtra("mahasiswa_aboutme").toString()
        val mahasiswaPict = intent.getIntExtra("mahasiswa_pict", 0)

        with(binding) {
            namaMahasiswaTextView.text = "Nama Mahasiswa: $mahasiswaNama"
            ipkMahasiswaTextView.text = "IPK: $mahasiswaIpk"
            tanggalLahirTextView.text = "Tanggal Lahir: $mahasiswaTanggallahir"
            nomorMahasiswaTextView.text = "Nomor Mahasiswa: $mahasiswaNomor"
            aboutMeMahasiswaTextView.text = "About Me: $mahasiswaAboutMe"
            imgMahasiswaImg.setImageResource(mahasiswaPict)
        }
    }

    fun onBackButtonClick(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
