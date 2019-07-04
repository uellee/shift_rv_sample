package org.bitbucket.uellee.shiftrvsample

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vh_foo.view.*

class FooVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(string: String) {
        itemView.tv_foo.text = string
    }
}