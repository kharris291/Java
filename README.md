Java
====

How to run.

You have to import the project into eclipse and go to the control class. From there you have to click the run button to initiate the program. To display the first set of values click the "Choose orders" button. If the set of items that come up are not acceptable then click the "Select a different set" button. If items seem appealing then make sure then click the checkbox beside the item. Right click in the window to get a popup menu.The options that will appear are help, total calories and exit. Once all items are clicked then order is complete and both buttoms will be unclickable.

The control class calls my LunchBox class that contains the GUI part of the program. This sets the size of the screen and the location at which it will appear. It creates how the GUI will appear on the screen. The on click implementation of the buttons and the check boxes is mainly done in this class but the actual setting of information is done in the AllInformation class, which the LunchBox class extends as most of its variables are declared.

The AllInformation class, as stated hold the majority of my variables. It also holds quite a large number of my JPanels, JButtons, and JPanels . This class takes the randomly generated numbers in its setvalues() method and sets the information on the GUI to whatever the position in the array the number has generated. The information is automatically updated on the screen from this once the button is clicked. The displayed information includes: a picture that is appropriate to the item, the items name and the calories for each item along with a total calorie count at the bottom screen.

The total calorie count value is taken from the countCals class. It takes in information and depending on whether or not the check box is checked it will add either the old value to the new total or it will just add the new item on. The total value is then returned to the GUI and is displayed at the bottom of the order.

The popup menu is made in it’s own class. It hold 3 options, help, total calories and exit. The help tells the user how to keep item they want to have and is displayed at the bottom of the gui. The total calories are brought up and displayed in a JOptionPane. And the exit option closes the program completely.

Description of the two additional features you have implemented above the basic requirement of the assignment.

Adding in a sound:

I decided to add in a sound for when the button is pressed. It runs in a thread which lasts for the length of the sound. The thread once completed will display the information that was gathered in the AllInformation class to the GUI. The sound comes from the Song class. This class has a thread which makes use of the AudioStream and Clip features. I’ve put the file, which is in .wav format, in a folder which I’ve called res and have made into a source folder. The Audio file is read in by the AudioStream. Then the Clip makes use of the Audio Stream, which has just gotten the file name, and makes the audio stream play. 

Adding pictures:

This was done by, as stated in above, making a res folder. I put in all the pictures into this folder. After which I put them into their different categories, i.e. drinkicon[], with a reference to their filename, i.e. "res/7up.jpg" . Displaying them was done much the same as putting the other information to the GUI and to include them to the screen I added in a new Gridlayout to the screen. I used the random number to find the position of the picture corresponding to the item being displayed.

My class list :

* AllInformation.java
* Control.java
* countCals.java
* LunchBox.java
* Popup.java
* Song.java

