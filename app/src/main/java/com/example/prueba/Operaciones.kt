package com.example.prueba


class Operaciones (val num1: Double, val num2: Double) {
    fun suma(): Double{
        return num1 + num2
    }
    fun resta(): Double{
        return num1 - num2
    }
    fun multiplicacion(): Double{
        return num1 * num2
    }
    fun division(): String{
        if(num2 == 0.0){
            return "Error-Division/0"
        }else{
            return (num1/num2).toString()
        }
    }
}