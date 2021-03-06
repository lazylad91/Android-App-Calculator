# Android-App-Calculator

This is a basic Android Calculator .

##Some of the features pertaining to android : 
1. Makes use of android development components like the **LinearLayout, TextView and Buttons**.
2. The app is **responsive** ( works in portrait as well as landscape mode) .
3. The app is designed to work even if the *device is rotated*  
By default, when the screen is rotated the activity is killed and restarted. 
4. Apache JEXL is used to evaluate the expression
5. Put any number of operations and you will get results.
6. Support Floating Point numbers.

###APK Link
https://github.com/lazylad91/Android-App-Calculator/blob/master/app-debug.apk

###Screenshots:

<h2>Application Icon</h2>

<img src="https://github.com/lazylad91/Android-App-Calculator/blob/master/Screenshots/AppIcon.png" width="300" height="400">

<h2>Application Home Screen</h2>

<img src="https://github.com/lazylad91/Android-App-Calculator/blob/master/Screenshots/AppMainPage.png" width="300" height="400">

<h2>Multiple operation in one Go.</h2>

<img src="https://github.com/lazylad91/Android-App-Calculator/blob/master/Screenshots/TestCase3-MultipleOperation.png" width="300" height="400">

<h2>Error keyword will show for any illegal expression.</h2>

<img src="https://github.com/lazylad91/Android-App-Calculator/blob/master/Screenshots/ErrorCondition1_Result.png" width="300" height="400">


####ERROR Handling:

Few corner-cases have been handled like :
* 1. `(x/0)` returns an "Invalid operation" error to the user.
* 2. The operator`(+,/,+,-)` buttons are disabled till the user enters atleast one digit.
* 3. The equals`(=)` button is disabled until the user enters two operands and atleast one single operator.
* 4. If user performs operations like `(a//b" or "a++b")` then the equals(=) button is disabled. 
