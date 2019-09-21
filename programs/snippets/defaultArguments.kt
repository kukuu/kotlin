
//Default Arguments
//No need to define several similar methods with varying arguments:

fun build(title: String, width: Int = 800, height: Int = 600) {
    Frame(title, width, height)
}
