package com.example.testapplication.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testapplication.R
import com.example.testapplication.view.dao.UserEntity
import com.example.testapplication.view.network.model.User
import kotlinx.android.synthetic.main.item_layout.view.*

class UserAdapter(private var listUser: ArrayList<UserEntity>) :
    RecyclerView.Adapter<UserAdapter.CustomView>() {

    class CustomView(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: UserEntity) {
            itemView.textViewUserName.text = user.name
            itemView.textViewUserEmail.text = user.email
            Glide.with(itemView.imageViewAvatar.context)
                .load(user.avatar)
                .into(itemView.imageViewAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CustomView(
        LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
    )

    override fun onBindViewHolder(holder: CustomView, position: Int) {
        holder.bind(listUser.get(position))
    }

    override fun getItemCount(): Int {
        return listUser.size
    }


    fun addData(listUser: List<UserEntity>){
        this.listUser.addAll(listUser)
    }
}