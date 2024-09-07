package OOP

open class Rectangle() : Figure() {
    protected var width: Float = 0f
    protected var height: Float = 0f
    protected var color: Color = Color()

    constructor(width: Float = 0f, height: Float = 0f, color: String = "") : this() {
        this.width = width
        this.height = height
        this.color.setColor(color)
        this.name = "Прямоугольник"
    }

    override fun calculateArea(): Float {
        return this.width * this.height
    }

    override fun getInfo(): String {
        return this.getFigureName() + " " + this.width.toString() + " " + this.height.toString() + " " + this.color.getColor() + " " +
                this.calculateArea().toString()
    }
}