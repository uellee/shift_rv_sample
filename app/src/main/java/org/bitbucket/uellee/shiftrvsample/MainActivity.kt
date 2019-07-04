package org.bitbucket.uellee.shiftrvsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

const val EMPTY_STRING = ""

class MainActivity : AppCompatActivity(), FooView {

    private val adapter = FooAdapter()
    private val presenter = FooPresenter(TODO("реализовать источник элементов"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_foo.adapter = adapter
        rv_foo.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        b_foo.setOnClickListener { presenter.onApplyClick() }

        addButton.setOnClickListener {
            presenter.onAddClick(itemNameEditText.text.toString())
        }

        presenter.init(this)
    }

    override fun showMessage(message: String) {
        Toast.makeText(
            this,
            message,
            Toast.LENGTH_LONG
        ).show()
    }

    override fun clearItemList() {
        adapter.clear()
    }

    override fun showItem(item: Item) {
        adapter.addFoo(item)
    }

    override fun clearItemName() {
        itemNameEditText.setText(EMPTY_STRING)
    }
}