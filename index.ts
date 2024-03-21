/* This program is the Rock-Paper-Scissors game
 *
 * By: Kaitlyn Ip
 * Version: 1.0
 * Since: 2024-03-07
 */

// Importing necessary functions
import { createPrompt } from 'bun-promptx'

// Creating prompt function
const prompt = createPrompt()

// Generating random number between 1 and 3
const randomNumber = Math.floor(Math.random() * 3) + 1

// Input
const player = createPrompt("Decide on a move (rock, paper, or scissors): ")

let computer = String(randomNumber)

// Assigning computer's move based on the generated random number
if (randomNumber === 1) {
  computer = "rock"
} else if (randomNumber === 2) {
  computer = "paper"
} else if (randomNumber === 3) {
  computer = "scissors"
}

// Process & Output
if (player === computer) {
  console.log(`\nComputer chose ${computer}.`)
  console.log("\nTie.")
} else if (
  (player === "rock" && computer === "paper") ||
  (player === "paper" && computer === "scissors") ||
  (player === "scissors" && computer === "rock")
) {
  console.log(`\nComputer chose ${computer}.`)
  console.log("\nYou lost.")
} else if (
  (player === "paper" && computer === "rock") ||
  (player === "scissors" && computer === "paper") ||
  (player === "rock" && computer === "scissors")
) {
  console.log(`\nComputer chose ${computer}.`)
  console.log("\nYou win!")
} else {
  console.log("\nInvalid input.")
}

console.log("\nDone.")
