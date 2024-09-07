package TESTS

import OOP.*

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AppTest {

    @Test
    fun `RectangleTest`() {
        var testRectangle: Rectangle = Rectangle(5f, 5f, "Blue")
        assertEquals("Прямоугольник 5.0 5.0 Blue 25.0", testRectangle.getInfo())
    }

    @Test
    fun `CircleTest`() {
        var testCircle: Circle = Circle(5f, "Green")
        var s: Float = 5f * 5f * Math.PI.toFloat()
        assertEquals("Круг 5.0 Green " + s.toString(), testCircle.getInfo())
    }

    @Test
    fun `SquareTest`() {
        var testSquare: Square = Square(5f, "Red")
        assertEquals("Квадрат 5.0 Red 25.0", testSquare.getInfo())
    }
}