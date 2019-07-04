package org.bitbucket.uellee.shiftrvsample

class FooPresenter(private val itemListDataSource: ItemListDataSource) {
    lateinit var view: FooView

    fun init(fooView: FooView) {
        view = fooView
    }

    fun onApplyClick() {
        val itemList = itemListDataSource.getItemList()
        val message = "Adding ${itemList.size} elements"
        view.showMessage(message)
        view.clearItemList()
    }

    fun onAddClick(itemName: String) {
        val item = Item(itemName)
        itemListDataSource.addItem(item)
        view.showItem(item)
        view.clearItemName()
    }
}

interface ItemListDataSource {
    fun addItem(item: Item)
    fun getItemList(): List<Item>
}