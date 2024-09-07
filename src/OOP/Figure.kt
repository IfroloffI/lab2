package OOP

abstract class Figure {
    protected var name: String = ""


    abstract fun calculateArea(): Float

    fun getFigureName(): String {
        return this.name
    }

    abstract fun getInfo(): String
}