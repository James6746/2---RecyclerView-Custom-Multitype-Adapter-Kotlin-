package com.example.a2_recyclerviewcustommultitypeadapterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var studentArrayList: ArrayList<Student>
    lateinit var recyclerView: RecyclerView
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        studentArrayList = ArrayList()
        recyclerView = findViewById(R.id.recycler_view)
        customAdapter = CustomAdapter(this@MainActivity, studentArrayList)
        recyclerView.setAdapter(customAdapter)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        addItemsToTheStudentArrayList()
    }

    private fun addItemsToTheStudentArrayList() {
        for (i in 0..19) {
            if (i % 4 == 0) {
                studentArrayList.add(Student("Bozorboyeva Muyassar Davron qizi", 19, false))
            } else if (i % 3 == 1) {
                studentArrayList.add(Student("Sobirov Jamshid Sadulla o'g'li", 20, true))
            } else if (i % 3 == 2) {
                studentArrayList.add(Student("Sobirov Otabek Sadulla o'g'li", 23, true))
            } else {
                studentArrayList.add(Student("Matchanova Dinora Sadulla qizi", 19, true))
            }
        }
    }
}