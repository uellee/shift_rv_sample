package org.bitbucket.uellee.shiftrvsample

interface FooView {
    fun showMessage(message: String)
    fun clearItemList()
    fun showItem(item: Item)
    fun clearItemName()
}