package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    public int top;
    public int left;
    public int width;
    public int height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 0;
    }
    public Rectangle(Rectangle anRect) {
        this.top = anRect.top;
        this.left = anRect.left;
        this.width = anRect.width;
        this.height = anRect.height;
    }

    public static void main(String[] args) {

    }
}
