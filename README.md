# AppiumCalcTest
# Appium Calculator Testing

This project demonstrates automated testing of a calculator app using Appium and Selenium WebDriver.

## Prerequisites

Before running the tests, ensure you have the following installed:

- Java Development Kit (JDK)
- Android Studio (for Android emulator)
- Appium
- Selenium WebDriver
- Appium Desktop or CLI

## Setup

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/singhroshnni/AppiumCalcTest.git
    ```

2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

3. Install any required dependencies using Maven or Gradle.

4. Start the Appium server either through the Appium Desktop application or via the command line.

## Running the Test

1. Ensure your Android emulator (with the calculator app installed) is running.

2. Run the `AppiumCalcTest` class as a Java application.

3. The test will execute, and you'll see the test result printed in the console.

## Test Scenario

The test scenario in `AppiumCalcTest` performs the following steps:

1. Launches the calculator app.
2. Clicks on the digits '80'.
3. Clicks on the '+' operator.
4. Clicks on the digits '25'.
5. Clicks on the '=' button.
6. Verifies if the result is '105'.

## Troubleshooting

- If you encounter any issues with the setup or running the tests, please refer to the troubleshooting section in the Appium documentation.
- Make sure the device emulator is properly configured and matches the capabilities set in the test script.

