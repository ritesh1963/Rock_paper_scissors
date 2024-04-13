package com.example.kotlinbasics

fun main() {
    var computer_choice = ""
    var player_choice = ""
    println("Rock , paper or scissors?")
    player_choice = readln()

    val randomNumber = (1..3).random()

   when(randomNumber){
       1 -> {
           computer_choice = "Rock"
       }
       2 -> {
           computer_choice = "paper"
       }
       3 -> {
           computer_choice = "scissors"
       }
   }
    println(computer_choice)

    val winner = when {
        player_choice == computer_choice -> "Tie"
        player_choice == "Rock" && computer_choice == "paper" -> "paper"
        player_choice == "Rock" && computer_choice == "scissors" -> "Rock"
        player_choice == "Paper" && computer_choice == "scissors" -> "scissors"
        else -> "Computer"
    }
    if(winner == "Tie")
        println("It is a tie")
    else{
        println("$winner won")
    }

}

