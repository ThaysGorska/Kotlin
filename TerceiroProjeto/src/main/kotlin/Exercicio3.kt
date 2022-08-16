fun main(){

    /*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

    print("Digite a sua idade para saber em qual categoria você se encontra: ")
    val idade = readln().toInt()

    when(idade){

        in 1..9 -> println("Você está na categoria: Criança")
        in 10..14 -> println("Você está na categoria: Infantil")
        in 15..17 -> println("Você está na categoria: Juvenil")
        in 18..25 -> println("Você está na categoria: Adulto")
        in 26..60 -> println("Você está na categoria: Adulto")
        in 61..120 -> println("Você está na categoria: Idoso")
    }
}