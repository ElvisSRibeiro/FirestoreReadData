package com.example.firestorereaddata

import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.user_row.view.*

class UserItem(val user: List<User>) :Item<ViewHolder>(){
    override fun getLayout(): Int {

        return  R.layout.user_row

    }

    override fun bind(viewHolder: ViewHolder, position: Int) {

        val user = user[position]
        viewHolder.itemView.textView_Firstname.text = user.firstname
        viewHolder.itemView.textView_Lastname.text = user.lastname
        viewHolder.itemView.textView_Birthplace.text = user.birthplace

    }
}