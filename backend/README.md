# 2019 Codecademy Internship Code Challenge (Backend Software Engineer)

  ## UFO: The Game
```
                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'   ,-----------.
               /   \        (  Send help! )
              /     \      / `-----------'
             /   O   \    /
            /  --|--  \
           /     |     \
          /     / \     \
```
  
Invaders from outer space have arrived and are abducting humans using tractor beams. Earn your medal of honor by cracking the codeword to stop the abduction!


### How to play:
Guess one letter at a time of a codeword represented by blank placeholders for each letter. If the letter does not exist in the codeword, the person is pulled in closer to the UFO by the tractor beam. If the letter exists, the blanks that correspond to the position of those letters in the codeword are replaced by the letter. If all the letters of the codeword are revealed before the person is pulled into the UFO, you win. Otherwise, the UFO abducts the person and you lose.


### Rules and requirements:

-   All valid codewords are chosen from [this dictionary of English words](https://github.com/Codecademy/internship-code-challenge/blob/master/backend/nouns.txt) 
-   The codeword is represented by a series of dashes, one per letter in the codeword
-   The codeword is chosen randomly at the start of the game
-   Each game starts with the person at the bottom of the beam. Upon guessing a letter that does not exist in the codeword, the person is lifted one row.
-   The distance of the person’s feet to the UFO is six rows, so unless you solve the codeword, you lose on the sixth incorrect guess.
-   Every letter that was guessed but does not exist in the codeword is displayed and cannot be guessed again
-   Every letter that was guessed that exists in the codeword replaces the dashes for all instances in which they exist in that word
-   You win when all the dashes in the codeword have been replaced by your correct guesses
-   The game should read user input on the command line and allow the user to start a new game after completing one.
-   The game should identify whether a guess was correct or not
-   The game should display the current state of abduction by the UFO. Snippets of code that represent each state of UFO abduction have been provided in a few popular languages for your convenience.

### How you will be evaluated
* Requirements are all met. The game plays as described in the Rules and requirements section above.
* Code is well-organized and easy to read/understand.
* Any algorithms or data structures used are appropriate and reasonably efficient.
* Unit tests are written to determine that code is correct.

### Bonus
* Display how many words in the provided dictionary are potentially correct codewords given the correct and incorrect letter guesses made so far. For example, suppose the game was in this state:
```
Incorrect guesses: D
Correct guesses: R
Codeword: _ R _ _ _
Dictionary contains: "TRAIN", "CLASP", "ACT", "BRAIN", "CROWN", "TRADE"
```
The total number of words in the dictionary that match this is 3  -- "TRAIN", "BRAIN",  and "CROWN" -- so you might display:
```
Incorrect Guesses:
D

Codeword:
_ R _ _ _

Number of dictionary matches: 3
```


### Example

```
UFO: The Game
Instructions: save us from alien abduction by guessing letters in the codeword.
 
                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'
              /     \
             /       \
            /    O    \
           /   --|--   \
          /      |      \
         /      / \      \

Incorrect Guesses:
None

Codeword:
_ _ _ _ _ _ _ _ _ _

Please enter your guess: R

Incorrect! The tractor beam pulls the person in further.

                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'
              /     \
             /   O   \
            /  --|--  \
           /     |     \
          /     / \     \
         /               \

Incorrect Guesses:
R

Codeword:
_ _ _ _ _ _ _ _ _ _

Please enter your guess: S

Incorrect! The tractor beam pulls the person in further.

                  .
                  |
               .-"^"-.
              /_....._\
          .-"`         `"-.
         (  ooo  ooo  ooo  )
          '-.,_________,.-'
               /  O  \
              / --|-- \
             /    |    \
            /    / \    \
           /             \
          /               \


Incorrect Guesses:
R S

Codeword:
_ _ _ _ _ _ _ _ _ _

Please enter your guess: T

Incorrect! The tractor beam pulls the person in further.

                  .
                  |
               .-"^"-.
              /_....._\
          .-"`         `"-.
         (  ooo  ooo  ooo  )
          '-.,_________,.-'
               /--|--\
              /   |   \
             /   / \   \
            /           \
           /             \
          /               \

Incorrect Guesses:
R S T

Codeword:
_ _ _ _ _ _ _ _ _ _

Please enter your guess: L

Incorrect! The tractor beam pulls the person in further.
                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'
              /  |  \
             /  / \  \
            /         \
           /           \
          /             \
         /               \

Incorrect Guesses:
R S T L

Codeword:
_ _ _ _ _ _ _ _ _ _

Please enter your guess: C

Correct! You're closer to cracking the codeword.

                  .
                  |
               .-"^"-.
              /_....._\
          .-"`         `"-.
         (  ooo  ooo  ooo  )
          '-.,_________,.-'
               /  |  \
              /  / \  \
             /         \
            /           \
           /             \
          /               \

Incorrect Guesses:
R S T L

Codeword:
C _ _ _ C _ _ _ _ _

Please enter your guess: Y

Correct! You're closer to cracking the codeword.

                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
        '-.,_________,.-'
              /  |  \
             /  / \  \
            /         \
           /           \
          /             \
         /               \

Please enter your guess: Y

Correct! You're closer to cracking the codeword.

                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'
              /  |  \
             /  / \  \
            /         \
           /           \
          /             \
         /               \

Incorrect Guesses:
R S T L

Codeword:
C _ _ _ C _ _ _ _ Y

Please enter your guess: E

Correct! You're closer to cracking the codeword.

                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'
              /  |  \
             /  / \  \
            /         \
           /           \
          /             \
         /               \

Incorrect Guesses:
R S T L

Codeword:
C _ _ E C _ _ E _ Y

Please enter your guess: E

Correct! You're closer to cracking the codeword.

                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'
              /  |  \
             /  / \  \
            /         \
           /           \
          /             \
         /               \
                  
Incorrect Guesses:
R S T L

Codeword:
C _ _ E C _ _ E _ Y

Please enter your guess: I'd like to solve the puzzle

I cannot understand your input. Please guess a single letter.

Please enter your guess: E

You can only guess that letter once, please try again.

Please enter your guess: O

Correct! You're closer to cracking the codeword.


                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'
              /  |  \
             /  / \  \
            /         \
           /           \
          /             \
         /               \
                  
Incorrect Guesses:
R S T L

Codeword:
C O _ E C _ _ E _ Y

Please enter your guess: A

Correct! You're closer to cracking the codeword.

                 .
                 |
              .-"^"-.
             /_....._\
         .-"`         `"-.
        (  ooo  ooo  ooo  )
         '-.,_________,.-'
              /  |  \
             /  / \  \
            /         \
           /           \
          /             \
         /               \

Incorrect Guesses:
R S T L

Codeword:
C O _ E C A _ E _ Y

Please enter your guess: M

Correct! You're closer to cracking the codeword.

                .
                |
             .-"^"-.
            /_....._\
        .-"`         `"-.
       (  ooo  ooo  ooo  )
        '-.,_________,.-'
             /  |  \
            /  / \  \
           /         \
          /           \
         /             \
        /               \

Incorrect Guesses:
R S T L

Codeword:
C O _ E C A _ E M Y

Please enter your guess: D

Correct! You saved the person and earned a medal of honor!
The codeword is: CODECADEMY.

Would you like to play again (Y/N)? N

Goodbye!
 ```
