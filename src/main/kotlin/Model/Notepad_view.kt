package Model

import java.util.Collections

class Notepad_view {
    private var arrayList:ArrayList<Task> = ArrayList()

    fun addTask(task: Task){
        arrayList.add(task)
        println("Task added")
    }

    fun deleteNameTask(name:String){
        arrayList.removeIf { task -> task.nameTask == name}
    }

    fun getList() :List<Task>{
        var list :ArrayList<Task> = ArrayList()
        list.addAll(arrayList)
        return list;
    }


}