package com.example.myapplication.NeedToKnowJetpackCompose

//    todo Box
//
//    Box is a fundamental layout component that allows you to stack elements on top of each other.
//
//    Stacking Children: The primary purpose of Box is to stack its children on top of each other for example creating overlays, backgrounds, or layered designs.
//
//    Overlays: Placing elements like text, icons, or buttons on top of other content, such as images or videos.
//
//    Layered Designs: Creating visually rich interfaces by stacking elements to achieve effects like gradients or transparencies.
//
//    Layering Order: The order in which children are declared within the Box determines their stacking order. The first child declared will be at the bottom of the stack, and subsequent children will be stacked on top of it.
//
//    Alignment: Box allows for precise alignment of its children within its boundaries. You can use various alignment such as Alignment.TopStart and Alignment.BottomEnd.
//
//    By default, children are positioned at the top-start (top-left) corner unless specified otherwise.
//


// todo Box Parameters

//    modifier: Modifier = Modifier:

//    This is a crucial parameter for nearly all composables in Compose. It allows you to customize the Box's layout, appearance, and behavior.
//
//    size(), width(), height(): To set specific dimensions.
//
//    fillMaxSize(), fillMaxWidth(), fillMaxHeight(): To make the Box expand to fill available space.
//
//    padding(), offset(): For spacing and positioning.
//
//    background(): To set a background color or drawable.
//
//    clip(): To clip the content to a specific shape.
//
//    align(): To align the Box itself within its parent, or its children within the Box.
//    example: Text(
//    text = "Top Start",
//    modifier = Modifier.align(Alignment.TopStart)
//    )


//    The align() modifier on a child takes precedence over the Box's contentAlignment parameter.


//    contentAlignment: Alignment = Alignment.TopStart:
//    This parameter determines how the children within the Box are aligned. It takes an Alignment object, such as Alignment.Center, Alignment.BottomEnd, Alignment.TopStart, etc.
//
//    propagateMinConstraints: Boolean = false:
//    When true, the minimum constraints of the Box are propagated to its children. This can be useful for ensuring children respect a minimum size.
//
//    content: @Composable BoxScope.() -> Unit:
//    This is a trailing lambda that defines the content to be placed inside the Box. Within this content lambda, you have access to BoxScope, which provides modifiers like align() specifically for positioning children within the Box.
//


//    heightIn determines a fixed height of an image for different device sizes
//
//    heightIn modifier, when applied to a Box or any other composable, defines a range of allowable heights for that composable. It takes two parameters: min and max, representing the minimum and maximum height constraints respectively.
//
//    Minimum Height (min):
//
//    The composable will not be rendered smaller than this specified height, even if its content would naturally be shorter.
//
//    If the content is smaller than min, the composable will still occupy at least min height, with the content typically centered within that space.
//
//    Maximum Height (max):
//
//    The composable will not exceed this specified height, even if its content would naturally be taller.
//
//    If the content is larger than max, it will be clipped or constrained to fit within the max height.
//
//
//    Example:
//    Box(
//    modifier = Modifier.heightIn(min = 50.dp, max = 200.dp)
//    ) {
//        // Content of the Box
//    }



//    brush allows you to create a gradient in a box
//    example:
//    Box(
//    modifier = Modifier
//    .matchParentSize() //it will make it match whatever the parent composable is
//    .background(
//    brush = Brush.verticalGradient(
//    colors = listOf(
//    Color.Transparent,
//    Color.Black
//    )



//   todo TextField

//    TextField is a composable designed to allow users to input and edit text. It can be used for creating forms, search bars, anything that requires text input.

//    Key aspects of TextField:
//
//    State Management:
//    TextField primarily relies on state-based management, where you provide a MutableState to hold the current value of the text field and update it using the onValueChange callback.
//    This ensures that the UI recomposes and displays the updated text as the user types.
//
//    Material Design:
//    TextField adheres to Material Design guidelines, providing a consistent and visually appealing appearance by default.
//
//    Customization:
//    While TextField offers a standard Material Design look, it provides parameters for extensive customization, including:
//
//    Value and onValueChange: Essential for managing the text content and responding to user input.
//
//    Input Types: You can specify different input types (e.g., text, number, password) to optimize the keyboard and input behavior.
//
//    Labels, Placeholders, Leading/Trailing Icons: For enhanced user guidance and visual cues.
//
//    Colors: To customize the appearance of various elements within the TextField based on focus state and other conditions.
//
//    label and placeholder: Provide hints to the user about the expected input.
//
//    the difference between the two is that label is used to show a floating label that moves above the text field when focused, while placeholder is shown inside the field itself and vanishes on typing.
//
//    modifier: Used to apply styling and layout changes to the TextField.

//    keyboardOptions and keyboardActions: Configure the behavior of the software keyboard, including keyboard type (e.g., numeric, email) and IME actions (e.g., Done, Go).

//    visualTransformation: Modifies the visual representation of the text without changing its underlying value , useful for password masking or formatting.

//    singleLine: Restricts the input to a single line.

//    leadingIcon and trailingIcon: Allow adding icons to the TextField for enhanced interactivity.

