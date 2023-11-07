package com.example.myclass_zefanyadiegof

import MahasiswaAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myclass_zefanyadiegof.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "My Class"

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapterMahasiswa = MahasiswaAdapter(generateMahasiswaData()) { mahasiswa ->
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("mahasiswa_nama", mahasiswa.nama)
            intent.putExtra("mahasiswa_ipk", mahasiswa.ipk)
            intent.putExtra("mahasiswa_tanggallahir", mahasiswa.tanggalLahir)
            intent.putExtra("mahasiswa_nomor", mahasiswa.nomorMahasiswa)
            intent.putExtra("mahasiswa_aboutme", mahasiswa.aboutMe)
            intent.putExtra("mahasiswa_pict",mahasiswa.pict)
            startActivity(intent)
        }


        with(binding) {
            mahasiswaRecyclerView.apply {
                adapter = adapterMahasiswa
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }

    private fun generateMahasiswaData(): List<Mahasiswa> {
        return listOf(
            Mahasiswa(nama = "tom",
                ipk = 3.6,
                tanggalLahir = "2002-05-20",
                nomorMahasiswa = "M1",
                pict = R.drawable.tom,
                aboutMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "

            ),
            Mahasiswa(nama = "minji",
                ipk = 3.9,
                tanggalLahir = "2003-05-20",
                nomorMahasiswa = "M2",
                pict = R.drawable.minji,
                aboutMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            ),
            Mahasiswa(nama = "haerin",
                ipk = 4.0,
                tanggalLahir = "2006-05-15",
                nomorMahasiswa = "M3",
                pict = R.drawable.haerin,
                aboutMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            ),
            Mahasiswa(nama = "wonyoung",
                ipk = 3.6,
                tanggalLahir = "2004-01-20",
                nomorMahasiswa = "M4",
                pict = R.drawable.jangwonyoung,
                aboutMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            ),
            Mahasiswa(nama = "bangdo",
                ipk = 3.5,
                tanggalLahir = "2003-12-2",
                nomorMahasiswa = "M5",
                pict = R.drawable.bangdo,
                aboutMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            ),
            Mahasiswa(nama = "bangmes",
                ipk = 3.7,
                tanggalLahir = "2003-2-20",
                nomorMahasiswa = "M6",
                pict = R.drawable.bangmes,
                aboutMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            ),
            Mahasiswa(nama = "mudryk",
                ipk = 3.8,
                tanggalLahir = "2003-05-20",
                nomorMahasiswa = "M7",
                pict = R.drawable.mudryk,
                aboutMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            ),
            Mahasiswa(nama = "zee",
                ipk = 3.5,
                tanggalLahir = "2004-07-15",
                nomorMahasiswa = "M8",
                pict = R.drawable.zee,
                aboutMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            ),


        )
    }
}
