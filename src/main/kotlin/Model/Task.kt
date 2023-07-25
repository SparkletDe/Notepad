package Model

data class Task (var nameTask:String, var infoTask:String, var importance:Int){
    override fun toString(): String {
        return "$nameTask - $importance \ninfo: $infoTask \n-----------------------"
    }
}