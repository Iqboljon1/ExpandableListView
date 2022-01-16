package com.ir.homework12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.ir.homework12.Adapter.ExpandableAdapter_Task1
import com.ir.homework12.UserData.UserData_Task1
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    lateinit var titleList: ArrayList<String>
    lateinit var map: HashMap<String, List<UserData_Task1>>
    lateinit var expandableListAdapter: ExpandableAdapter_Task1
    lateinit var alertDialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        titleList = ArrayList()
        map = HashMap()
        titleList.add("Fruits")
        titleList.add("Flowers")
        titleList.add("Animals")
        titleList.add("Birds")
        map[titleList[0]] = listOf(
            UserData_Task1("Apple", R.drawable.apple),
            UserData_Task1("Kiwi", R.drawable.kiwi),
            UserData_Task1("Orange", R.drawable.orange_juice)
        )
        map[titleList[1]] = listOf(
            UserData_Task1("Rose", R.drawable.rose),
            UserData_Task1("Pink cosmos", R.drawable.pink_cosmos),
            UserData_Task1("Sunflower", R.drawable.sunflower)
        )
        map[titleList[2]] = listOf(
            UserData_Task1("Dog", R.drawable.dog),
            UserData_Task1("Lion", R.drawable.lion),
            UserData_Task1("Fox", R.drawable.fox)
        )
        map[titleList[3]] = listOf(
            UserData_Task1("Humming", R.drawable.humming_bird),
            UserData_Task1("Macaw", R.drawable.macaw),
            UserData_Task1("Dove", R.drawable.dove)
        )
        expandableListAdapter = ExpandableAdapter_Task1(titleList, map, this)
        expandable_task1.setAdapter(expandableListAdapter)

        Object.boolean = false
        switch_startActivity.setOnCheckedChangeListener { _, isChecked ->
            Object.boolean = isChecked
        }

    }
}