package final_learning.task4.nullSafety

data class Aircraft(
    var model:String,
    val pilot: Pilot?,
) {
}