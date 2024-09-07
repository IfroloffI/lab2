package OOP

class Color {
    private var color: String = null.toString()
    fun getColor(): String {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun delColor() {
        this.color = null.toString()
    }
}