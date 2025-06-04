# Quiz App

## Description
The Quiz App is an Android application that allows users to take quizzes on various topics. It provides a seamless user experience with smooth transitions between different activity.

## Features
- User authentication (Login/Register) with Firebase
- Interactive quiz interface with 4 options per question
- 1-minute timer for each question
- Score tracking and display for each user
- Logout and retry button functionality
- Smooth animations between questions
- Responsive UI design

## Technology Used
- Java (Android SDK)
- XML for UI layout
- Gradle build system
- Android Animations
- Firebase for user authentication and score storage

## Project Structure
```
quiz_ap/
├ app/                  # Main application module
│   ├ src/
│   │   ├ main/         # Main source code and resource
│   │   │   ├ java/     # Java source file
│   │   │   ├ res/      # Resource (layout, drawable, etc.)
│   │   ├ androidTest/  # Instrumentation test
│   │   ├ test/         # Unit test
│   ├ build.gradle      # Module-level build configuration
├ gradle/               # Gradle wrapper file
├ build.gradle          # Project-level build configuration
├ setting.gradle        # Project setting
```

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/mreckah/QuizApp.git
   ```
2. Open the project in Android Studio
3. Build and run the project on an Android device or emulator

## Interface
### LoginActivity
- Handles user authentication
- Provides option to navigate to registration
- ![login.png](src%2Fmain%2Fres%2Fdrawable%2Flogin.png)
### RegisterActivity
- Allows new users to create an account
- Validates user input
![register.png](src%2Fmain%2Fres%2Fdrawable%2Fregister.png)
### QuizActivity
- Main quiz interface
- Displays question with 4 options
- 1-minute timer for each question
- Handles question navigation with animation
- Tracks user score
![quiz.png](src%2Fmain%2Fres%2Fdrawable%2Fquiz.png)
### ScoreActivity
- Displays final quiz score
- Provides option to retry quiz or logout
![score.png](src%2Fmain%2Fres%2Fdrawable%2Fscore.png)
