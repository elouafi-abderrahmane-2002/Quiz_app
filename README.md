# Quiz App
<h1 align="center">
  <a>
    <img height="120" src="https://github.com/user-attachments/assets/bd41c383-c04b-451c-bc6f-9d26b20ab8f1" alt="QuizApp" style="max-width: 300px; border-radius: 10px;">
  </a>
</h1>

## Video Demo 
https://github.com/user-attachments/assets/39ddc4da-67de-42a3-bdd5-c1ee3b90956f

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

![login](https://github.com/user-attachments/assets/dea67caf-7ed7-49e9-9679-efc0e4279ab3)

### RegisterActivity
- Allows new users to create an account
- Validates user input
  
![register](https://github.com/user-attachments/assets/3ab8980c-8b27-4785-800d-599c2ee46840)
### QuizActivity
- Main quiz interface
- Displays question with 4 options
- 1-minute timer for each question
- Handles question navigation with animation
- Tracks user score
  
![quiz](https://github.com/user-attachments/assets/130e4b2c-5318-4f50-bc75-88237700400c)
### ScoreActivity
- Displays final quiz score
- Provides option to retry quiz or logout
  
![score](https://github.com/user-attachments/assets/04d61473-0dab-4a30-a282-fcd7e0deaca0)


### Firebase Integration
- Firebase is used for user authentication and storing the quiz scores.
- The app communicates with Firebase to create and authenticate users and record their quiz scores.
  
![image](https://github.com/user-attachments/assets/94742128-5edd-4811-a038-1edb0f7b6e9d)

![image](https://github.com/user-attachments/assets/4f76c440-1f02-47b3-b311-fd229eadaa67)

## Acknowledgements
This project was developed as part of the Mobile Development module at ENSET Mohammedia under the supervision of Madame OUHMIDA.
