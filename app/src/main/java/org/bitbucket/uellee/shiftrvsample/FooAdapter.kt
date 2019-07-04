package org.bitbucket.uellee.shiftrvsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FooAdapter : RecyclerView.Adapter<FooVH>() {

    val itemList: MutableList<Item> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        LayoutInflater.from(parent.context)
            .inflate(R.layout.vh_foo, parent, false)
            .let { FooVH(it) }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: FooVH, position: Int) {
        holder.bind(itemList[position].name)
    }

    fun addFoo(item: Item) {
        itemList.add(0, item)
        notifyItemInserted(0)
    }

    fun clear() {
        itemList.clear()
        notifyDataSetChanged()
    }
}