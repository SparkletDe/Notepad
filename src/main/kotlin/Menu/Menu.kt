package Menu

import Model.Notepad_view
import Model.Task

fun main() {
    val notepad: Notepad_view = Notepad_view()

    while (true) {
        println("1 add task")
        println("2 delete task")
        println("3 list task")
        println("4 find task by importance")
        var answer = readln()

        when (answer) {
            "1" -> { notepad.addTask(createTask()) }
            "2" -> { notepad.deleteNameTask(getNameTask())}
            "3" -> {
                for (task in notepad.getList()) {
                    println(task)
                }
            }

            "4" -> {
             var list =  notepad.findTask(getImportanceTask())
                for (task in list) {
                    println("${task.nameTask} ${task.importance} ${task.infoTask}")
                }

            }


            else -> {
                System.exit(0)
            }

        }
    }

}
    fun createTask() : Task{
        println("enter name task")
        var name = readln()

        println("enter info task")
        var infoTask= readln()

        println("enter importance")
        var importans = readln().toInt()

        return Task(name,infoTask,importans)

    }

    fun getNameTask(): String{
        println("enter name to delete task")
        return readln()
    }

    fun getImportanceTask():Int{
      println("enter importance of Task")
     return readln().toInt()

    }
