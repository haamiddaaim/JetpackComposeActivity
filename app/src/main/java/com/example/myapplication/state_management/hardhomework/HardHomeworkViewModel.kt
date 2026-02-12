package com.example.myapplication.state_management.hardhomework


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.asFlow

class HardHomeworkViewModel : ViewModel() {
    private val _items = mutableListOf<HardHomeworkState>()
     //val state: List<HardHomeworkState> = _items

    val items = _items.asFlow()

//    fun addItem(item: HardHomeworkState) {
//        _items.add(item)
//    }

    fun onEvent(event: HardHomeworkAction){
        when (event) {
            is HardHomeworkAction.OnDeleteButtonClick -> {
                _items.removeIf {
                    event.todo == it
                }
            }

            is HardHomeworkAction.OnAddButtonClick -> {

            }
            is HardHomeworkAction.onCheckButtonClick -> {
              event.todo.copy(
                  isChecked = event.isChecked
              )
            }
        }}}




//    fun toggleSelection(item : HardHomeworkState) {
//        val index = _items.indexOf (item)
//        if (index != -1) {
//            _items[index] = _items[index].copy(isChecked = !_items[index].isChecked)
//        }
//    }
//    fun deleteSelectedItems() {
//        // Use removeAll to remove all items that are selected
//        _items.removeIf { it.isChecked }
//}}
//    var state by mutableStateOf(HardHomeworkState())
//        private set

//private val _state = MutableStateFlow(HardHomeworkState())
//    val state = _state.asStateFlow()
//
//
//}







