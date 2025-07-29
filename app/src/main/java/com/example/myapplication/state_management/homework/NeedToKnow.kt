package com.example.myapplication.state_management.homework

class NeedToKnow {

//    TODO Jetpack Compose
//
//    the model is basically the data class
//
//    the view is the actual Ui which is the composable
//
//    both mvvm and mvi separates your presentation layer into distinct parts
//
//    both of the patterns are typically implemented with viewmodel on android
//
//    viewmodel processes UI actions like button click or refresh swipe and decides how the state needs to look like afterwards
//
//    private set is make sure you can only change the state of something only in the viewmodel
//
//    if you do configuration changes like screen rotation or changing the theme or language then you will need to make the viewmodel
//
//    the viewmodel then inherits from google's viewmodel which is : ViewModel() which will outlive the lifecycle of the activity's lifecycle
//
//    then the viewmodel will only be destroyed if the user clicks the back button
//
//    val viewmodel = TodoViewModel() will initialize a new viewmodel instance everytime there is a config change
//
//    you have to use either of the two android way of initialing the viewmodel which is val viewmodel by viewModels<TodoViewModel>()
//
//    other way is using the compose version which is val viewModel = viewModel<TodoViewModel>() specifically viewModel(...)
//
//    the compose way needs the dependency androidx-lifecycle-runtime-ktx
//








//    IconButton is a composable function that represents a clickable icon, typically used for actions or toggling states.
//
//    IconButton can be used for both default actions (like opening a menu) and toggle actions (like favorite/unfavorite).
//
//    It has a minimum touch target size of 48x48dp to meet accessibility guidelines.
//
//    You can customize the icon, colors, size, and shape of the button


//    IconButton parameters
//
//    onClick: This is a required parameter and is a lambda function that will be invoked when the user presses the icon.
//
//    modifier: This is an optional Modifier parameter that allows you to customize the appearance and behavior of the IconButton. You can chain multiple modifiers to define things like size, padding, alignment, and more.
//
//    enabled: This boolean parameter controls whether the IconButton will respond to user input and appear enabled or disabled. If set to false, the button will be visually disabled and won't react to clicks.
//
//    interactionSource: An optional MutableInteractionSource that can be used to observe and emit Interaction events. This is useful for customizing the IconButton's appearance based on different interaction states (e.g., pressed, focused).
//
//    content: This is a composable lambda that defines the content to be drawn inside the IconButton, typically an Icon composable.
//
//
//    example:
//    IconButton(
//    onClick = { /* Do something when the button is clicked */ },
//    modifier = Modifier.size(48.dp),  // Optional modifier for size
//    enabled = true,
//    colors = IconButtonDefaults.iconButtonColors(Blue),
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Favorite,
//            contentDescription = "Favorite icon",
//            tint = Blue
//        )
//    }
//







//    FlowRow and FlowColumn are composables that are similar to Row and Column, but differ in that items flow into the next line when the container runs out of space. This creates multiple rows or columns. The number of items in a line can also be controlled by setting maxItemsInEachRow or maxItemsInEachColumn.
//
//    out of the three options that are experimental you can opt into the second one
//
//    Assist Chip is a type of Material Design Chip that guides users through tasks by suggesting actions or providing temporary UI elements in response to user input
//
//    Examples of Usage:
//    Suggesting actions based on calendar events.
//    Offering options to open an app from a notification.
//    Providing quick replies in messaging apps.
//    Filtering out choices you're looking for.
//
//    example:
//    AssistChip(
//    onClick =
//    { /* Handle chip click */ },
//    label =
//    { Text("Open Calendar") },
//    leadingIcon =
//    { Icon(Icons.Filled.Event, contentDescription = "Calendar") },
//    // other properties like colors, modifier, etc.
//    )
//






//    Lazy Lists in Jetpack Compose, specifically LazyColumn and LazyRow, are UI components designed for efficiently displaying large lists of data . Unlike traditional Column and Row layouts which compose and lay out all items at once, even if they're off-screen, Lazy Lists only compose and lay out items that are currently visible within the viewport. This approach is crucial for optimizing performance, particularly when dealing with extensive or dynamic datasets, as it significantly reduces memory consumption and computation time.
//
//    item(): For adding a single composable item.
//    items(): For adding multiple items from a list or count.
//    itemsIndexed(): Similar to items(), but also provides the index of each item.
//    stickyHeader(): Allows for creating headers that remain pinned to the top as the user scrolls.
//
//    To add padding around the edges of the content within a LazyColumn in Jetpack Compose, you should utilize the contentPadding parameter of the LazyColumn composable.
//
//    reverseLayout parameter for LazyColumn controls the direction in which items are laid out and scrolled.
//
//    Arrangement.spacedby() is used more with lazycolumns
//
//
//    .background(Color(Random.nextInt()))
//
//    how to add random colors to different items
//
//
//
//
//
//
//
//
//    Lazy Grids (LazyVerticalGrid and LazyHorizontalGrid) are for efficiently displaying large datasets in a grid format within a scrollable container. They are designed for optimized performance by only composing and laying out items that are visible in the viewport
//
//    Lazy Loading and Recycling: They are designed to display large datasets efficiently by only composing and laying out items that are currently visible on the screen. Off-screen items are recycled, minimizing memory usage and improving performance
//
//    LazyVerticalGrid displays items in a vertically scrollable container spanning multiple columns.
//
//    LazyHorizontalGrid displays items in a horizontally scrollable container spanning multiple rows.
//
//    item() adds a single item.
//    items() adds multiple items.
//    itemsIndexed() adds multiple items and provides the index of each item within the grid.
//
//    LazyStaggeredGrid is a composable that displays items in a grid-like layout where items can have varying heights (in a vertical grid) or widths (in a horizontal grid), creating a staggered effect. It leverages lazy loading, meaning it only composes and lays out the items that are currently visible on the screen, optimizing performance for large datasets.
//
//    verticalItemSpacing is how you can achieve precise and visually appealing vertical spacing between the items in your staggered grid layout.
//
//    content padding refers to the space added inside a composable, between its content and its boundaries.
//
//
//    you can effectively clip individual items within the grid by applying the Modifier.clip or other clipping techniques directly to the composables used for each item.
//
//    example:
//    modifier = Modifier
//    .fillMaxWidth()
//    .clip(RoundedCornerShape(8.dp)) // Example: Clipping with rounded corners
//
//    GridCells: This is a parameter used in LazyVerticalGrid (for columns) and LazyHorizontalGrid (for rows) to configure the arrangement of cells within a regular grid.
//
//    This defines a fixed number of columns (or rows for a horizontal grid) regardless of the screen size.
//
//    The size of each cell adjusts dynamically to fit the available space.
//
//
//
//    GridCells.Fixed(count): This option allows you to define a fixed number of columns or rows, meaning that the number of cells will not change regardless of the screen size. For example, GridCells.Fixed(3) would always display 3 columns.
//
//    example: columns = GridCells.Fixed(5)
//
//    GridCells.Adaptive(minSize): This option defines a minimum size for the cells. The grid will then automatically adjust the number of columns or rows to fit as many cells as possible within the available space, based on the minSize value you provide. This is particularly useful for creating responsive layouts that adapt to different screen sizes and orientations.
//
//    example: columns = GridCells.Adaptive(50.dp)
//    items(100)
//    {
//        Box(
//            modiifer = Modifier
//                .width(
//                    width = Random.nextInt(
//                        1..200
//                    ).dp
//                )
//
////now every single box will be at least 50 dp wide
//        )
//    }
//
//
//
//    GridCells.FixedSize
//    This allows you to define columns (or rows) with a fixed width in dp.
//
//    example: GridCells.FixedSize(size = 100.dp)
//
//    a lazygrid is overrides the width of the children comp so we just determine the height in the child.
//
//    it is always better to use adaptive over fixedsize as it factors in different screen sizes
//
//    grids can be used for image gallery
//
//
//
//
//
//
//
//
//    Scaffold is a composable function that provides a basic layout structure for Material Design UIs. It's designed to organize common UI elements like top app bars, bottom app bars, floating action buttons, drawers, and snackbars, into a cohesive and consistent screen structure.
//
//    It handles the positioning and arrangement of these components, ensuring they are displayed correctly on the screen, and automatically manages padding and other layout considerations
//
//    example:
//    Scaffold(
//    topBar =
//    { TopAppBar(title = { Text("My App") }) },
//    floatingActionButton =
//    { FloatingActionButton(onClick = { /* ... */ }) { /* ... */ } },
//    bottomBar =
//    { BottomAppBar { /* ... */ } },
//    content =
//    {
//        innerPadding ->
//        // Content of the screen, using the innerPadding to account for top/bottom bars
//        Column(modifier = Modifier.padding(innerPadding)) {
//            // Your content goes here
//        }
//    }
//    )
//
//
//    Overflow menu: When a TopAppBar or other UI element has more actions (represented by IconButtons) than can be shown within its available space, the excess actions are often placed in an "overflow menu".
//
//    This is commonly displayed as a "three-dot" or "More options" icon (often Icons.Default.MoreVert), which, when clicked, expands a DropdownMenu revealing the hidden actions.
//
//    The DropdownMenu is scrollable by default, so even a very long list of actions can be accessed.
//
//    Text overflow: While technically not directly related to IconButtons themselves, it's worth noting that if you have text within a Button or other component alongside an IconButton, that text could overflow if it doesn't fit within the allocated space. In such cases, you might use techniques like TextLayoutResult.hasVisualOverflow to detect this and potentially adjust the layout dynamically, for example, by switching from a horizontal (Row) to a vertical (Column) arrangement.
//
//    Scaffold parameter
//
//    modifier: A Modifier to customize the appearance and behavior of the Scaffold.
//    topBar: A composable function representing the top app bar, often used for titles and navigation icons.
//    bottomBar: A composable function representing the bottom app bar, often used for navigation or actions.
//    snackbarHost: A composable function responsible for displaying snackbars.
//    floatingActionButton: A composable function for a floating action button, typically used for primary actions on the screen.
//    floatingActionButtonPosition: Defines the position of the floatingActionButton, such as FabPosition.End (right) or FabPosition.Center.
//    content: A composable function representing the main content area of the screen.
//    drawerContent: A composable function for a navigation drawer that can be revealed by swiping from the side.
//    contentWindowInsets: Allows customization of insets for the content area.
//    snackbarHostState: Allows for the management of snackbar visibility.
//    contentColor: Defines the default color for the content within the Scaffold.
//
//    Floating Action Bar parameters
//
//    onClick:
//    A lambda function that is executed when the FAB is clicked. This is where you'd typically put the logic for the action the button triggers.
//    containerColor:
//    Defines the background color of the FAB. You can use MaterialTheme.colorScheme.primary for the primary color or customize it further.
//    contentColor:
//    Defines the color of the icon or content inside the FAB. You can use MaterialTheme.colorScheme.onPrimary for a color that contrasts well with the container color.
//    shape:
//    Allows you to customize the shape of the FAB. You can use predefined shapes like RoundedCornerShape or create custom shapes. The default is a circle.
//    elevation:
//    Controls the shadow depth of the FAB, adding a sense of depth. You can use FloatingActionButtonDefaults.elevation() or customize it further.
//    modifier:
//    Allows you to apply modifiers like padding, size, and alignment to the FAB.
//    content:
//    A lambda that defines the content of the FAB. Typically, this is an Icon composable, but it can be anything.
//
//
//
//
//    Scaffold's snackbar functionality is implemented using the snackbarHost parameter, which expects a SnackbarHost composable. The SnackbarHost is then configured with a SnackbarHostState to control and manage the display of snackbars.
//
//    Scaffold: The top-level layout composable that acts as the container for UI elements.
//    SnackbarHost: A composable within the Scaffold that is responsible for showing, hiding, and animating snackbars.
//    SnackbarHostState: The state
//    object that manages the queue of snackbars and controls which one is currently displayed within the SnackbarHost. It provides the showSnackbar() function to trigger the display of a snackbar. Note that showSnackbar() is a suspendable function and needs to be called within a CoroutineScope.
//
//
//    enableEdgeToEdge() function allows your app to display its content behind the system UI, such as the status bar and the navigation bar, effectively extending your app's UI to the edges of the device's screen.
//

















//    todo Shortcuts
    //ctrl p
//comp for composable
    //prev for preview


//    todo Modifiers
//    background(color) to set a background color,
//    clip(shape) to clip the composable,
//    border() to add a border,
//    alpha(float) for transparency,
//    shadow() for shadow effects.
//    padding(dp) for adding space,
//    size() for setting fixed size, example: size(20.dp), size(20.dp, 20.dp),
//    fillMaxSize() to expand to fill the parent,
//    don't use on Text specifically as it will push out the other text etc and just fill the fixed size of the column or row
//    fillMaxWidth
//    fillMaxHeight
//    wrapContentSize() to shrink to fit content.

//    todo Text0Field Modifiers
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




//    todo Text Modifiers
//    color: Sets the color of the text.         example: color = Color.Blue
//    fontSize: Controls the size of the text
//    fontStyle: Specifies the typeface variant, like FontStyle.Italic or FontStyle.Normal.
//    fontWeight: Defines the thickness of the typeface, e.g., FontWeight.Bold.
//    fontFamily: Selects the font family to render the text, which can include system fonts like FontFamily.Serif or custom fonts, according to Android Developers.
//    letterSpacing: Adjusts the spacing between individual letters.
//    textDecoration: Applies decorations like TextDecoration.Underline or TextDecoration.LineThrough.
//    textAlign: Sets the horizontal alignment of the text within the Text composable's surface area. It supports values like TextAlign.Center, TextAlign.End, TextAlign.Justify, TextAlign.Left, TextAlign.Right, and TextAlign.Start.
//    lineHeight: Controls the height of each line of text.
//    overflow: Specifies how to handle text that exceeds the available space, for example, using TextOverflow.Ellipsis to truncate with an ellipsis.
//    softWrap: Determines whether the text should break onto the next line when the container's width is reached. By default, it's true.
//    maxLines: Sets an optional maximum number of lines for the text to span.
//    minLines: Sets the minimum height in terms of minimum number of visible lines.
//    style: Allows you to apply a TextStyle object to configure various text properties like color, font, line height, and shadow.
//    onTextLayout (Function): A callback triggered when the text layout is calculated. This provides a TextLayoutResult object with details about the layout, which can be used for custom decorations or functionalities.
//    inlineContent (Map<String, InlineTextContent>): Used to insert composable into the text layout by replacing specific text ranges.


//    todo Column
//
//    column is a fundamental building block for creating user interfaces that is used to arrange child composables vertically, one below the other.
//
//    When you have a row and then a lazycolumn you want to use...Use Column as it's most outer layout
//
//    verticalArrangement: Controls how children are spaced and positioned vertically within the column.
//
//    You can also specify a fixed space between items using Arrangement.spacedBy().
//
//    example: verticalArrangement = Arrangement.Center
//
//    horizontalAlignment: Determines the horizontal alignment of children within the column.
//
//    example: horizontalAlignment = Alignment.CenterHorizontally

//    todo Row
//
//    Row is a fundamental building block for arranging UI elements horizontally.
//
//    horizontalArrangement: Defines how child composables are spaced horizontally within the Row.
//
//    example: horizontalArrangement = Arrangement.SpaceAround
//
//    Common options include Arrangement.Start, Arrangement.End, Arrangement.Center, Arrangement.SpaceBetween, Arrangement.SpaceAround, and Arrangement.SpaceEvenly.
//
//    verticalAlignment: Controls how child composables are aligned vertically within the Row.
//
//    example: verticalAlignment = Alignment.CenterVertically
//
//    Options include Alignment.Top, Alignment.CenterVertically, and Alignment.Bottom

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
//    contentAlignment allows you to align all children in Box
//
//    example:  contentAlignment = Alignment.Center
//
//    Modifier.align() is used to set different alignments for individual children, you can use the Modifier.align() modifier on each child within the Box scope.
//
//    example: Text(
//    text = "Top Start",
//    modifier = Modifier.align(Alignment.TopStart)
//    )
//
//    The align() modifier on a child takes precedence over the Box's contentAlignment parameter.

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


//    todo Arrangements
//    Horizontal Arrangements (for Row):
//    Arrangement.Start: Places children as close to the left (start) as possible.
//    Arrangement.End: Places children as close to the right (end) as possible.
//    Arrangement.Center: Centers the children horizontally.
//    Arrangement.SpaceBetween: Distributes space evenly between the children, with the first and last items at the edges.
//    Arrangement.SpaceAround: Distributes space evenly around each child, including before the first and after the last item.
//    Arrangement.SpaceEvenly: Distributes space evenly between all children, including before the first and after the last item.
//    Arrangement.spacedBy() can be used instead of spacer for spacing all children by a fixed width
    //example: Arrangement.spacedBy(space = 20.dp, alignment = Alignment.Center)

//    Vertical Arrangements (for Column):
//    Arrangement.Top: Places children as close to the top as possible.
//    Arrangement.Bottom: Places children as close to the bottom as possible.
//    Arrangement.Center: Centers the children vertically.
//    Arrangement.SpaceBetween: Distributes space evenly between the children, with the first and last items at the top and bottom.
//    Arrangement.SpaceAround: Distributes space evenly around each child, including above the first and below the last item.
//    Arrangement.SpaceEvenly: Distributes space evenly between all children, including above the first and below the last item.

//    Alignments (for both Column and Row):
//    Alignment.Start: Aligns items to the leading edge of the layout (left for LTR languages, right for RTL).
//    Alignment.End: Aligns items to the trailing edge of the layout (right for LTR languages, left for RTL).
//    Alignment.CenterHorizontally: Centers items horizontally.
//    Alignment.CenterVertically: Centers items vertically.
//    Alignment.Top: Aligns items to the top of the layout.
//    Alignment.Bottom: Aligns items to the bottom of the layout.



//    todo Image
//
//    Image is used to display images within your UI
//
//    painter parameter is the most versatile way to display images. You can use painterResource() to load images from your res/drawable folder
//
//    example: painter = painterResource(id = R.drawable.your_image)
//
//    contentDescription: A string that provides an accessible description of the image, used by screen readers and other assistive technologies. It's crucial for accessibility.
//
//    example: contentDescription = null
//
//    modifier: Use.d to customize the layout, size, appearance, and behavior of the image.
//
//    alignment: Defines how the image is positioned within its layout bounds.
//
//    contentScale: Specifies how the image should be scaled to fit its container. Options include Crop, Fit, FillWidth, FillHeight, and Inside.
//
//    colorFilter: Applies a color transformation to the image, allowing you to change its colors or create effects.

//    example: Image(
//    painter = painterResource(id = R.drawable.your_image), // Replace with your image resource
//    contentDescription = "A sample image",
//    modifier = Modifier
//    .size(200.dp)
//    .padding(16.dp),
//    contentScale = ContentScale.Crop,
//    alignment = Alignment.Center,
//    colorFilter = ColorFilter.tint(Color.Red)
//    )
//
//    Text(text = "Image with custom styling")
//
//    For raster images (like PNGs or JPEGs), you can load them into an ImageBitmap and use a BitmapPainter to draw them.
//
//    For vector images (like SVGs), you can use ImageVector and display them using Image or Icon composables.
//
//    For images from the internet, you'll need to use a library like Coil or Glide, as Compose doesn't handle network image loading directly.

//    Icon is just like a Image but it's vector only so if you want to show only shapes and no photographs
//
//    example: Icon(imageVector = Icons.Filled.Add)


//    LazyColumn is a composable function that displays a scrollable list of items.
//
//    It's designed for efficiency by only composing and laying out the items that are currently visible on the screen.
//
//    example: val myItems = listOf("Item 1", "Item 2", "Item 3")
//
//    LazyColumn
//    {
//        items(myItems) { item ->
//            Text(text = item)
//        }
//    }
//    The items function can be used to iterate over a list of data and display each item.
//    It takes the list of data and a lambda that defines the content of each item based on the data provided.

//    var names by remember {
//        mutableStateOf(listOf<String>())
//    }
//
//    how to add the state of a list of items
//
//    LazyColumn
//    {
//        items(names) { currentName ->
//            Text(text = currentName)
//        }
//
//    how to set the text in your list of items in a lazyColumn

//    Button(onClick =
//    {
//        if (name.isNotBlank())) {
//        names = names + name
//
//    how to add a new name item to a list of names if the textview is not blank
//
//        name = ""
//
//    this makes the textfield empty again after clicking the button
//    }) {
//        Text(text = "Add")
//    }



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
//
//
//
//    weight is used within Row or Column layouts to distribute available space among child composables proportionally
//
//    example: weight(1f)
//
//    it can be used with spacer to have equal space for two things
//
//
//    Divider adds a line to separate each item
//
//    example: Divider()


//    NamesList (names = names)
//
//    @Composable
//    fun NamesList(
//        names: List<String>, modifier: Modifier = Modifier
//        //just so we can change the appearance of this comp from the outside
//
//    ) {
//        LazyColumn(modifier) {
//            items(names) { currentName ->
//                Text(
//                    text = currentName, modifier = Modifier.fillMaxWidth().padding(16.dp)
//                )
//            }
//        }
//    }
//
//    you can make your code easier to use by putting things inside of a composable and referencing it





//    TextField is a composable designed to allow users to input and edit text. It can be used for creating forms, search bars, anything that requires text input.
//
//    OutlinedTextField is a styled TextField with a border around the input field, offering a clean and subtle appearance.
//
//    BasicTextField: This is a lower-level composable that provides the core functionality for text input without any decorations or styling.
//    It's suitable for custom implementations where you need to build the appearance from scratch.

//    Example:
//    var name by remember {
//        mutableStateOf("") //sets the default text field to empty
//        TextField(
//            value = name,
//            onValueChange = { text ->  //will be called with a new text after it is changed
//                name = text
//
//                )


//using by makes writing values easier
//example: var count by remember {





//
//    state refers to any data that can change over time and influences the UI
//    example:
//    var count = mutablestateOf(0) //how to declare state
//
//
//    the remember function serves as a mechanism to store and retain state across recompositions of a Composable function
//    example:
//    var count by remember {
//        mutableStateOf(0)
//    }







//    TODO Kotlin
//
//    val is a keyword used to declare a read-only variable aka immutable variable. Once a value is assigned to a val variable, it cannot be changed or reassigned.
//    example :
//    val x = 5
//
//    you can define the x variable as any of the most fundamental data types in kotlin which are these 5 types...int, float, double, booleans, strings
//    example :
//    val x: Int = 5
//
//    if you want to use a decimal number instead of a whole number like 5...we have the two data types float and double that we can use
//    example:
//    val x: Float = 5f
//    example:
//    val x: Double = 5.123
//
//    difference between double and float is the size in memory
//    Float is a single-precision 32-bit floating-point number with approximately 6-7 decimal digits of precision.
//    Double is a double-precision 64-bit floating-point number with approximately 15-16 decimal digits of precision.
//    if we have more bits available that means we can model more accurate numbers but if you don't need more accurate numbers use float as it requires less memory or ram
//
//    var is a keyword used to declare a mutable variable. This means that once a variable is declared with var, its value can be changed later in the program.
//
//    the Boolean type represents logical values that can be either true or false
//
//    a string is a sequence of characters and is treated as an object of the String class. Strings are immutable, meaning their value cannot be changed after creation.
//
//    you can convert a string into an Int by using .toInt


//    TODO Arithmetic Operators
//
//    + (Addition): Adds two values together.
//    - (Subtraction): Subtracts the second value from the first.
//    * (Multiplication): Multiplies two values.
//    / (Division): Divides the first value by the second.
//    % (Modulus): Returns the remainder of the division.
//
//    ++ (Increment): Increases the value of a variable by 1.
//    -- (Decrement): Decreases the value of a variable by 1.
//    example x++ is used to increase by 1 and x-- is decrease by 1
//
//    Augmented Assignment Operators:
//
//    += is used to add numbers to existing numbers and assign the result
//    example :
//    var x = 11
//    val y = 9,
//    x += 5
//    x + y is the result so it will 25
//    -=, /=, *= do the exact same thing just with different arithmetic operators

//    %=:
//    Calculates the modulus of the left operand by the right operand and assigns the result to the left operand.

//    TODO Comparison Operators
//
//    they are used to compare two values and return a Boolean result (true or false). These operators include:
//
//    == (Equal to) is an operator used for comparing and checks if the values of two objects are the same. it can either be true or false
//    != (Not equal to): Checks if two values are not equal.
//    example if (inputasInteger != null )
//
//    For Non-primitive types such as String, Array, List, custom classes, equals() method is used for == and !=
//    For Primitive-like types such as Int, Double, Boolean, Char, Float, both directly compares their values.
//
//    > (Greater than): Checks if the first value is greater than the second.
//    < (Less than): Checks if the first value is less than the second.
//    For non-primitive types, it calls the compareTo() method for > and <
//
//    >= (Greater than or equal to): Checks if the first value is greater than or equal to the second.
//    <= (Less than or equal to): Checks if the first value is less than or equal to the second.
//    For non-primitive types, both calls the compareTo() method.

//    TODO String Templates
//
//    they allow embedding expressions within strings. These expressions are evaluated, and their results are concatenated into the string.
//
//    Variable Substitution: Use a dollar sign $ followed by a variable name.
//    example: val name = "Alice"; println("Hello, $name!") will print "Hello, Alice!".
//
//    Arbitrary Expressions: Enclose more complex expressions within curly braces {} preceded by a dollar sign $.
//    example
//    val a = 5;
//    val b = 10; println("The sum is ${a + b}") will print "The sum is 15".
//    You can even call methods within these expressions, such as println("The length of 'hello' is ${"hello".length}").
//
//    String Literals such as Escaped Strings: Declared using double quotes ("). They can contain escape characters like \n for a new line or \t for a tab.
//
//
//    Kotlin provides three main logical operators:
//
//    && (AND): Returns true if both operands are true; otherwise, it returns false meaning if the left operand is false, the right operand is not evaluated.
//    example: val areBothEven = x % 2 == 0 && y % 2 == 0
//
//    || (OR): Returns true if at least one of the operands is true. It returns false when both operands are false. if the left operand is true, the right operand of || is not evaluated.
//
//    ! (Logical NOT): Returns true if the operand is false, and false if the operand is true. It reverses the boolean value of an expression.


//
//    Addition Notes:
//
//    Kotlin also has non-short-circuiting versions of AND (and) and OR (or). They evaluate both operands, regardless of the outcome of the first one.
//
//    These logical operators are crucial in control flow statements like if, when, and loops, where they help create complex conditions for decision-making.
//
//    The not() function can also be used as an alternative to !, but the operator is generally preferred.


//    Todo Exceptions
//
//    An exception in Kotlin is an event that disrupts the normal flow of a program during its execution. It signals that something unexpected has occurred.
//    Exceptions are a way for programs to handle errors gracefully, preventing crashes and allowing for recovery or controlled shutdown.
//
//    Exceptions are handled using a try-catch block. The code that might throw an exception is placed inside the try block, and the code to handle the exception is placed inside the catch block.
//
//    if you write catch(e : NumberFormatException) instead of just Exception in the code block...then it will only catch this specific type of exception instead of all of them.
//
//    Here are some of the common exceptions in Kotlin:
//
//    ArithmeticException: Thrown for arithmetic errors like division by zero.
//
//    ArrayIndexOutOfBoundsException: (or IndexOutOfBoundsException): Thrown when trying to access an invalid index in an array or list.
//
//    IllegalArgumentException: Indicates that a method has received an illegal or inappropriate argument.
//
//    NumberFormatException: Thrown when attempting to convert a string to a numeric type, but the string is not in the correct format.
//
//    NullPointerException: Occurs when an object reference that has a null value is accessed. Kotlin's null safety features minimize this, but it can still happen with the !! operator.
//
//    NoSuchElementException: Thrown when trying to access an element that does not exist in a collection, such as with first() or last() on an empty list.
//
//    IllegalStateException: Indicates that a method has been called at an illegal or inappropriate time.
//
//    ClassCastException: Thrown when there is an attempt to cast an object to a class of which it is not an instance.
//
//    IOException: A checked exception that happens during I/O input/output operations.
//
//    SocketException: Signals an error occurred when the socket was being created or accessed.
//
//    SQLException: Signals that an error occurred during database access.
//
//    All exception classes in Kotlin are descendants of the Throwable class. You can create your own custom exceptions by extending the Exception class.
//
//    You can handle exceptions using try/catch blocks or with the runCatching function, which provides a more functional approach to error handling.
//
//    the try-catch block is used for exception handling and allows you to gracefully handle potential errors that may occur during the execution of your code.
//
//    example:
//    try {
//        // Code that might throw an exception
//    } catch (e: ExceptionType)
//    {
//        // Code to handle the exception of type ExceptionType
//    } finally {
//        // Optional block that always executes, regardless of whether an exception occurred
//        }


//    TODO Nullability
//
//    null represents the absence of a value .Kotlin's type system distinguishes between nullable and non-nullable types to enhance null safety and prevent NullPointerException errors.
//
//    Todo Nullable Types:
//
//    Declared by appending a question mark ? to the type (e.g., String?).
//
//    Can hold either a value of the specified type or null.
//
//    Todo Non -nullable Types :
//
//    Declared without a question mark(e.g., String).
//
//    Cannot hold null values, ensuring compile-time safety.
//
//    Null Safety Mechanisms:

//    Safe Call Operator?. Accesses members or methods only if the variable is not null; otherwise, it returns null.
//    example input . toIntOrNull ()?.inc() which will increment the value you input by 1 and can only be executed if what comes before it is not null
//    if it is null then the whole value will be null
//
//    When a type is followed by a question mark, such as String? or Int?, it indicates that variables or properties of that type can hold either a value of the specified type or null.
//    example: var name: String? = "Kotlin" declares a nullable string variable that can hold the value "Kotlin" or later be assigned null.
//
//    Elvis Operator ?::Provides a default value if the left -hand side is null.
//    example : val inputAsInteger = input.toIntOrNull() ?: 0
//
//
//    Non - nullable types doesn't allow the assignment of null to variables of that type. This contrasts with nullable types, which can hold a value or be set to null.
//    Non - nullable types help prevent NullReferenceException errors by ensuring variables always have a valid value .
//
//
//    let Function : Executes a block of code only if the variable is not null.
//
//    !!Operator: Forces a non-null assertion; throws a NullPointerException if the value is null(use with caution).
//    !!can be used on values that could be null aka non existent but if it is nonexistent then it will throw a NullPointerException it is very discouraged to use this operator .
//    example : val isEven = inputasinteger!! % 2 == 0
//
//
//    toIntOrNull() is a function that tries to convert a string to an integer. if it's successful it returns the integer. if it's not, it returns null.
//    This function is useful for avoiding NumberFormatException errors that can occur when using toInt().
//    example: val inputasInteger = input.toIntorNull()
//
//    ? says it may be an integer but it may be null
//    there's a difference for a type to be equal to null and equal to zero. null means empty
//
//    if statements are used to evaluate a boolean expression and executes a block of code if the expression is true.
//    example: if(inputAsInteger != null){
//    } else
//    {
//        Code to execute if condition is false
//    }
//
//    when is a versatile conditional expression that provides a more easy and readable way to handle multiple conditional branches than if statements
//    example: val output = when {
//        input % 2 == 0
//    } -> "The number is even!"
//    input < 10 -> "the number is odd and less than 10"
//    else -> "the number is odd and at least 11" instead of all of those if statements
//
//    a range represents a sequence of values defined by a start and an end point . Ranges are inclusive, meaning both the start and end values are part of the range .
//    example :  val range = 1..5 // Represents 1, 2, 3, 4, 5
//
//    in can be used to check if the number is within the range of two numbers
//    example in 10..20


//    todo Arrays
//
//    arrays are ordered collections of elements of the same type.They are fixed - size data structures, meaning their size cannot be changed after creation.
//    example : val numbers = arrayOf(1, 2, 3, 4, 5)
//    val names = arrayOf("Alice", "Bob", "Charlie")
//
//
//    intArrayOf() is a top-level function used to create an IntArray which is a specialized array designed to store primitive integer values efficiently, avoiding the boxing overhead that occurs when using Array<Int>.
//    IntArray stores primitive int values directly leading to better performance and memory efficiency compared to Array<Int> which stores boxed Integer objects.
//    example :
//    val favoriteNumbers = intArrayOf(1, 2, 3, 69)
//    println(favoriteNumbers[0])
//    favoriteNumbers[0] indexes start at 0 so this would be the first number in the array.with favoriteNumbers . getOrNull (4)...if this index doesn't exist it will return null instead of throwing an exception
//
//    //filters out odd numbers
//    val numbers: IntArray = intArrayOf(1, 2, 3, 69)
//    val evenNumbers = numbers.filter { it % 2 == 0 }
//
//    getOrNull() is an extension function that provides a way to get whatever the index is or returns null if it is invalid or empty, instead of throwing an exception.
//    example:
//    val outOfBoundsElement = myList.getOrNull(5)
//
//    toIntOrNull() is an extension function available on String that attempts to parse the string as an Int number.
//    example:
//    val largeNumberString = "2147483648"
//    val number1 = largeNumberString.toIntOrNull()
//    println(number1)
//
//    if (inputAsInteger != null && inputasInteger < favoriteNumbers.size)
//    {
//    println("Your number is ${favoriteNumbers[inputAsInteger]}")
//    this checks if inputAsinteger is not null and the input is less than the size of the array which is the number of elements in a array which is 4 in intArrayOf(1, 2, 3, 69)
//
//    if (inputAsInteger != null && inputasInteger in 0..favoriteNumbers.lastIndex) {
//    println("Your number is ${favoriteNumbers[inputAsInteger]}")
//    checks if the input is at least 0. lastIndex returns the index of the last element
//
//    all standard arrays are immutable in terms of the numbers staying the same but you can add numbers like this + 5
//
//
//    todo Loops
//    loops are used when you want a shortcut to doing certain things repetitively
//    Kotlin offers several types of loops to control the repeated execution of code blocks :

//    todo While loop
//    these loops repeatedly executes a block of code as long as or while a specified Boolean condition remains true.
//    example:
//    println("How many numbers will you enter?" )
//    val amountOfNumbers = readln.toIntorNull() ?: 0
//    sum = 0
//    var i = 0
//    while (i < amountOfNumbers)
//    {
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//
//        continue: Skips the rest of the current iteration and proceeds to the next iteration of the innermost loop.
//        skipping invalid numbers and until you enter a valid one
//
//                sum += number
//        i++
//    }
//    println("the total sum is $sum")

//    contentToString() for Arrays:
//    This function iterates through the elements of the array and creates a string representation of those elements similar to how a List would be represented.

//    contentToString() for Arrays:
//    println(numbers.toString())          // Output: [I@someHashCode (e.g., [I@7852e922)
//    println(numbers.contentToString())   // Output: [1, 2, 3]


//    example: println("How many numbers will you enter?" )
//    val amountOfNumbers = readln.toIntorNull() ?: 0
//    var numbers = intArrayOf()
//    var i = 0
//    while (i < amountOfNumbers)
//    {
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//        numbers += number
//        i++
//    }
//    println("Numbers: ${numbers.contentToString()}")
//
//

//    how to add more elements to array list without needing to recreate it
//    example: println("How many numbers will you enter?" )
//    val amountOfNumbers = readln.toIntorNull() ?: 0
//    val numbers = mutableListOf<Int>()
//    var i = 0
//    while (i < amountOfNumbers)
//    {
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//        numbers.add(number)
//        i++
//    }
//    println("Numbers: $numbers")
//
//    todo For loop
//
//    these loops are Used for iterating over ranges, arrays, lists, and other objects that provide an iterator and focus on iteration over collections and ranges.
//    these are more concise than while loops
//    we start counting from the 0 index in loops
//
//    example: for (i in 1..5)
//    {
//        println(i)
//    }
//
//    example 2 : for (item in collection)
//    {
//        // code to execute for each item
//    }
//
//    Iterating through an Array or List.
//
//    val fruits = arrayOf("Apple", "Banana", "Cherry")
//    for (fruit in fruits)
//    {
//        println(fruit)
//    }
//
//    val numbers = listOf(10, 20, 30)
//    for (num in numbers)
//    {
//        println(num)
//    }
//
//    Iterating with index
//
//    val colors = listOf("Red", "Green", "Blue")
//    for (index in colors.indices)
//    {
//        println("Color at index $index is ${colors[index]}")
//    }
//    for ((index, value ) in colors.withIndex())
//    {
//        println("Color at index $index is $value")
//    }
//
//
//    Iterating through a Map.
//
//    val ages = mapOf("Alice" to 30, "Bob" to 25)
//    for ((name, age) in ages)
//    {
//        println("$name is $age years old")
//    }
//
//    Iterating through a Range.
//
//    for (i in 1..5)
//    { // Includes 5
//        println(i)
//    }

//    for (i in 1 until 5)
//    { // Excludes 5
//        println(i)
//    }
//
//    for (i in 5 downTo 1)
//    { // Iterates in reverse
//        println(i)
//    }
//
//    for (i in 1..10 step 2)
//    { // Iterates with a step
//        println(i)
//    }


//
//    todo do -while loop:
//    Similar to the while loop, but guarantees that the code block will be executed at least once before the condition is checked.
//
//    var input: String
//    do {
//        print("Enter 'exit' to quit: ")
//        input = readLine() ?: ""
//        println("You entered: $input")
//    } while (input != "exit")
//
//
//    todo repeat function:
//    A convenient way to execute a block of code a fixed number of times .
//
//    repeat(3)
//    {
//        println("Hello!")
//    }
//
//    // Accessing the iteration index
//    repeat(3)
//    {
//        index ->
//        println("Iteration ${index + 1}")
//    }
//
//
//    todo Functions
//    a function is a block of code designed to perform a specific task. Functions are declared using the fun keyword.
//    example: println("Enter a string:")
//    val input = readln()
//    reversed(input) pass the input through the string in the function below
//    fun reversed(string: String) {
//        which string you want to reverse can differ so we need a way to pass the string we want to reverse to this function
//    }
//
//    a parameter is a placeholder defined in a function's signature that allows the function to accept input values when it is called
//    example :
//    fun functionName(parameter1: Type1, parameter2: Type2): ReturnType {
//        // Function body }
//        return result

//    the return keyword is necessary in functions with a block body when the function is declared to return a non-Unit type.
//
//
//    todo Extension Function
//
//    Built in extension functions extend the functionality of existing classes without requiring inheritance or modification of the original class.
//    example: input.toIntorNull() with input being the string type class
//
//    These functions are part of the Kotlin Standard Library and are available for various types, including collections, strings, numbers, and more.
//
//
//    Custom extension functions allow the addition of new functionality to an existing
//    class without modifying its source code or resorting to inheritance.
//    example:
//    val myString = "hello world"
//    val capitalizedString = myString.capitalizeFirstLetter() // Calls the extension function
//    println(capitalizedString) // Output: Hello world
//
//    fun String.capitalizeFirstLetter(): String {  //String declares an extension function named reverse for the String class.
//        Inside the extension function, the this keyword references whatever type (string, int ect) that we called this function on.
//    }


//    how to reference the string we call this keyword on since this can be multiple things without specifying
//    example
//    fun String.reversed(): String {
//        append(this@reversed[i])
//    }
//
//
//
//    Function overloading allows defining multiple functions within the same scope that share the same name but differ in their parameter lists.
//    The compiler distinguishes between these overloaded functions based on the number, types, and order of their parameters.
//    This enables the same function name to be used for operations that handle different input types.
//
//    example: example:
//    fun printMessage(message: String) {
//        println("String message: $message")
//    }
//
//    fun printMessage(message: String, count: Int) {
//        for (i in 1..count) {
//            println("Repeated message: $message")
//        }
//    }
//
//    fun main() {
//        printMessage("Hello") // Calls the first overload
//        printMessage("World", 3) // Calls the second overload
//    }
//
//    fun ClassName.functionName(parameters): ReturnType {
//        // function body
//    }
//
//
//
//    todo Lamba functions
//
//    a lambda expression is a concise way to define an anonymous function, meaning a function without a name.
//
//    It is a fundamental concept in functional programming and is widely used in Kotlin for its expressiveness and ability to reduce boilerplate code.
//
//    Anonymous:
//
//    They do not have a declared name like regular functions defined with the fun keyword.
//
//    Treatable as values:
//
//    Lambdas can be assigned to variables, passed as arguments to other functions (higher-order functions), and returned from functions, just like any other data type.
//
//    Concise syntax:
//
//    They are enclosed in curly braces {}. Parameters (if any) are declared inside the braces, followed by an arrow ->, and then the body of the lambda.
//
//    Implicit return:
//
//    If the lambda's return type is not Unit (Kotlin's equivalent of void), the value of the last expression in the lambda body is implicitly returned.
//
//    Trailing lambda syntax:
//
//    When a lambda is the last argument to a function, it can be placed outside the parentheses of the function call, leading to more readable code.
//
//    Example:
//
//    // A lambda assigned to a variable
//    val sum: (Int, Int) -> Int = { x, y -> x + y }
//
//    // Calling the lambda
//    val result = sum(5, 3) // result will be 8
//
//    // Passing a lambda as a trailing lambda to a higher-order function like 'forEach'
//    val numbers = listOf(1, 2, 3)
//    numbers.forEach
//    {
//        number ->
//        println(number * 2) // Prints 2, 4, 6
//    }


//    Lambda expressions are particularly useful for tasks such as event handling, collections manipulation (e.g., filter, map, forEach), and creating custom control flow structures.
//
//    the filter() function is used to create a new collection containing only the elements from an original collection that satisfy a given condition.
//
//    example:
//    val input = readln()
//    val lettersOnly = input.filter {
//        it.isLetter() this acts as a boolean and returns true if the character is a letter, and false otherwise.
//
//    filters out all letter in an input


//    val lambda: (Char) -> Boolean = {
//    how to define lamda manually and save it in a variable
//        it.isLetter()
//    This condition is defined by a predicate, which is a lambda function that takes an element of the collection as an argument and returns a Boolean value.
//    If this predicate returns true for an element, that element is included in the new filtered collection; otherwise, it is excluded.
//    }

//    val lettersOnly = input.filter(lambda)
//    as you can see above you can save the lambda as a parameter in a variable

//    val lettersOnly =
//        input.filter { currentCharacter ->  //how to give input parameters to these characters a name
//            -> is when the actual body of the lambda fun begins and we can't use it anymore since we have the explicit name currentCharacter
//            currentCharacter.isLetter()
//            if the lamda only takes a single parameter you can use it and if it takes multiple you can use currentCharacter

//    val lettersOnly = input.myFilter {
//        it.isLetter()
//    }

//    fun String.myFilter(predicate: (Char) -> Boolean): String{
//        //calls myFilter on a string then take in the character as the input then needs to return a boolean so whether to keep this character or not then define result as a string
//        return buildString {
//            for (char in this@myFilter){
//                if (predicate(char)){
//                   append(char)
//                    //if character returns true we want to append this character which means keep
//                }
//            }
//
//        }
//    }
//    how make a custom fun that filters a string


//    todo Classes
//    a class serves as a blueprint or template for creating objects.

//    example :
//    val rect1: Person(
//    name = "ks",
//    age = 3
//    )
//    println(rect1.name)
//    println(rect1.age)
//    class Person(val name: String, var age: Int)

//    abstract classes are about the same thing as interface but you need to have a empty constructor when defining data classes
//
//    in most cases you have to use an interface but if you need a class to have internal state and be inheritable then you use abstract class


//    todo Visibility Modifiers
//    it is used control the accessibility of declarations (classes, objects, interfaces, constructors, functions, properties, and their setters):
//
//    public :
//    This is the default visibility that is  visible everywhere which means they can be accessed from any code that can see the declaring entity.
//
//    private :
//    This restricts visibility to within that class only, including all its members.
//    For top-level declarations (outside of any class), private restricts visibility to within the file where the declaration is made.
//
//    protected :
//    This modifier is applicable only to members within a class.
//    protected members are visible within the declaring class and its subclasses. They are not accessible from outside the class hierarchy.
//
//    internal :
//    internal restricts visibility to within the same module.
//    A module is a set of Kotlin files compiled together, such as a Maven project, a Gradle source set, or an IntelliJ IDEA module. This modifier is useful for encapsulating code within a specific module, preventing access from other modules.

// todo Data Class

//    these are is a special type of class primarily designed to hold data .
//
//    Its main purpose is to reduce boilerplate code associated with creating classes that simply store information

//    By using data class, developers can write more concise and readable code when dealing with data -holding classes, as they don't need to manually implement the common utility methods that are often required.
//
//
//    data class comparisons will instead compare the classes by fields.
//
//    When you declare a class as a data class using the data keyword, the Kotlin compiler automatically generates several useful methods based on the properties defined in its primary constructor.
//    These methods include:
//    equals(): For structural equality comparison (comparing the values of properties, not justobject references).
//    hashCode(): Consistent with equals(), used in hash-based collections.
//    toString(): Provides a readable string representation of the object, showing its properties and their values (e.g., User(name=John, age=30)).

//    copy(): Creates a new instance of the data class, allowing you to easily modify specific properties while keeping others the same.
//    example :
//    data class User(val name: String, val age: Int)
//
//    fun main() {
//        val originalUser = User("Alice", 30)
//
//        // Create a copy with a modified age
//        val updatedUser = originalUser.copy(age = 31)
//
//        println("Original User: $originalUser") // Output: Original User: User(name=Alice, age=30)
//        println("Updated User: $updatedUser")   // Output: Updated User: User(name=Alice, age=31)
//    }


//    todo Interface
//
//    an interface serves as a contract , defining a set of abstract methods and properties that implementing classes must adhere to.
//
//    interface can be used to allow any type of shape to be used in a function
//
//    example:
//    interface Shape {
//        val area: Float
//        val circumference: Float
//    }




    //
    //
    //
    //
    //generics enable the creation of flexible, reusable, and type-safe code by allowing classes, interfaces, and functions to operate on types specified at a later time. This eliminates the need to write separate implementations for different data types while maintaining compile-time type safety.
    //
    //Generics utilize type parameters, typically represented by a single uppercase letter like T (for Type), enclosed in angle brackets < >. These parameters act as placeholders for the actual types that will be used when an instance of a generic class or function is created or invoked.
    //
    //example:
    //    class Box<T>(val content: T) // Generic class with type parameter T
    //    fun <T> printContent(content: T) // Generic function with type parameter T
    //
    //in (Contravariance): Indicates that a type parameter is an "input" type, meaning it can only be consumed (e.g., as a function parameter).
    //out (Covariance): Indicates that a type parameter is an "output" type, meaning it can only be produced (e.g., as a function return type).
}
