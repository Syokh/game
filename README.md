
***To run this app you have to run from `Idea` or 
if you wont run the jar you have to***

1. Move to the project root and run command `sbt assembly`

2. You have to move to path `target/scala-2.11` and run command `java -jar game_rock_paper_scissors.jar`


***FAQ: How to add new Shape for playing:***

1. You should extend trait **CommonShapes**:

2. Implement all required methods 

3. Set to package resources your image 

4. Add a new object of your class to the list:
    * package: **controller**; **API.getListShapes**
   

    