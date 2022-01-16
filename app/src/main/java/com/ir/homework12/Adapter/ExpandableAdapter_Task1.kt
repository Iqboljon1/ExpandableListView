package com.ir.homework12.Adapter

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.ir.homework12.MainActivity3
import com.ir.homework12.Object
import com.ir.homework12.R
import com.ir.homework12.UserData.UserData_Task1
import kotlinx.android.synthetic.main.itemchild_task1.view.*
import kotlinx.android.synthetic.main.itemgroup_task1.view.*

class ExpandableAdapter_Task1(var titleLis: ArrayList<String>, var map: HashMap<String, List<UserData_Task1>>, var context: Context) :
    BaseExpandableListAdapter() {
    override fun getGroupCount(): Int = titleLis.size

    override fun getChildrenCount(groupPosition: Int): Int = map[titleLis[groupPosition]]!!.size

    override fun getGroup(groupPosition: Int): Any = titleLis[groupPosition]

    override fun getChild(groupPosition: Int, childPosition: Int): Any =
        map[titleLis[groupPosition]]!![childPosition]

    override fun getGroupId(groupPosition: Int): Long = groupPosition.toLong()

    override fun getChildId(groupPosition: Int, childPosition: Int): Long = childPosition.toLong()

    override fun hasStableIds(): Boolean = false

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val itemView: View
        if (convertView == null) {
            itemView = LayoutInflater.from(parent?.context)
                .inflate(R.layout.itemgroup_task1, parent, false)
        } else {
            itemView = convertView
        }

        itemView.tv_groupName.text = titleLis[groupPosition]

        return itemView
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val itemView: View
        if (convertView == null) {
            itemView = LayoutInflater.from(parent?.context)
                .inflate(R.layout.itemchild_task1, parent, false)
        } else {
            itemView = convertView
        }

        itemView.tv_childName.text = map[titleLis[groupPosition]]!![childPosition].string
        itemView.image_child.setImageResource(map[titleLis[groupPosition]]!![childPosition].int)

        itemView.setOnClickListener {
            if (!Object.boolean){
                val alertDialog = BuildDialog(map[titleLis[groupPosition]]!![childPosition].string , map[titleLis[groupPosition]]!![childPosition].int)
                alertDialog.show()
            }else{
                Object.string = map[titleLis[groupPosition]]!![childPosition].string
                val intent = Intent (context , MainActivity3::class.java)
                context.startActivity(intent)
            }
        }

        return itemView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean = false

    fun BuildDialog(string: String , int: Int) : AlertDialog {
        val alertDialog = AlertDialog.Builder(context)
        val view = LayoutInflater.from(context).inflate(R.layout.itemchild_dialog_task1 , null)
        view.tv_childName.text = string
        view.image_child.setImageResource(int)
        alertDialog.setView(view)
        alertDialog.setTitle(string).setPositiveButton( "Ok" , object  : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {

            }
        })
        return alertDialog.create()
    }
}