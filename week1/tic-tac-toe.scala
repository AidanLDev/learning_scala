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

    def checkForWinner() = {
      for (row <- 0 until 3) {
        for (column <- 0 until 3) {
          if (board(i)(j) == "x") {
        
          }
        }
      }
    }
  }

  val newGame = new Board()
  newGame.currentBoard()
}
