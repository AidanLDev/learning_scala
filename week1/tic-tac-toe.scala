object TicTacToe extends App {
  class Board {
    var board = Array(
        Array("", "", ""),
        Array("", "", ""),
        Array("", "", ""),
      ) 
      def newGame() = {
       var board = Array(
          Array("", "", ""),
          Array("", "", ""),
          Array("", "", ""),
        ) 
    }
    def currentBoard() = {
      println("Board state:")
      for (i <- 0 until 3) {
        for (j <- 0 until 3) {
          println(board(i)(j) + " ")
        }
      }
    }
  }

  class Game extends Board {
    var winner = false
    
    def winnerMessage(winningLetter: String) {
      return println("Big congratz to the winner: " + winningLetter)
    }

    def checkForWinner() = {
      // Checking rows
      for (row <- 0 until 3) {
        if (board(row)(0) != "" &&
            board(row)(0) == board(row)(1) &&
            board(row)(1) == board(row)(2)) {
              winner = true
              winnerMessage(board(row)(0))  
              return true
        }      
      }

      // Checking columns
      for (col <- 0 until 3) {
        if (board(0)(col) != "" &&
          board(0)(col) == board(1)(col) &&
          board(1)(col) == board(2)(col)) {
            winner = true
            winnerMessage(board(0)(col))
            return true
          }
      }

      // Check diagnal (top left to bottom right)
      if (board(0)(0) != "" &&
          board(0)(0) == board(1)(1) &&
          board(1)(1) == board(2)(2)) {
            winner = true
            winnerMessage(board(0)(0))
            return true
          }

      // Check diagnam (top right to bottom left
      if (board(0)(2) != "" &&
          board(1)(1) == board(0)(2) &&
          board(1)(1) == board(2)(0)) {
            winner = true
            winnerMessage(board(0)(2))
            return true
          }

    }
  }

  val newGame = new Board()
  newGame.currentBoard()
}

