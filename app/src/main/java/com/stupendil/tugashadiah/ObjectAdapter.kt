package com.stupendil.tugashadiah

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView

class ObjectAdapter(private val context: Context, private val objectItem: List<ObjectItem>, val listener: (ObjectItem) -> Unit)
    : RecyclerView.Adapter<ObjectAdapter.ObjectViewHolder>(){

    class ObjectViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgObjectItem = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameObject = view.findViewById<TextView>(R.id.tv_item_name)
        val desctItem = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(objectItem: ObjectItem, listener: (ObjectItem) -> Unit){
            imgObjectItem.setImageResource(objectItem.imgObjectItem)
            nameObject.text = objectItem.nameObject
            desctItem.text = objectItem.desctItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObjectViewHolder {
        return ObjectViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_recycler, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ObjectViewHolder, position: Int) {
        holder.bindView(objectItem[position], listener)
    }

    override fun getItemCount(): Int = objectItem.size
}