//    enabled and readOnly: Control whether the TextField is enabled and editable or read-only.
//
//    BasicTextField:
//    For highly custom text input scenarios where Material Design styling is not desired, BasicTextField provides a more primitive component, allowing for complete control over the UI and behavior.\
//    This is a lower-level composable that provides the core functionality for text input without any decorations or styling.
//    It's suitable for custom implementations where you need to build the appearance from scratch.
//
//    BasicTextField2:
//    A newer, improved version of BasicTextField that offers enhanced features for building custom text fields.

//    Example :
//
//    @Composable
//    fun SimpleTextFieldExample() {
//        var text by remember { mutableStateOf("") }
//
//        TextField(
//            value = text,
//            onValueChange = { newText -> text = newText },
//            label = { Text("Enter your name") }
//        )
//    }


//    Filled Text Fields: These have a solid background and a subtle underline or border.
//
//    OutlinedTextField is a styled TextField with a border around the input field, offering a clean and subtle appearance.
//                )

//    Spacer is a composable that represents a blank space in your UI.
//
//    It's used to add space between other UI elements, like Text, Buttons, or other Composable.
//
//    It doesn't display any visual content itself; it only takes up a defined amount of space in your layout.
//
//    example:
//    Spacer(modifier = Modifier.size(30.dp))
//
//    add this in between a textfield and button

//    todo Buttons

//    Parameters :
//
//    onClick:
//    A mandatory lambda function that defines the action to be performed when the button is clicked.
//
//    modifier:
//    Allows customization of the button's layout and appearance, such as size, padding, or background.
//
//    enabled:
//    A boolean parameter that determines if the button is enabled (clickable) or disabled (non-clickable and typically visually grayed out ).
//
//    shape:
//    Defines the shape of the button's container, border, and shadow, allowing for rounded corners, circular shapes, or custom shapes.
//
//    colors:
//    Customizes the button's colors, including background, content (text/icon), and disabled states. ButtonDefaults can be used to define custom color schemes.
//
//    border:
//    Adds a border to the button, using BorderStroke to define its width and color.
//
//    elevation:
//    Controls the shadow elevation of the button, with different elevations for default, pressed, focused, hovered, and disabled states.
//
//    Content within the Button:
//    Any composable can be placed inside the Button composable, allowing for flexible content such as Text, Icon, Image, or a combination of these.
//
//    OutlinedButton:
//    A button with a border but no solid background, suitable for secondary actions.
//
//    TextButton:
//    A button that appears as plain text, often used for less prominent actions.
//
//    IconButton:
//    A button that primarily displays an icon, ideal for actions represented by symbols.
//
//    FloatingActionButton (FAB) and ExtendedFloatingActionButton:
//    Prominent, elevated buttons often used for primary or frequently used actions.
//
//    SegmentedButton:
//    Allows users to choose from a set of options presented side-by-side, either single-select or multi-select.


//    example:
//    @Composable
//    fun MyButton() {
//        Button(onClick = { /* Handle button click */ }) {
//            Text("Click Me")
//        }
//    }




//    todo Text

//     example:
//    @Composable
//    fun MyTextScreen() {
//        Text(text = "Hello, Jetpack Compose!")
//    }


//    Parameters:
//
//

//
//    overflow: Determines how text is handled when it exceeds maxLines, e.g., TextOverflow.Ellipsis for truncation.
//
//
//    @Composable
//    fun StyledTextExample() {
//        Text(
//            text = "This is some styled text.",
//            color = Color.Blue,
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Bold,
//            fontStyle = FontStyle.Italic,
//            maxLines = 2,
//            overflow = TextOverflow.Ellipsis
//        )
//    }
//
//    AnnotatedString: Enables applying multiple styles or clickable links within the same Text composable.
//    User Interactions: Supports text selection and other user interactions.


//    todo Text Modifiers

//    color: Sets the color of the text.         example: color = Color.Blue

//    fontSize: Controls the size of the text

//    fontStyle: Specifies the typeface variant, like FontStyle.Italic or FontStyle.Normal.

//    fontWeight: Defines the thickness of the typeface, e.g., FontWeight.Bold.

//    fontFamily: Selects the font family to render the text, which can include system fonts like FontFamily.Serif or custom fonts.

//    letterSpacing: Adjusts the spacing between individual letters.

//    textDecoration: Applies decorations like TextDecoration.Underline or TextDecoration.LineThrough.

//    textAlign: Sets the horizontal alignment of the text within the Text composable's surface area. It supports values like TextAlign.Center, TextAlign.End, TextAlign.Justify, TextAlign.Left, TextAlign.Right, and TextAlign.Start.

//    lineHeight: Controls the height of each line of text.

//    softWrap: Determines whether the text should break onto the next line when the container's width is reached. By default, it's true.

//    maxLines: Limits the number of lines the text can occupy before overflowing.

//    minLines: Sets the minimum height in terms of minimum number of visible lines.

//    style: Allows you to apply a TextStyle object to configure various text properties like color, font, line height, and shadow.

//    onTextLayout (Function): A callback triggered when the text layout is calculated. This provides a TextLayoutResult object with details about the layout, which can be used for custom decorations or functionalities.

//    inlineContent (Map<String, InlineTextContent>): Used to insert composable into the text layout by replacing specific text ranges.