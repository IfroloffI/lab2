package OOP

class Square() : Rectangle() {
    constructor(width: Float = 0f, color: String = "") : this() {
        this.width = width
        this.color!!.setColor(color)
        this.name = "Квадрат"
    }

    override fun calculateArea(): Float {
        return width * width
    }
}