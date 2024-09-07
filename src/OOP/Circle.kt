package OOP

import kotlin.math.PI

class Circle() : Figure() {
    protected var radius: Float = 0f
    protected var color: Color = Color()

    constructor(radius: Float = 0f, color: String = "") : this() {
        this.radius = radius
        this.color.setColor(color)
        this.name = "Круг"
    }

    override fun calculateArea(): Float {
        return PI.toFloat() * this.radius * this.radius
    }

    override fun getInfo(): String {
        return this.getFigureName() + " " + this.radius.toString() + " " + this.color.getColor() + " " +
                this.calculateArea().toString()
    }
}