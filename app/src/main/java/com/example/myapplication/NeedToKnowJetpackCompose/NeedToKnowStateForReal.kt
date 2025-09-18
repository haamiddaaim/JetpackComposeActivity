package com.example.myapplication.NeedToKnowJetpackCompose

// todo State

//    state refers to any data that can change over time and that the UI should react to.
//    When state changes, Compose automatically recomposes (re-executes) the affected composable functions with the new state, updating the UI to reflect the change.

//    example:
//    var count = mutablestateOf(0) //how to declare state



//    todo Key aspects of state in Jetpack Compose:

//    MutableState is at the core of state management in Compose

//    This is an observable type that holds a value and notifies Compose when its value changes, triggering recomposition.
//
//    You create a MutableState using mutableStateOf(value ).

//    todo remember and rememberSaveable:

//    remember stores an object in the Composition and preserves it across recompositions, but it does not survive configuration changes (like screen rotation).

//    rememberSaveable is similar to remember but also saves the state across configuration changes by utilizing a Bundle.

//    example:
//    var count by remember {
//        mutableStateOf(0)
//    }

//





//    @Composable
//    fun CounterScreen() {
//        // Creates a mutable state variable 'count' initialized to 0.
//        // 'remember' ensures 'count' persists across recompositions.
//        var count by remember { mutableStateOf(0) }
//
//        Column {
//            Text(text = "Count: $count")
//            Button(onClick = { count++ }) { // Modifying 'count' triggers recomposition
//                Text("Increase Count")
//            }
//        }
//    }


//    todo Mutable vs Immutable State

//    Mutable State refers to data that can be changed after its creation. In Compose, this is typically managed using MutableState<T> (e.g., mutableStateOf(value )), SnapshotStateList, or SnapshotStateMap.
//
//    Recomposition:
//    When a MutableState object's value changes, Compose automatically detects this change and triggers a recomposition of the composables that are observing that state. This ensures the UI updates to reflect the new data.
//
//    Usage:
//    Useful for UI-specific data that changes frequently, such as text input, selected items, or toggle states.



//    Immutable State refers to data that cannot be changed after its creation. If a change is needed, a new instance of the data must be created with the updated values. This is common with data classes where all properties are val.
//
//    Recomposition:
//    Compose can efficiently skip recomposition for composables whose parameters are immutable and have not changed their reference.
//    If an immutable object is passed as a parameter and its reference remains the same, Compose knows that the content of the object also remains the same, thus avoiding unnecessary recompositions.
//
//    Usage:
//    Ideal for data that represents a fixed set of information or configuration, such as user profiles, product details, or static lists. It also promotes cleaner code and easier debugging due to predictable data flow.



//    Key Differences and Implications:
//
//    Observability:
//    Mutable state objects are observable by Compose, meaning changes to their values are automatically tracked. Immutable objects, on the other hand, are not inherently observable; changes require creating a new instance.
//
//    Performance:
//    Immutable objects can lead to better performance by allowing Compose to skip recompositions when their values haven't changed. Mutable objects, while necessary for dynamic UI, can sometimes lead to more frequent recompositions if not managed carefully.
//
//    Data Flow:
//    Immutable state encourages a unidirectional data flow, where new state is always derived from previous state, promoting clarity and predictability. Mutable state, while convenient, can sometimes lead to more complex state management if not handled with discipline.
//



//    todo State Hoisting:

//    State hoisting in Jetpack Compose is a design pattern where the UI state is moved from a composable function to its calling parent. This process transforms a stateful composable into a stateless one, improving reusability, testability, and state management.
//
//    Event Handling:
//    When the stateless composable needs to request a state change (e.g., a button click), it exposes a lambda function (event callback) as a parameter.
//
//    Parent Manages State:
//    The parent composable, which holds the actual state, passes the state down to the child and handles the events triggered by the child, updating the state accordingly.
//
//    Benefits of State Hoisting:
//
//    Improved Reusability:
//    Stateless composables are independent of specific state implementations, making them easily reusable across different parts of the application.
//
//    Enhanced Testability:
//    Testing stateless composables becomes simpler as their behavior is solely determined by the input parameters, eliminating the need to mock internal state.
//
//    Centralized State Management:
//    State is managed at a higher level in the composable hierarchy, promoting a single source of truth and simplifying state flow.
//
//    Reduced Complexity:
//    By separating concerns (UI presentation from state management), the individual composables become more focused and easier to understand.

