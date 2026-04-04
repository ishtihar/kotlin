# 12 Week Weekend Night Study Plan

This study plan is organized for weekend night learning across 12 weeks. The structure is divided into 3 months so you can focus on Kotlin basics first, then Jetpack Compose, and finally Android architecture and backend connectivity.

## Month 1: Kotlin Core Fundamentals

This month is for building a strong Kotlin base. You do not need Android Studio yet. Practice in Kotlin Playground or IntelliJ IDEA.

### Week 1: Syntax aur Control Flow

#### Friday Night (4 Hours)

**Hour 1-2**

- Learn variables: `val` and `var`
- Understand basic data types: `Int`, `String`, `Boolean`, `Double`
- Practice string templates and string formatting
- Write simple print-based examples

**Hour 3-4**

- Learn `if`, `if-else`, and nested conditions
- Understand Kotlin `when` expression
- Compare `when` with Java `switch`
- Solve small condition-based programs like grade checker or even-odd checker

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn loops: `for`, `while`, `do-while`
- Understand ranges and progressions
- Practice loop-based problems like tables, sums, and pattern basics

**Hour 3-4**

- Learn how to write functions
- Understand parameters, return types, and default arguments
- Practice by creating a basic calculator program

### Week 2: Object-Oriented Kotlin (OOPs)

#### Friday Night (4 Hours)

**Hour 1-2**

- Learn classes and objects
- Understand properties and methods
- Use `init` blocks and constructors
- Create small real-world classes like `Student` or `Car`

**Hour 3-4**

- Learn inheritance and method overriding
- Understand abstract classes
- Learn interfaces and when to use them
- Compare Java OOP style with Kotlin OOP style

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn data classes and why they are useful
- Understand generated methods like `toString`, `equals`, and `copy`
- Learn sealed classes for controlled state modeling

**Hour 3-4**

- Build a small text-based bank account management system
- Use classes, objects, and inheritance in practice

### Week 3: Null Safety aur Collections

#### Friday Night (4 Hours)

**Hour 1-2**

- Learn nullable and non-nullable types
- Understand safe calls `?.`
- Learn Elvis operator `?:`
- Practice null checks using small examples

**Hour 3-4**

- Learn arrays, lists, sets, and maps
- Understand mutable vs immutable collections
- Practice creating and accessing collection data

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn collection functions like `filter`, `map`, `groupBy`, and `forEach`
- Understand how Kotlin collections reduce repetitive code

**Hour 3-4**

- Practice with a list of objects such as products or students
- Filter, sort, and group data based on conditions

### Week 4: Advanced Kotlin Functions

#### Friday Night (4 Hours)

**Hour 1-2**

- Learn extension functions
- Understand how to add new functionality to existing classes

**Hour 3-4**

- Learn higher-order functions
- Understand lambdas and passing functions as arguments
- Practice custom sorting and transformation examples

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn scope functions: `let`, `run`, `with`, `apply`, `also`
- Understand when to use each one
- Practice writing cleaner and shorter Kotlin code

**Hour 3-4**

- Revise the full Month 1 syllabus
- Build one larger console-based Kotlin program without UI

## Month 2: Jetpack Compose

This month is for modern Android UI development. Start using Android Studio and Jetpack Compose.

### Week 5: Android Setup aur Compose Basics

#### Friday Night (4 Hours)

**Hour 1-2**

- Understand Android Studio interface
- Learn project structure
- Get a basic overview of Gradle and app build process

**Hour 3-4**

- Learn Jetpack Compose basics
- Understand `@Composable` functions
- Write your first simple composable screen

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn Compose layouts: `Row`, `Column`, `Box`
- Practice arranging UI elements on the screen

**Hour 3-4**

- Learn basic components: `Text`, `Button`, `TextField`, `Image`
- Build a small form-like screen

### Week 6: State Management aur Lists

#### Friday Night (4 Hours)

