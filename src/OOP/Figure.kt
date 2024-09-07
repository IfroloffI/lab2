package OOP

abstract class Figure {
    protected var name: String = ""
    abstract fun calculateArea(): Float
    abstract fun getFigureName(): String
}