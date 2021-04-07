# **CircleTheDot**

This Desktop Game was created as a project for one of my University courses on **Java** programming, **MVC design pattern**, **data structures**, and **algorithms**. [Youtube Video](https://youtu.be/dDxSfrmjDsE).

For this project, the game ***“Circle The Dot”*** is implemented with **AWT** and **Swing** Java UI packages. 

Simply, in this game, the player attempts to prevent the  blue dot from escaping/exiting the board. To achieve this, the player selects a set of gray dots turning them to orange dots that the blue dot cannot cross. The player wins when the blue dot is encircled by orange dots.

At the start of the game, the board already has some orange dots that are generated at random positions. Also, the initial location of the blue dot is randomly selected towards the center of the board. On each move, the blue dot looks for the shortest path for escaping the board and moves accordingly. A **breadth-first search (BFS)** algorithm is implemented to compute the shortest path for the blue dot.

### **Functionalities**

In the background, the game model is cloned on every move the player makes. This allows the user to undo and/or redo their moves while playing the game. The use of data structures like stacks and queues come in handy when implementing such functionalities.

Also, the size of the board can be changed to any size that is greater than 4x4 if passed as an argument; default size is 9x9.
