package com.example.modul5_cardview_recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cobarv.Inis_Variable

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable(
            R.drawable.lala,
            namamhs = "Sara",
            Nimmhs = "1801",
            Telpmhs = "085244"
        ),
        Inis_Variable(
            R.drawable.neo,
            namamhs = "Neo",
            Nimmhs = "2010",
            Telpmhs = "085245"
        ),
        Inis_Variable(
            R.drawable.lala,
            namamhs = "Sara",
            Nimmhs = "1805",
            Telpmhs = "085246"
        ),
        Inis_Variable(
            R.drawable.neo,
            namamhs = "Neo",
            Nimmhs = "2090",
            Telpmhs = "085247"
        )

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

//        ShowListMahasiswa()
//        ShowGridMahasiswa()
        ShowCardMahasiswa()
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = CardMahasiswa(this, Datamahasiswa) {}
        recyclerView.adapter = adapter
    }

//    private fun ShowGridMahasiswa() {
//        val adapter = Grid_MahasiswaAdapter(grid_mhs = Datamahasiswa){}
//        val recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
//        recyclerView.layoutManager = GridLayoutManager (this, 2)
//        recyclerView.adapter = Grid_MahasiswaAdapter (Datamahasiswa) {
//        }
//    }
//
//    private fun ShowListMahasiswa() {
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter= List_MahasiswaAdapter(this,
//            Datamahasiswa){
//        }
//    }
}