//    Unidirectional Data Flow (UDF):
//    Compose encourages UDF, where state flows down from a state holder to composables, and events (like user interactions) flow up from composables to the state holder to update the state.




//    todo Stateful vs Stateless


//    Stateful Composables:
//
//    A stateful composable manages its own internal state, typically using remember or rememberSaveable to store mutable data .
//    It is responsible for both holding and modifying this state.
//
//    Advantages: Can be convenient for self-contained components where the state is localized and doesn't need to be controlled externally.
//
//    Disadvantages: Less reusable and harder to test because their behavior is tied to their internal state. External control or manipulation of their state is difficult.



//
//    Stateless Composables:
//
//    A stateless composable does not manage any internal state. Instead, it receives its state as parameters from its caller.
//    It also typically exposes callbacks (e.g., lambda functions) to inform its caller about events that might require state changes.
//
//    Advantages: Highly reusable and easier to test because their behavior is solely determined by the input parameters. State management is delegated to a higher-level composable or a state holder like a ViewModel.
//
//    Disadvantages: Requires more explicit state management by the caller, which can sometimes involve "state hoisting" – moving the state to a common ancestor.




//    example: Stateful
//
//    @Composable
//    fun StatefulCounter() {
//        var count by remember { mutableStateOf(0) }
//        Column {
//            Text("Count: $count")
//            Button(onClick = { count++ }) {
//                Text("Increment")
//            }
//        }
//    }
//
//
//    example: Stateless
//
//    @Composable
//    fun StatelessCounter(count: Int, onIncrement: () -> Unit) {
//        Column {
//            Text("Count: $count")
//            Button(onClick = onIncrement) {
//                Text("Increment")
//            }
//        }
//    }
//
//    @Composable
//    fun ParentScreen() {
//        var count by remember { mutableStateOf(0) }
//        StatelessCounter(count = count, onIncrement = { count++ })
//    }


//    todo MVI vs MVVM
//
//    Both MVVM (Model-View-ViewModel) and MVI (Model-View-Intent) are architectural patterns suitable for use with Jetpack Compose, each with distinct advantages.


//    MVVM (Model-View-ViewModel):
//
//    Structure:
//    The View (Compose UI) observes data exposed by the ViewModel.
//    User interactions in the View trigger calls to methods in the ViewModel, which then interacts with the Model (data layer). The ViewModel updates the data, and the View reacts to these changes.

//    Strengths:
//
//    Familiarity for developers experienced with traditional Android development.
//
//    Often simpler to implement for less complex applications.
//
//    Supports a more direct mapping of UI elements to ViewModel properties.
//
//    Considerations:
//
//    Can lead to "fat" ViewModels if not carefully managed, especially with numerous state properties.






//    MVI (Model-View-Intent):
//
//    Emphasizes a unidirectional data flow and a single, immutable state object.
//    User interactions are represented as "Intents" which are sent to a "Processor" or "Reducer." This processor then updates the single state object, and the View renders based on this updated state.
//
//    Strengths:
//
//    Provides a clearer, more predictable state management, especially in complex UIs.
//
//    Enhances testability due to the immutable state and explicit intent handling.
//
//    Aligns well with the reactive and declarative nature of Jetpack Compose.
//
//    Considerations:
//
//    Can introduce more boilerplate code, and the concept of intents and state reducers might have a steeper learning curve for some.



//    todo Choosing between MVVM and MVI in Jetpack Compose:
//
//    Complexity: For simpler applications with straightforward UI updates, MVVM can be a more efficient choice.
//    For complex applications with intricate state management, numerous user interactions, and a strong need for predictability and testability, MVI offers a more robust solution.
//
//    Team Familiarity: Consider the team's experience and comfort level with each pattern.
//
//    Scalability: MVI's structured approach often lends itself better to large, scalable applications.