**Hour 1-2**

- Understand what state means in Compose
- Learn `remember` and `mutableStateOf`
- See how UI updates when state changes

**Hour 3-4**

- Learn state hoisting
- Understand how to move state to parent composables
- Make composables reusable and cleaner

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn `LazyColumn` and `LazyRow`
- Understand how Compose handles large lists efficiently

**Hour 3-4**

- Build a contact list screen with around 50 items
- Practice scrolling, reusable item UI, and state display

### Week 7: Navigation aur Theming

#### Friday Night (4 Hours)

**Hour 1-2**

- Learn Compose navigation
- Understand routes and navigation graph basics

**Hour 3-4**

- Pass arguments between screens
- Build two or three connected screens

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn Material 3 theming
- Understand colors, typography, and shapes
- Customize the app look

**Hour 3-4**

- Learn `Scaffold`
- Add top app bar and bottom navigation
- Organize a proper app screen layout

### Week 8: Project 1 - BMI Calculator App

#### Friday Night (4 Hours)

**Hour 1-4**

- Design the BMI calculator UI
- Add height and weight input fields
- Validate empty or invalid inputs
- Show warning messages properly

#### Saturday Night (4 Hours)

**Hour 1-4**

- Write BMI calculation logic
- Update UI based on state changes
- Show result clearly on screen
- Test the app on an emulator or phone

## Month 3: Advanced Architecture aur Backend Connectivity

This month focuses on professional Android app structure, async programming, network calls, and local storage.

### Week 9: Kotlin Coroutines

#### Friday Night (4 Hours)

**Hour 1-2**

- Understand coroutines and asynchronous programming
- Learn threading vs coroutines
- Understand `suspend` functions

**Hour 3-4**

- Learn coroutine builders like `launch` and `async`
- Understand dispatchers: `Main`, `IO`, `Default`
- Practice simple background task examples

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn structured concurrency
- Understand why `GlobalScope` should be avoided
- Learn `viewModelScope.launch`

**Hour 3-4**

- Simulate fake network delays
- Practice loading data asynchronously and updating the UI

### Week 10: App Architecture (MVVM)

#### Friday Night (4 Hours)

**Hour 1-2**

- Learn MVVM architecture
- Understand separation of UI and business logic
- Learn why architecture matters in large apps

**Hour 3-4**

- Create a `ViewModel`
- Understand how it survives configuration changes like rotation
- Move state logic out of the UI layer

#### Saturday Night (4 Hours)

**Hour 1-2**

- Learn `StateFlow` or `LiveData`
- Observe data from ViewModel in UI

**Hour 3-4**

- Learn the basics of dependency injection
- Understand Hilt or Dagger at a high level

### Week 11: Networking aur Local Database

#### Friday Night (4 Hours)

**Hour 1-3**

- Learn Retrofit
- Fetch real API data like weather, movie, or product data
- Understand request-response flow

**Hour 4**

- Learn JSON parsing
- Map API response to Kotlin data classes
- Use GSON or Moshi

#### Saturday Night (4 Hours)

**Hour 1-3**

- Learn Room Database
- Create entities and DAOs
- Save app data locally on the device

**Hour 4**

- Practice insert, delete, and read operations
- Connect database data to UI or ViewModel

### Week 12: Final Master Project - To-Do List App

#### Friday Night (4 Hours)

**Hour 1-4**

- Set up the final Task Master app
- Use MVVM architecture
- Configure Room Database
- Build UI for adding and deleting tasks using Jetpack Compose

#### Saturday Night (4 Hours)

**Hour 1-4**

- Load saved tasks from database through ViewModel
- Show tasks in `LazyColumn`
- Do debugging and fix final issues
- Complete the project and review what you learned

## Folder Usage

- Use each month folder to separate the learning stage
- Use each week folder to keep notes, code practice, and mini projects
- Add Kotlin files, screenshots, or project notes inside the matching week folder
