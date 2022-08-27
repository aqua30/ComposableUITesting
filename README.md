# ComposableUITesting
Sample project to demonstrate unit testing of composable functions

## Screenshot
![Test Screens](https://user-images.githubusercontent.com/4559525/187026131-6a6cf1ed-b885-440b-ba2a-d1b415807adc.png)

## Testing scenarios
- **Initial state**: Once we launch our activity, the first image would be our initial state with Start copying as the default text placed until we perform any click action on the Copy button. TextField remain empty with Input as label.
- **Invalid state**: User can enter any input text but we're checking it for Int type. So, if the input is not a number and user clicks on the Copy button then we'll show Invalid entry in place of Start copying label.
- **Valid state**: If user enter any number then we'll show the entered input along with text Counter = $input on click on Copy Button.
